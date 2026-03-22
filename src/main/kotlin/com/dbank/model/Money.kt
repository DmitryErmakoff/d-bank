package com.dbank.model

import jakarta.persistence.Embeddable
import java.math.BigDecimal

@Embeddable
data class Money(
    val amount: BigDecimal = BigDecimal.ZERO,
    val currency: String = "RUB",
) {
    init {
        require(amount >= BigDecimal.ZERO) { "Количество денег не может быть отрицательным числом" }
        require(currency.matches(Regex("^[A-Z]{3}$"))) { "Некоректный код валюты: $currency" }
    }

    operator fun plus(other: Money): Money {
        require(currency == other.currency) { "Не совпадение валют для операции сложения" }
        return Money(amount.plus(other.amount), currency)
    }

    operator fun minus(other: Money): Money {
        require(currency == other.currency) { "Не совпадение валют для операции разности" }
        require(amount > other.amount) { "На балансе недостаточно средств" }
        return Money(amount.minus(other.amount), currency)
    }
}