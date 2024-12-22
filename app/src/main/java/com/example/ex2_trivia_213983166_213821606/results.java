package com.example.ex2_trivia_213983166_213821606;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_results);

        // Retrieve the score from the Intent
        int score = getIntent().getIntExtra("SCORE", 0);

        // Find the TextView by its ID
        TextView scoreTextView = findViewById(R.id.score_text_view);

        // Set the score text (e.g., "Your score is: X/4")
        scoreTextView.setText("Your score is: " + score + "/4"); // Adjust the total number if necessary
    }
}
