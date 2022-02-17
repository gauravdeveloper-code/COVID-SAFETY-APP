package com.example.covidsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_activecase_website.*
import kotlinx.android.synthetic.main.activity_guidelines_website.*

class Guidelines_website : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guidelines_website)
        webviewsetup()
    }

    private fun webviewsetup() {
        guidelines_website.webViewClient = WebViewClient()
        guidelines_website.apply { loadUrl("https://www.covid19treatmentguidelines.nih.gov/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
}