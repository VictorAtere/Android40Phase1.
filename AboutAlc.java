package com.example.atere.android40phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {
    private WebView aboutWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        //To add the Back button in the App Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String url = "https://andela.com/alc";
        //Making reference to the WebView Object
        aboutWebView = findViewById(R.id.about_web_view);
        aboutWebView.setWebViewClient(new WebViewClient());

        //Now to enable JavaScript
        WebSettings webSettings = aboutWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //Finally load the page
        aboutWebView.loadUrl(url);
    }
    //To make the back button go back in history while using the WebView.
    @Override
    public void onBackPressed() {
        if (aboutWebView.canGoBack()){
            aboutWebView.goBack();
        }else {
            //Else perform the default action
            super.onBackPressed();
        }
    }
}
