package com.gosport.core.presentation

import com.gosport.core.data.coreDataModule
import com.gosport.core.domain.coreDomainModule
import org.koin.dsl.module

val coreModule = module {
    includes(coreDataModule, coreDomainModule)
}