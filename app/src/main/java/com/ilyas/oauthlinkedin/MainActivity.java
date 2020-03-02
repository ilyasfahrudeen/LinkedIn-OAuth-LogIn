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

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        LinkedInSignIn linkedInSignIn = new LinkedInSignIn();
        linkedInSignIn.signInwithLinkedIn(this,"ItSaYh3myoGfj5gQ","817qgzw9coekgq", "https://eventify.io/callback/linkedin.php");

        linkedInSignIn.onSuccessListener(new LinkedInCallBack() {
            @Override
            public void onSuccessListener(String token, long expire, String linkedInUserId, String getFirstnameKey) {
                System.out.println("token--->"+ token);
                System.out.println("expire--->"+expire);
                System.out.println("user id---->"+linkedInUserId);
                System.out.println("key--->"+getFirstnameKey);
            }

            @Override
            public void onSuccessProfileDetails(String firstName, String lastName, String profilePicture) {
                System.out.println("first name--->"+ firstName);
                System.out.println("last name--->"+lastName);
                System.out.println("profile url---->"+profilePicture);
            }
        });

        /*
        Intent intent = new Intent(this, LinkedInOAuth.class);
        startActivity(intent);*/
    }


}
