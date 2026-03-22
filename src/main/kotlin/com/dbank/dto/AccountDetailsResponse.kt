package com.dbank.dto

import java.math.BigDecimal

data class AccountDetailsResponse(
    val id: Long,
    val accountNumber: String,
    val balance: BigDecimal,
    val currency: String,
    val status: String,
    val createdAt: String,
    val updatedAt: String
)