package api.business

import api.entity.FullParameters
import api.entity.HttpResponse
import api.entity.PostEntity
import api.infra.EndpointConstants
import api.infra.OperationMethod
import api.repository.PostRepository
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PostBusiness {

    fun getAllPosts(): List<PostEntity> {
        val url: String = EndpointConstants.BASE.URL + EndpointConstants.POST.ALL_POSTS
        val fullParameters = FullParameters(url, OperationMethod.GET)
        val response: HttpResponse = PostRepository.getAllPosts(fullParameters)

        return Gson().fromJson<List<PostEntity>>(response.jsonResponse, object : TypeToken<List<PostEntity>>() {}.type)
    }

    fun getSinglePost(id: Int): PostEntity {
        val url: String = EndpointConstants.BASE.URL + EndpointConstants.POST.SINGLE_POST
        val fullParameters = FullParameters(url, OperationMethod.GET, mapOf(Pair("id", id.toString())))
        val response: HttpResponse = PostRepository.getSinglePost(fullParameters)

        return Gson().fromJson<List<PostEntity>>(response.jsonResponse, object : TypeToken<List<PostEntity>>() {}.type)[0]
    }
}