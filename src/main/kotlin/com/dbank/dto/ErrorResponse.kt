package com.dbank.dto

data class ErrorResponse(
    val errorCode: String,
    val message: String,
    val timestamp: String,
    val path: String? = null,
    val details: Map<String, Any?>? = null
)