package com.dbank.dto

import java.math.BigDecimal

data class BulkTransferResponse(
    val totalTransfers: Int,
    val successfulTransfers: Int,
    val failedTransfers: Int,
    val results: List<TransferResponse>,
    val totalAmountTransferred: BigDecimal,
    val currency: String
)