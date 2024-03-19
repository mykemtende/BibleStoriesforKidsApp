package com.techlinehub.biblestoriesvideosforkids

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


@SuppressLint("SetJavaScriptEnabled")
class LoadWeb : Activity() {
    private var mWebView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.web)

        // Get reference of WebView from layout/web.xml
        mWebView = findViewById<View>(R.id.webView1) as WebView
        setUpWebViewDefaults(mWebView)
        // Load website
        mWebView!!.loadUrl("https://techlinehub.com/biblestoriesforkids")
        mWebView!!.settings.domStorageEnabled = true
        //mWebView!!.settings.setAppCacheEnabled(true)
        mWebView!!.settings.cacheMode= WebSettings.LOAD_NO_CACHE
        mWebView!!.settings.loadsImagesAutomatically = true

        // Enable Javascript
        val webSettings = mWebView!!.settings
        webSettings.javaScriptEnabled = true


        //set all links be opened in same page
        mWebView!!.webViewClient = WebViewClient()
    }

  

    
}

