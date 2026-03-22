package com.dbank.dto

import com.dbank.enums.TransferStatus
import java.math.BigDecimal

data class TransferResponse(
    val transactionId: String,
    val fromAccountNumber: String,
    val toAccountNumber: String,
    val amount: BigDecimal,
    val currency: String,
    val fromAccountNewBalance: BigDecimal,
    val toAccountNewBalance: BigDecimal,
    val timestamp: String,
    val status: TransferStatus
)