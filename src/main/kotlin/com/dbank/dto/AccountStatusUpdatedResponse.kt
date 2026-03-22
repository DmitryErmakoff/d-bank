package com.dbank.dto

data class AccountStatusUpdatedResponse(
    val accountNumber: String,
    val oldStatus: String,
    val newStatus: String,
    val updatedAt: String
)