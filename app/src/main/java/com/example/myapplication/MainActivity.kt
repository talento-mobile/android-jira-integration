package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var crash: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
        val crashlytics = FirebaseCrashlytics.getInstance()
        crashlytics.sendUnsentReports()

        crash()
    }

    private fun crash() {
        print(crash)
    }
}