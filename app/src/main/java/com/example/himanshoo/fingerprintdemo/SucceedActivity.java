package com.example.himanshoo.fingerprintdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SucceedActivity extends AppCompatActivity {

    private ImageButton git,about;
    private String url = "https://github.com/HimanshooSharma/FingerprintDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeed);

        getSupportActionBar().hide();

        git = (ImageButton)findViewById(R.id.git_button);
        about = (ImageButton)findViewById(R.id.about_button);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
