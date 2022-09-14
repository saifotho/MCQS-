package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);

        Button btn = (Button)findViewById(R.id.Submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = (new Intent(MainActivity.this,questionsonetofive.class));
                startActivity(intent);
            }
        });
    }


    int count=0;
    @Override
    public void onBackPressed() {
        count++;

        if(count==10000000)
        {
            super.onBackPressed();

        }


    }
}
