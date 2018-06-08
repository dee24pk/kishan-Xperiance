package com.xpiriance.xpiriancepack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class userprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        Button about = (Button) findViewById(R.id.profile);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v){
                startActivity ( new Intent(MainActivity.this , pop.class));
            }
        });
    }

}
