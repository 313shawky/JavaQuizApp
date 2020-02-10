package com.example.android.javaquizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Get state of checkbox
     *
     * @param checkBoxId
     * @return "true" if checked, "false" otherwise
     */
    public boolean checkBoxResults(int checkBoxId) {
        CheckBox checkBox = findViewById(checkBoxId);
        return checkBox.isChecked();
    }

    /**
     * Set grade for question 1.
     */
    public void question1() {
        boolean cb1 = checkBoxResults(R.id.cb1_q1);
        boolean cb2 = checkBoxResults(R.id.cb2_q1);
        boolean cb3 = checkBoxResults(R.id.cb3_q1);
        boolean cb4 = checkBoxResults(R.id.cb4_q1);
        boolean cb5 = checkBoxResults(R.id.cb5_q1);

        if (!cb1 && !cb2 && !cb4) {
            if (cb3 && cb5) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 2.
     */
    public void question2() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup1);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId != -1) {
            if (checkedId == R.id.rb2_q2) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 3.
     */
    public void question3() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup2);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId != -1) {
            if (checkedId == R.id.rb2_q3) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 4.
     */
    public void question4() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup3);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId != -1) {
            if (checkedId == R.id.rb3_q4) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 5.
     */
    public void question5() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup4);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId != -1) {
            if (checkedId == R.id.rb3_q5) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 6.
     */
    public void question6() {
        EditText editText = findViewById(R.id.editText_q6);
        String ans = editText.getText().toString();
        if (ans.equals("166")) {
            grade += 10;
        }
    }

    /**
     * Set grade for question 7.
     */
    public void question7() {
        RadioGroup radioGroup = findViewById(R.id.radioGroup5);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId != -1) {
            if (checkedId == R.id.rb3_q7) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 8.
     */
    public void question8() {
        EditText editText = findViewById(R.id.editText_q8);
        String ans = editText.getText().toString();
        if (ans.equals("true")) {
            grade += 10;
        }
    }

    /**
     * Set grade for question 9.
     */
    public void question9() {
        boolean cb1 = checkBoxResults(R.id.cb1_q9);
        boolean cb2 = checkBoxResults(R.id.cb2_q9);
        boolean cb3 = checkBoxResults(R.id.cb3_q9);
        boolean cb4 = checkBoxResults(R.id.cb4_q9);
        boolean cb5 = checkBoxResults(R.id.cb5_q9);

        if (!cb2 && !cb3 && !cb5) {
            if (cb1 && cb4) {
                grade += 10;
            }
        }
    }

    /**
     * Set grade for question 10.
     */
    public void question10() {
        EditText editText = findViewById(R.id.editText_q10);
        String ans = editText.getText().toString();
        if (ans.equals("# # # # # #")) {
            grade += 10;
        }
    }

    /**
     * Get grades from all questions.
     */
    public void getGrades() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
    }

    /**
     * Reset grade after submission.
     */
    public void resetGrade() {
        grade = 0;
    }

    /**
     * Calculate final grade and display it.
     */
    public void calculateGrade(View view) {
        getGrades();
        if (grade > 50) {
            Toast.makeText(this, "Congratulations, you passed! Your score is: " + grade + "/100", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "You failed your test. Your score is: " + grade + "/100", Toast.LENGTH_LONG).show();
        }
        resetGrade();
    }

}
