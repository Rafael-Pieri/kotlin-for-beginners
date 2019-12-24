package api.repository

import api.entity.FullParameters
import api.entity.HttpResponse

class PostRepository private constructor() {

    companion object : BaseRepository() {

        fun getAllPosts(fullParameters: FullParameters): HttpResponse {
            return super.execute(fullParameters)
        }

        fun getSinglePost(fullParameters: FullParameters): HttpResponse {
            return super.execute(fullParameters)
        }
    }
}