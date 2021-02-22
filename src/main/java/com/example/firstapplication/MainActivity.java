package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textView);
        inputText=findViewById(R.id.editTextTextPersonName);

    }
    public void printtaus(View v){
        String teksti = inputText.getText().toString();
        text.setText(teksti);


    }
}