package com.biernatmdev.simple_service

import android.app.Application
import com.biernatmdev.simple_service.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SimpleServiceApplication: Application() {
    override fun onCreate(){
        super.onCreate()

        startKoin {
            androidContext(this@SimpleServiceApplication)
            modules(appModule)
        }
    }
}