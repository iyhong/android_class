package com.example.a609_07.petrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private WebView mWebview;
    private WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("NAVER");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mWebview = (WebView)findViewById(R.id.webView);
        mWebview.setWebViewClient(new WebViewClient());
        mWebSettings = mWebview.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        mWebview.loadUrl("https://m.naver.com");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.home, menu);

        getMenuInflater().inflate(R.menu.menu_test, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.naver){
            mWebview.loadUrl("https://m.naver.com");
            return true;
        }else if(id == R.id.daum ){
            mWebview.loadUrl("http://daum.net");
        }else if(id == R.id.chat ){
            mWebview.loadUrl("https://hiy-chat.herokuapp.com");
        }else if(id == R.id.wix) {
            mWebview.loadUrl("https://loverman85.wixsite.com/mysite-1");
        }


        return super.onOptionsItemSelected(item);
    }

    public void goBack(View v){
        mWebview.goBack();
    }

    public void goFront(View v){
        mWebview.goForward();
    }
}
