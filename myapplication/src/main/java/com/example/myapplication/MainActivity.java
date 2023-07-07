package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsin,blog,bln,bb1,bb2,bcos,bac,bc,bhalf,bdiv,btan,bmul,bfact,bminus,broot,bplus,bx2,bpi,bpoint,bequals;
    TextView tvmain,tvsec;
    String pi="3.14159265359";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9= findViewById(R.id.b9);
        b0= findViewById(R.id.b0);
        bsin= findViewById(R.id.bsin);
        blog= findViewById(R.id.blog);
        bln= findViewById(R.id.bln);
        bb1= findViewById(R.id.bb1);
        bb2= findViewById(R.id.bb2);
        bcos= findViewById(R.id.bcos);
        bac= findViewById(R.id.bac);
        bc= findViewById(R.id.bc);
        bhalf= findViewById(R.id.bhalf);
        bdiv= findViewById(R.id.bdiv);
        btan= findViewById(R.id.btan);
        bmul= findViewById(R.id.bmul);
        bmul= findViewById(R.id.bfact);
        bfact= findViewById(R.id.bfact);
        bminus= findViewById(R.id.bminus);
        broot= findViewById(R.id.broot);
        bplus= findViewById(R.id.bplus);
        bx2= findViewById(R.id.bx2);
        bpi= findViewById(R.id.bpi);
        bpoint= findViewById(R.id.bpoint);
        bequals= findViewById(R.id.bequals);

        tvmain= findViewById(R.id.tvmain);
        tvsec= findViewById(R.id.tvsec);

        //eventlistener
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });


    }
}