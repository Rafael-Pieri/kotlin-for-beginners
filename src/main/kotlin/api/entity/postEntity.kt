package api.entity

data class PostEntity(
        val userId: Int,
        val id: Int,
        val title: String,
        val body: String
)