package com.example.dem1_cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bureset;
        bureset = (Button) findViewById(R.id.reset);
        Button comm=(Button) findViewById(R.id.somme);
        EditText text1=(EditText) findViewById(R.id.n1);
        EditText text2=(EditText) findViewById(R.id.n2);
        EditText text3=(EditText) findViewById(R.id.res);
        bureset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(text1.getText().toString());
                int n2=Integer.parseInt(text2.getText().toString());
                int nr=n1+n2;
                text3.setText(String.valueOf(nr));
            }


        });
    }
}