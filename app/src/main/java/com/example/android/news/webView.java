package com.example.android.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class webView extends AppCompatActivity {
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
         url=extras.getString("url");
        }
        WebView mywebview = (WebView) findViewById(R.id.webView);

        mywebview.loadUrl(url);
    }

}
