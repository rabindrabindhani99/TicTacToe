package com.grabs4buisness.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    AppCompatButton playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton=findViewById(R.id.enter_into_app);

        Intent intent = new Intent(this, input_activity.class);
        playButton.setOnClickListener(view -> startActivity(intent));
    }
}