package com.dbank.dto

import java.math.BigDecimal

data class AccountsStatisticsResponse(
    val totalAccounts: Int,
    val activeAccounts: Int,
    val frozenAccounts: Int,
    val closedAccounts: Int,
    val totalBalance: Map<String, BigDecimal>,
    val averageBalance: Map<String, BigDecimal>
)