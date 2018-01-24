package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayTeamAScore(int Score)
    {
        TextView scoreview = (TextView) findViewById(R.id.teamA_score);
        scoreview.setText(String.valueOf(Score));
    }

    public void addThreeForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }

    public void addTwoForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }

    public void freeThrowTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        displayTeamAScore(scoreTeamA);
    }

    public void displayTeamBScore(int Score)
    {
        TextView scoreview = (TextView) findViewById(R.id.teamB_score);
        scoreview.setText(String.valueOf(Score));
    }

    public void addThreeForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }

    public void addTwoForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }

    public void freeThrowTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 1;
        displayTeamBScore(scoreTeamB);
    }

    public void resetScore(View v)
    {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);

    }
}
