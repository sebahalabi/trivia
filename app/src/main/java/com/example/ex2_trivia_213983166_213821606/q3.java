package com.example.ex2_trivia_213983166_213821606;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class q3 extends AppCompatActivity {

    private int score = 0; // Initialize score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        // Retrieve the score passed from the previous activity
        if (getIntent().hasExtra("SCORE")) {
            score = getIntent().getIntExtra("SCORE", 0);
        }

        // Get the RadioGroup for the answers
        RadioGroup answersGroup = findViewById(R.id.answers_group);

        // Set OnCheckedChangeListener for RadioGroup
        answersGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the selected radio button
                RadioButton selectedAnswer = findViewById(checkedId);

                // Check if the selected answer is correct (assuming "Oxygen" is the correct answer)
                if (selectedAnswer.getText().toString().equals("Oxygen")) {
                    score++; // Increment score if correct
                    Toast.makeText(q3.this, "Correct! Score: " + score, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(q3.this, "Wrong answer! Score: " + score, Toast.LENGTH_SHORT).show();
                }

                // Pass the score to the next activity (q4)
                Intent intent = new Intent(q3.this, q4.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
            }
        });
    }
}
