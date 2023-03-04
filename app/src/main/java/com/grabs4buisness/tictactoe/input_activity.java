package com.grabs4buisness.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class input_activity extends AppCompatActivity
{
    EditText player1,player2;
    AppCompatButton playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_activity);

        player1=findViewById(R.id.first_name);
        player2=findViewById(R.id.second_name);
        playButton=findViewById(R.id.playGameBtn);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitButtonClick(view);
            }
        });


    }
    public void submitButtonClick(View view)
    {
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();
        Intent intent=new Intent(input_activity.this,play_activity.class);
        intent.putExtra("PLAYER_NAMES",new String[] {player1Name,player2Name});
        startActivity(intent);
    }
}