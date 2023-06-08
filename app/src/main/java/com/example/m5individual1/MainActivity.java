package com.example.m5individual1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.m5individual1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    WebView mweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        mBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String URL=mBinding.EditURL.getText().toString();

            mweb=(WebView) mBinding.url;
            mweb.setWebViewClient(new WebViewClient());
            mweb.loadUrl(URL);
                WebSettings webSettings=mweb.getSettings();
                webSettings.setJavaScriptEnabled(true);

            }
        });

    }
    @Override
    public void onBackPressed(){
        if(mweb.canGoBack()){
            mweb.goBack();
        }else{
            super.onBackPressed();
        }

    }
}