package api.infra

class EndpointConstants private constructor() {

    object BASE {
        const val URL: String = "https://jsonplaceholder.typicode.com/"
    }

    object POST {
        const val ALL_POSTS: String = "posts"
        const val SINGLE_POST: String = "posts"
    }
}