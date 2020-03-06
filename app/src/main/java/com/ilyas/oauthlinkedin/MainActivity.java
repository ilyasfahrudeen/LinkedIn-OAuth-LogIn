package com.ilyas.oauthlinkedin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ilyas.signinwithlinkedin.LinkedInCallBack;
import com.ilyas.signinwithlinkedin.LinkedInSignIn;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedInSignIn linkedInSignIn = new LinkedInSignIn();
        linkedInSignIn.signInwithLinkedIn(this,"secret_key","api_key","call_back_url");

    }


}
