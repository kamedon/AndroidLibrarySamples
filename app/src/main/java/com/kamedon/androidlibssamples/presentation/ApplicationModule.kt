package com.kamedon.androidlibssamples.presentation

import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.instance

/**
 * Created by kamei.hidetoshi on 2016/08/16.
 */
fun applicationModule(context: Context) = Kodein.Module {
    bind<Context>() with instance(context)
}

