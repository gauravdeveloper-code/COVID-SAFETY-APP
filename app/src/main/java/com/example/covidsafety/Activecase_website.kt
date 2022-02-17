package com.example.covidsafety

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_activecase_website.*

class Activecase_website : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activecase_website)
        webviewsetup()

    }
    private fun webviewsetup() {
        activecase_webview.webViewClient = WebViewClient()
        activecase_webview.apply { loadUrl("https://www.mohfw.gov.in/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
}



