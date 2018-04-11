package com.firebaseauth.firebaseauth;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SplashActivity extends AppCompatActivity {
    private WebView intro_mWebView;
    private WebSettings mWebSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intro_mWebView = (WebView) findViewById(R.id.intro_webView);

        intro_mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = intro_mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        intro_mWebView.loadUrl("http://202.30.32.126:8181/HowRUToday/app/intro.html");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class); //MainActivity로 이동
                startActivity(intent);
                finish(); //레이아웃이 쌓이지 않게 종료해 줍니다.

            }
        }, 3000); //2000은 2초를 의미합니다.


    }
}
