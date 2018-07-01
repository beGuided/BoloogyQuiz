package com.example.android.boloogyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method calculatee and
     * collate the score of theplayer
     */

    public int calculateScore(boolean satatusOfNumberOne, boolean satatusOfNumberTwo, boolean
            satatusOfNumberThree, boolean satatusOfNumberFour, boolean satatusOfNumberFive, boolean satatusOfNumberSix) {
       int score = 0;
        if (satatusOfNumberOne) {
            score += 2;
        }
        if (satatusOfNumberTwo) {
            score += 2;
        }
        if (satatusOfNumberThree) {
            score += 2;
        }
        if (satatusOfNumberFour) {
            score += 2;
        }

        if (satatusOfNumberFive) {
            score += 2;
        }

        if (satatusOfNumberSix) {
            score += 2;
        }
        return score;
    }

    /**
     * this method calls the button
     * to display the score
     */

    public void viewResult(View View) {

////        this method calls the id of name inpute edit text

       EditText nameField = (EditText) findViewById(R.id.your_name);
       String name = nameField.getText().toString();

//   this method calls the id of the right
//        answer for the first question
        RadioButton numberOneRightAnswer = (RadioButton) findViewById(R.id.answer_no_1);
        boolean satatusOfNumberOne = numberOneRightAnswer.isChecked();

//        this method calls the id of the right
//        answer for the second question

        RadioButton numberTwoRightAnswer = (RadioButton) findViewById(R.id.answer_no_2);
        boolean satatusOfNumberTwo = numberTwoRightAnswer.isChecked();

//        this method calls the id of the right
//        answer for the third question

        RadioButton numberThreeRightAnswer = (RadioButton) findViewById(R.id.answer_no_3);
        boolean satatusOfNumberThree = numberThreeRightAnswer.isChecked();

//        this method calls the id of the right
//        answer for the forth question

        RadioButton numberFourRightAnswer = (RadioButton) findViewById(R.id.answer_no_4);
        boolean satatusOfNumberFour = numberFourRightAnswer.isChecked();

//        this method calls the id of the right
//        answer for the fifth question

        RadioButton numberFiveRightAnswer = (RadioButton) findViewById(R.id.answer_no_5);
        boolean satatusOfNumberFive = numberFiveRightAnswer.isChecked();

//        this method calls the id of the right
//        answer for the six question

        RadioButton numberSixRightAnswer = (RadioButton) findViewById(R.id.answer_no_6);
        boolean satatusOfNumberSix = numberSixRightAnswer.isChecked();

//        display the quiz result
        int totalScore = calculateScore(satatusOfNumberOne, satatusOfNumberTwo,
                satatusOfNumberThree, satatusOfNumberFour, satatusOfNumberFive, satatusOfNumberSix);
        String yourName = name;
        String message = "\nyour score :" + totalScore;
        message += "\n you answered number one:" + satatusOfNumberOne;
        message += "\n you answered number two:" + satatusOfNumberTwo;
        message += "\n you answered number three:" + satatusOfNumberThree;
        message += "\n you answered number four:" + satatusOfNumberFour;
        message += "\n you answered number five:" + satatusOfNumberFive;
        message += "\n you answered number six:" + satatusOfNumberSix;
        displayResult(yourName + message);
      totalScore = totalScore - totalScore;

    }

    /**this mwthodreset all the quize app*/
    public void reset(View view) {

       String reset="";
        displayResult(reset);
    }

    /**
     * this method display the result of the
     * quiz
     */
    public void displayResult(String message) {
        TextView score = (TextView) findViewById(R.id.display_result);
        score.setText(message);
    }
//
}
