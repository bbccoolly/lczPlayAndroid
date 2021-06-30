package com.lcz.pa

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-06-30
 */
@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}