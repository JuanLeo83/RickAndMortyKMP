package com.jgpl.rym

import android.app.Application
import di.commonDataModule
import di.commonDomainModule
import di.commonPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class RYMApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@RYMApplication)
            modules(
                commonDataModule,
                commonDomainModule,
                commonPresentationModule
            )
        }
    }
}