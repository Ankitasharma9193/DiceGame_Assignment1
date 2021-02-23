package com.example.dicegame_assignment1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView uDice = findViewById(R.id.user);
        final ImageView computerDice = findViewById(R.id.computer);
        Button TopButton = findViewById(R.id.top);
        Button BottomButton = findViewById(R.id.bottom);

        final TextView result = findViewById(R.id.result);

        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int playerD = rand.nextInt(6);
                int computerD = rand.nextInt(6);

                uDice.setImageResource(diceArray[playerD]);
                computerDice.setImageResource(diceArray[computerD]);

                if(playerD > computerD){
                    result.setText(getResources().getString(R.string.user));
                }

                else if(playerD < computerD){
                    result.setText(getResources().getString(R.string.comp));
                }

                else{
                    result.setText(getResources().getString(R.string.tie));
                }

            }
        });

        BottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int playerD = rand.nextInt(6);
                int computerD = rand.nextInt(6);

                uDice.setImageResource(diceArray[playerD]);
                computerDice.setImageResource(diceArray[computerD]);

                if(playerD < computerD){
                    result.setText(getResources().getString(R.string.user));
                }

                else if(playerD > computerD){
                    result.setText(getResources().getString(R.string.comp));
                }

                else{
                    result.setText(getResources().getString(R.string.tie));
                }



            }
        });
    }



}