package com.modcom.listviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HospitalDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_display)
        val webview = findViewById(R.id.webview) as WebView
        val position = intent.getIntExtra("position",99)
        if (position == 0){
            webview.loadUrl("file:///android_asset/apples.html")
        }

        else if(position == 1){
            webview.loadUrl("file:///android_asset/apricots.html")
        }



    }//end  oncreate
}//end class