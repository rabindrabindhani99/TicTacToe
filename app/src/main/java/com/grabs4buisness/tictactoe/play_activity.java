package com.grabs4buisness.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class play_activity extends AppCompatActivity
{
    AppCompatButton playAgainBtn,homeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        playAgainBtn=findViewById(R.id.play_again_btn);
        homeBtn=findViewById(R.id.home_btn);

        playAgainBtn.setOnClickListener(this::playAgainButtonClick);

        homeBtn.setOnClickListener(this::homeButtonClicked);

    }

    public void playAgainButtonClick(View view)
    {
        //game rerun
    }

    public void homeButtonClicked(View view)
    {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}