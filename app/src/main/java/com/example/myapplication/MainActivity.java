package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View view){
        TextView t1=findViewById(R.id.textView);
        t1.setText("Button CLicked");
        t1.setBackgroundColor(getColor(R.color.pink));
    }
}