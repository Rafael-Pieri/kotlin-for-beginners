package api.repository

import api.entity.FullParameters
import api.entity.HttpResponse

/**
 * Repositóio oferece somente uma camada de comunicação entre a execução da API e da classe Business que faz o tratamento
 * */
class PostRepository private constructor() {

    companion object : BaseRepository() {

        /**
         * Carrega todos os posts
         */
        fun getAllPosts(fullParameters: FullParameters): HttpResponse {
            return super.execute(fullParameters)
        }

        /**
         * Carrega um único post
         */
        fun getSinglePost(fullParameters: FullParameters): HttpResponse {
            return super.execute(fullParameters)
        }
    }
}