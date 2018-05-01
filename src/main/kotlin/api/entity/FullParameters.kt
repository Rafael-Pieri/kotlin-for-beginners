package api.entity

import api.infra.OperationMethod

data class FullParameters(
        val url: String,
        val method: OperationMethod,
        val parameters: Map<String, String> = emptyMap()
)