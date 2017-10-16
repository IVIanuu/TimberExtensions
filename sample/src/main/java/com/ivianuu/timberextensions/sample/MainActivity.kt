package com.ivianuu.timberextensions.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ivianuu.timberextensions.debug
import com.ivianuu.timberextensions.verbose
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.plant(Timber.DebugTree())
    }
}
