package com.kamedon.androidlibssamples

import android.app.Application
import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

/**
 * Created by kamei.hidetoshi on 2016/08/18.
 */
class AndroidLibsSamplesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LeakCanary.install(this)
        Stetho.initializeWithDefaults(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }

}
