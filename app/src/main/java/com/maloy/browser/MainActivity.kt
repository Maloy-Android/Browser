package com.maloy.browser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///Browser
        val browser = findViewById<WebView>(R.id.browser)

        browser.webViewClient = WebViewClient()

        browser.apply {
            loadUrl("https://www.google.ru/")
            settings.javaScriptEnabled = true
        }
    }
}