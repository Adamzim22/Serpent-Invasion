package com.example.snake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     *
     */
.setOnClickListener() {
        opentogame();
        opentoleaderboard();
    }

    public void open() {
        Intent what = new Intent(this, LeaderBoard);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (end) {
            setContentView(R.layout.activity_leaderboard);
        }
    }

}
