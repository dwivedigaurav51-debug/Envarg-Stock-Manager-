package com.envarg.stockmanager
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import android.webkit.WebSettings
class MainActivity: Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val view=WebView(this)
  view.webViewClient=WebViewClient()
  view.webChromeClient=WebChromeClient()
  view.settings.javaScriptEnabled=true
  view.settings.domStorageEnabled=true
  view.settings.allowFileAccess=true
  view.settings.cacheMode=WebSettings.LOAD_DEFAULT
  setContentView(view)
  view.loadUrl("file:///android_asset/index.html")
 }
}
