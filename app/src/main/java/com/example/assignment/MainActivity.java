package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView readMore=findViewById(R.id.readMore);
        TextView text=findViewById(R.id.text);
        TextView hyperT=findViewById(R.id.hyperT);
        TextView readLess=findViewById(R.id.text2);
        text.setVisibility(View.INVISIBLE);
        readLess.setVisibility(View.INVISIBLE);
        hyperT.setMovementMethod(LinkMovementMethod.getInstance());
        readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readMore.setVisibility(View.INVISIBLE);
                text.setVisibility(View.VISIBLE);
                readLess.setVisibility(View.VISIBLE);
            }
        });



        readLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readMore.setVisibility(View.VISIBLE);
                text.setVisibility(View.INVISIBLE);
                readLess.setVisibility(View.INVISIBLE);
            }
        });
    }
}