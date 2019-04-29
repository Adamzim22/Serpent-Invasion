package com.example.snake;

import android.app.SharedElementCallback;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Game extends AppCompatActivity {

    int score = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // put this code when the game is over and you know your score
        SharedPreferences pref = getApplicationContext().getSharedPreferences("Scores", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("last", score);
        editor.apply();
    }

    public void leftClicked(View view) {
        System.out.println("left");
    }

    public void rightClicked(View view) {
        System.out.println("right");
    }

    public void upClicked(View view) {
        System.out.println("up");
    }

    public void downClicked(View view) {
        System.out.println("down");
    }

    // Wherever you end the game, check if the current score is greater than the high score. if it is, transition
    // to the leaderboard using the following:
    // if (gameIsOver) {
    //      Intent intent = new Intent(getBaseContext(), Game.class);
    //      startActivity(intent);
    // }
}
