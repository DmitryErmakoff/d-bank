package com.dbank.dto

import java.math.BigDecimal

data class AccountSummaryResponse(
    val id: Long,
    val accountNumber: String,
    val balance: BigDecimal,
    val currency: String,
    val status: String
)