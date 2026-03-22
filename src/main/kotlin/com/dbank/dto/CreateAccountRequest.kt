package com.dbank.dto

import java.math.BigDecimal

data class CreateAccountRequest(
    val accountNumber: String,
    val initialBalance: BigDecimal = BigDecimal.ZERO,
    val currency: String = "RUB"
)

