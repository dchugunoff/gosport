package com.gosport.feature.cart.data

import com.gosport.core.data.coreDataModule
import org.koin.dsl.module

val cartDataModule = module {
    includes(coreDataModule)
}