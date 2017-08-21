package com.example.android.basketballll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score1=0;
    int score2=0;
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));}
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void increaseATHREE(View view) {
        score1 = score1 + 3;
        displayForTeamA(score1);
    }
    public void increaseATWO(View view) {
        score1 = score1 + 2;
        displayForTeamA(score1);
    }
    public void increaseAONE(View view) {
        score1 = score1 + 1;
        displayForTeamA(score1);
    }


    public void increaseBTHREE(View view){
        score2=score2+3;
        displayForTeamB(score2);

    }
    public void increaseBTWO(View view) {
        score2 = score2 + 2;
        displayForTeamB(score2);
    }
    public void increaseBONE(View view) {
        score2 = score2 + 1;
        displayForTeamB(score2);
    }
   public void resetScore(View view){
       score1=0;
       score2=0;
   displayForTeamA(score1);
       displayForTeamB(score2);
   }
}
