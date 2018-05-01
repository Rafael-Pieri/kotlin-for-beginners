package api.repository

import api.entity.FullParameters
import api.entity.HttpResponse
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

abstract class BaseRepository {

    /**
     * Faz a execução a chamada para a API
     * Todos os parâmetros são configurados dentro da classe FullParameters
     */
    fun execute(fullParameters: FullParameters): HttpResponse {

        val connection: HttpURLConnection
        val response: HttpResponse

        val url = URL(fullParameters.url + getQuery(fullParameters.parameters))

        connection = url.openConnection() as HttpURLConnection
        connection.readTimeout = 100000
        connection.connectTimeout = 120000
        connection.requestMethod = fullParameters.method.toString()

        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.setRequestProperty("charset", "utf-8")
        connection.useCaches = false

        connection.connect()

        response = if (connection.responseCode == 404) {
            HttpResponse(connection.responseCode, "")
        } else {
            val inputStream: InputStream = connection.inputStream
            HttpResponse(connection.responseCode, getStringFromInputStream(inputStream))
        }

        return response
    }

    /**
     * Faz a conversão do retorno do webservice para string
     */
    private fun getStringFromInputStream(inputStream: InputStream): String {
        return try {
            val strBuilder = StringBuilder()
            val br = BufferedReader(InputStreamReader(inputStream))

            for (line in br.readLines()) {
                strBuilder.append(line)
            }

            strBuilder.toString()

        } catch (e: Exception) {
            ""
        }
    }

    /**
     * Monta query
     * www.api.com/post?id=10&size=10&page=3
     */
    private fun getQuery(parameters: Map<String, String>): String {
        if (parameters.isEmpty())
            return ""

        val result = StringBuilder()
        var first = true

        for (param in parameters) {
            if (first) {
                result.append("?")
                first = false
            } else {
                result.append("&")
            }

            result.append(URLEncoder.encode(param.key, "UTF-8"))
            result.append("=")
            result.append(URLEncoder.encode(param.value, "UTF-8"))
        }

        return result.toString()
    }
}