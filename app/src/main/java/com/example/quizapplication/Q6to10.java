package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

public class Q6to10 extends AppCompatActivity {

    static int rightQ = 0;
    static int wrongQ= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6to10);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);




        RadioButton rbQ6a = (RadioButton) findViewById(R.id.radioButtonQ6a);
        RadioButton rbQ6b = (RadioButton) findViewById(R.id.radioButtonQ6b);
        RadioButton rbQ6c = (RadioButton) findViewById(R.id.radioButtonQ6c);
        RadioButton rbQ6d = (RadioButton) findViewById(R.id.radioButtonQ6d);

        RadioButton rbQ7a = (RadioButton) findViewById(R.id.radioButtonQ7a);
        RadioButton rbQ7b = (RadioButton) findViewById(R.id.radioButtonQ7b);
        RadioButton rbQ7c = (RadioButton) findViewById(R.id.radioButtonQ7c);
        RadioButton rbQ7d = (RadioButton) findViewById(R.id.radioButtonQ7d);

        RadioButton rbQ8a = (RadioButton) findViewById(R.id.radioButtonQ8a);
        RadioButton rbQ8b = (RadioButton) findViewById(R.id.radioButtonQ8b);
        RadioButton rbQ8c = (RadioButton) findViewById(R.id.radioButtonQ8c);
        RadioButton rbQ8d = (RadioButton) findViewById(R.id.radioButtonQ8d);

        RadioButton rbQ9a = (RadioButton) findViewById(R.id.radioButtonQ9a);
        RadioButton rbQ9b = (RadioButton) findViewById(R.id.radioButtonQ9b);
        RadioButton rbQ9c = (RadioButton) findViewById(R.id.radioButtonQ9c);
        RadioButton rbQ9d = (RadioButton) findViewById(R.id.radioButtonQ9d);

        RadioButton rbQ10a = (RadioButton) findViewById(R.id.radioButtonQ10a);
        RadioButton rbQ10b = (RadioButton) findViewById(R.id.radioButtonQ10b);
        RadioButton rbQ10c = (RadioButton) findViewById(R.id.radioButtonQ10c);
        RadioButton rbQ10d = (RadioButton) findViewById(R.id.radioButtonQ10d);

        Button btnResult = (Button) findViewById(R.id.buttonNext);
        Button btnprevious = (Button) findViewById(R.id.buttonPrevious);

        rbQ6a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wrongQ++;
            }
        });


        rbQ6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ6c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightQ++;
            }
        });

        rbQ6d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightQ++;
            }
        });

        rbQ7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightQ++;
            }
        });

        rbQ8d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ9a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ9b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ9c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ9d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightQ++;
            }
        });

        rbQ10a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightQ++;
            }
        });

        rbQ10c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        rbQ10d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongQ++;
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnt = getIntent();

                String preRight = intnt.getStringExtra("message_key");
                String preWrong = intnt.getStringExtra("message_wrong");
                System.out.println(preRight);
                int totalRq = (Integer.parseInt(preRight)+rightQ);
                int totalWrong = (Integer.parseInt(preWrong)+wrongQ);

                Intent intent = new Intent(Q6to10.this,finalresult.class);
                intent.putExtra("message", (" Total Question is : 10 "+"\n"+
                        "Right is : "+String.valueOf(totalRq)+"\n"+
                        "Wrong is : "+String.valueOf(totalWrong)+"\n"+
                        " Mark is : " +String.valueOf(totalRq*5)+""));
                startActivity(intent);




            }
        });

        btnprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itt = new Intent(Q6to10.this,questionsonetofive.class);
                startActivity(itt);
            }
        });






    }
}