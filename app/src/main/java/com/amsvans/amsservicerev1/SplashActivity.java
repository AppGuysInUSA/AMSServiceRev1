package com.amsvans.amsservicerev1;

import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

/**
 * Created by Greg on 8/28/2015.
 */
public class SplashActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }
    public void service (View view) {
            Intent intent = new Intent(SplashActivity.this, Service.class);
            startActivity(intent);

    }
    public void warranty (View view) {
            Intent intent = new Intent(SplashActivity.this, Warranty.class);
            startActivity(intent);

    }
}