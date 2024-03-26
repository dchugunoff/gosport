package com.gosport.feature.profile.data

import com.gosport.core.data.coreDataModule
import org.koin.dsl.module

val profileDataModule = module {
    includes(coreDataModule)
}