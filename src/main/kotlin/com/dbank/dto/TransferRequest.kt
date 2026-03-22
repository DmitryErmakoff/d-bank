package com.dbank.dto

import java.math.BigDecimal

data class TransferRequest(
    val fromAccountNumber: String,
    val toAccountNumber: String,
    val amount: BigDecimal,
    val currency: String = "RUB"
)