package com.example.demoproject1.ui.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.demoproject1.R;
import com.example.demoproject1.ui.authentaction.UserAuth;

public class SplahPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah_page);
        NextActivity();
    }
    public void NextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(SplahPage.this, UserAuth.class);
                SplahPage.this.startActivity(mainIntent);
                SplahPage.this.finish();
            }
        }, 5000);
    }
}