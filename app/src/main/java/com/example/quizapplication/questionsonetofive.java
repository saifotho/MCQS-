package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

public class questionsonetofive extends AppCompatActivity {

    static int right=0;
    static int wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionsonetofive);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);



        RadioButton rbQ1a = (RadioButton) findViewById(R.id.radioButtonQ1a);
        RadioButton rbQ1b = (RadioButton) findViewById(R.id.radioButtonQ1b);
        RadioButton rbQ1c = (RadioButton) findViewById(R.id.radioButtonQ1c);
        RadioButton rbQ1d = (RadioButton) findViewById(R.id.radioButtonQ1d);

        RadioButton rbQ2a = (RadioButton) findViewById(R.id.radioButtonQ2a);
        RadioButton rbQ2b = (RadioButton) findViewById(R.id.radioButtonQ2b);
        RadioButton rbQ2c = (RadioButton) findViewById(R.id.radioButtonQ2c);
        RadioButton rbQ2d = (RadioButton) findViewById(R.id.radioButtonQ2d);

        RadioButton rbQ3a = (RadioButton) findViewById(R.id.radioButtonQ3a);
        RadioButton rbQ3b = (RadioButton) findViewById(R.id.radioButtonQ3b);
        RadioButton rbQ3c = (RadioButton) findViewById(R.id.radioButtonQ3c);
        RadioButton rbQ3d = (RadioButton) findViewById(R.id.radioButtonQ3d);

        RadioButton rbQ4a = (RadioButton) findViewById(R.id.radioButtonQ4a);
        RadioButton rbQ4b = (RadioButton) findViewById(R.id.radioButtonQ4b);
        RadioButton rbQ4c = (RadioButton) findViewById(R.id.radioButtonQ4c);
        RadioButton rbQ4d = (RadioButton) findViewById(R.id.radioButtonQ4d);

        RadioButton rbQ5a = (RadioButton) findViewById(R.id.radioButtonQ5a);
        RadioButton rbQ5b = (RadioButton) findViewById(R.id.radioButtonQ5b);
        RadioButton rbQ5c = (RadioButton) findViewById(R.id.radioButtonQ5c);
        RadioButton rbQ5d = (RadioButton) findViewById(R.id.radioButtonQ5d);

        Button btnNext = findViewById(R.id.buttonNext);

        rbQ1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right++;
            }
        });

        rbQ1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right++;
            }
        });

        rbQ3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right++;
            }
        });

        rbQ3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right++;
            }
        });

        rbQ4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ4d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right++;
            }
        });

        rbQ5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        rbQ5d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong++;
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(questionsonetofive.this,Q6to10.class);
                intent.putExtra("message_key",String.valueOf(right));
                intent.putExtra("message_wrong",String.valueOf(wrong));
                startActivity(intent);
            }
        });


    }



}

        
    