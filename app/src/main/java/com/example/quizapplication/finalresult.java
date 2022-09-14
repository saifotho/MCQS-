package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class finalresult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalresult);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);


        TextView txt = findViewById(R.id.TotalQ);

        Intent intent = getIntent();
        String result = intent.getStringExtra("message");

        txt.setText("\n" + (result));

        Button logout = (Button) findViewById(R.id.logoutbt);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intt = new Intent(finalresult.this,MainActivity.class);
                startActivity(intt);
            }
        });


    }

    int count = 0;

    @Override
    public void onBackPressed() {
        count++;

        if (count == 10000000) {
            super.onBackPressed();
        }
    }
}