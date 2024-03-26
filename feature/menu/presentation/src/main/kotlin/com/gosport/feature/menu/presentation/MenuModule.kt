package com.gosport.feature.menu.presentation

import com.gosport.feature.menu.data.menuDataModule
import com.gosport.feature.menu.domain.menuDomainModule
import org.koin.dsl.module

val menuModule = module {
    includes(menuDataModule, menuDomainModule)
}