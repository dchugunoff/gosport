package com.gosport.gosporttechnicaltask

import android.app.Application
import com.gosport.core.presentation.coreModule
import com.gosport.feature.cart.presentation.cartModule
import com.gosport.feature.menu.presentation.menuModule
import com.gosport.feature.profile.presentation.profileModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                coreModule,
                menuModule,
                profileModule,
                cartModule
            )
        }
    }
}