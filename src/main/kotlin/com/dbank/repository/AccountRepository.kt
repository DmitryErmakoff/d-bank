package com.dbank.repository

import com.dbank.entity.Account
import org.springframework.data.jpa.repository.JpaRepository


interface AccountRepository : JpaRepository<Account, Long> {

}