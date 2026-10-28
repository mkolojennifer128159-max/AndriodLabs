package com.example.explicitintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView receivedMessage = findViewById(R.id.receivedMessage);
        Button backButton = findViewById(R.id.backButton);

        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        if (message == null || message.trim().isEmpty()) {
            message = "No message received.";
        }
        receivedMessage.setText(message);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
