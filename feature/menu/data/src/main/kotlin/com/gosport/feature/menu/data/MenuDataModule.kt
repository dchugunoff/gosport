package com.gosport.feature.menu.data

import com.gosport.core.data.coreDataModule
import org.koin.dsl.module

val menuDataModule = module {
    includes(coreDataModule)
}