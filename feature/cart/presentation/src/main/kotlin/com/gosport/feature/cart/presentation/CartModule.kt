package com.gosport.feature.cart.presentation

import com.gosport.feature.cart.data.cartDataModule
import com.gosport.feature.cart.domain.cartDomainModule
import org.koin.dsl.module

val cartModule = module {
    includes(cartDataModule, cartDomainModule)
}