package com.dbank.dto

import java.math.BigDecimal

data class BalanceResponse(
    val accountNumber: String,
    val balance: BigDecimal,
    val currency: String,
    val lastUpdated: String
)