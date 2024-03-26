package com.gosport.feature.profile.presentation

import com.gosport.feature.profile.data.profileDataModule
import com.gosport.feature.profile.domain.profileDomainModule
import org.koin.dsl.module

val profileModule = module {
    includes(profileDataModule, profileDomainModule)
}