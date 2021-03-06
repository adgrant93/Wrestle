
package com.example.android.wrestle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.wrestle.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Score for Team A
    int pointsRed = 0;
    //Score for Team B
    int pointsBlue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView scoreViewRed = (TextView) findViewById(R.id.team_red_score);
        TextView scoreViewBlue = (TextView) findViewById(R.id.team_blue_score);
        displayForTeamA(0);
        displayForTeamB(0);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        scoreView.setText(String.valueOf(score));
    }

    //Functions for adding points for Team A
    public void threePoints(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        pointsRed = pointsRed + 3;
        scoreView.setText(String.valueOf(pointsRed));
    }

    public void twoPointsRed(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        pointsRed += 2;
        scoreView.setText(String.valueOf(pointsRed));

    }
    //Going to have to make a new method for this
    //All functions that use twoPoints method get modified since this is always true


    public void nearFallToggleRed(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        Button redNearFall = (Button) findViewById(R.id.red_near_fall);

        if (redNearFall.getText() == getString(R.string.red_neaFall_2_seconds)) {
            pointsRed += 2;
            scoreView.setText(String.valueOf(pointsRed));
        }
        else if (redNearFall.getText() == getString(R.string.red_nearFall_5_seconds)) {
            pointsRed += 3;
            scoreView.setText(String.valueOf(pointsRed));
        }
    }

    public void nearFallToggleBlue(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_score);
        Button blueNearFall = (Button) findViewById(R.id.blue_near_fall);

        if (blueNearFall.getText() == getString(R.string.blue_neaFall_2_seconds)) {
            pointsBlue += 2;
            scoreView.setText(String.valueOf(pointsBlue));
        }
        else if (blueNearFall.getText() == getString(R.string.blue_nearFall_5_seconds)) {
            pointsBlue += 3;
            scoreView.setText(String.valueOf(pointsBlue));
        }
    }

    public void penaltyToggleRed(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        Button redPenaltyToggle = (Button) findViewById(R.id.redPenalty);

        if (redPenaltyToggle.getText() == getString(R.string.red_penalty_1)) {
            pointsRed += 1;
            scoreView.setText(String.valueOf(pointsRed));
        }
        else if (redPenaltyToggle.getText() == getString(R.string.red_penalty_2)) {
            pointsRed += 2;
            scoreView.setText(String.valueOf(pointsRed));
        }
    }

    public void penaltyToggleBlue(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_score);
        Button bluePenaltyToggle = (Button) findViewById(R.id.bluePenalty);

        if (bluePenaltyToggle.getText() == getString(R.string.blue_penalty_1)) {
            pointsBlue += 1;
            scoreView.setText(String.valueOf(pointsBlue));
        }
        else if (bluePenaltyToggle.getText() == getString(R.string.blue_penalty_2)) {
            pointsBlue += 2;
            scoreView.setText(String.valueOf(pointsBlue));
        }
    }
        //pointsRed = pointsRed + 2;

    public void onePoint(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        pointsRed = pointsRed + 1;
        scoreView.setText(String.valueOf(pointsRed));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_blue_score);
        scoreViewB.setText(String.valueOf(score));
    }

    //Functions for adding points for Team B
    public void threePointsB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_blue_score);
        pointsBlue = pointsBlue + 3;
        scoreViewB.setText(String.valueOf(pointsBlue));
    }

    public void twoPointsB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_blue_score);
        pointsBlue = pointsBlue + 2;
        scoreViewB.setText(String.valueOf(pointsBlue));
    }

    public void onePointB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_blue_score);
        pointsBlue = pointsBlue + 1;
        scoreViewB.setText(String.valueOf(pointsBlue));
    }

    public void reset(View v) {
        pointsRed = 0;
        pointsBlue = 0;
        displayForTeamB(pointsBlue);
        displayForTeamA(pointsRed);

    }

    public void switchRed(View view){
        Button redNearFall = (Button) findViewById(R.id.red_near_fall);
        Button redPenalty = (Button) findViewById(R.id.redPenalty);
        //int parameter = String.valueOf(redNearFall.getText());
        if ((redNearFall.getText() == getString(R.string.red_neaFall_2_seconds)) && (redPenalty.getText() == getString(R.string.red_penalty_1))) {
            redNearFall.setText(getString(R.string.red_nearFall_5_seconds));
            redPenalty.setText(getString(R.string.red_penalty_2));
        }
        else if ((redNearFall.getText() == getString(R.string.red_nearFall_5_seconds)) && (redPenalty.getText() == getString(R.string.red_penalty_2))) {
            redNearFall.setText(getString(R.string.red_neaFall_2_seconds));
            redPenalty.setText(getString(R.string.red_penalty_1));
        }
    }

    public void switchBlue(View view){
        Button blueNearFall = (Button) findViewById(R.id.blue_near_fall);
        Button bluePenalty = (Button) findViewById(R.id.bluePenalty);
        //int parameter = String.valueOf(redNearFall.getText());
        if ((blueNearFall.getText() == getString(R.string.blue_neaFall_2_seconds)) && (bluePenalty.getText() == getString(R.string.blue_penalty_1))) {
            blueNearFall.setText(getString(R.string.blue_nearFall_5_seconds));
            bluePenalty.setText(getString(R.string.blue_penalty_2));
        }
        else if ((blueNearFall.getText() == getString(R.string.red_nearFall_5_seconds)) && (bluePenalty.getText() == getString(R.string.red_penalty_2))) {
            blueNearFall.setText(getString(R.string.red_neaFall_2_seconds));
            bluePenalty.setText(getString(R.string.red_penalty_1));
        }
    }
}