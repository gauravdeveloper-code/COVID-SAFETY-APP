package com.example.covidsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_activecase_website.*
import kotlinx.android.synthetic.main.activity_beds_website.*

class beds_website : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beds_website)
        webviewsetup()
    }

    private fun webviewsetup() {
        bedsavail_website.webViewClient = WebViewClient()
            bedsavail_website.apply {
            loadUrl("https://delhifightscorona.in/data/hospital-beds/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }
}