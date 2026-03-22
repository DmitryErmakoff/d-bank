package com.dbank.dto

data class AccountCreatedResponse(
    val id: Long,
    val accountNumber: String,
    val message: String,
    val createdAt: String
)