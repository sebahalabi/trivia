package com.example.ex2_trivia_213983166_213821606;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class q1 extends AppCompatActivity {

    private int score = 0; // Initialize score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        // Get the RadioGroup for the answers
        RadioGroup answersGroup = findViewById(R.id.answers_group);

        // Set OnCheckedChangeListener for RadioGroup
        answersGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the selected radio button
                RadioButton selectedAnswer = findViewById(checkedId);

                // Check if the selected answer is correct (assuming "Earth" is the correct answer)
                if (selectedAnswer.getText().toString().equals("Paris")) {
                    score++; // Increment score if correct
                    Toast.makeText(q1.this, "Correct! Score: " + score, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(q1.this, "Wrong answer! Score: " + score, Toast.LENGTH_SHORT).show();
                }

                // Pass the score to the next activity (q2)
                Intent intent = new Intent(q1.this, q2.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
            }
        });
    }
}
