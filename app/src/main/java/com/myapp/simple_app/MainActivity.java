package com.myapp.simple_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.TxtDemo);

        textView.setText("It is a trial app. (this text changes when button is clicked)");

        Button BtnClick = (Button) findViewById(R.id.btnclick);
        BtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("You clicked the button");
            }
        });

    }
}