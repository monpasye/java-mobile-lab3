package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout messagesContainer;
    private EditText editMessage;
    private Button btnSend;
    private int messageCount = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesContainer = findViewById(R.id.messages_container);
        editMessage = findViewById(R.id.edit_message);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String messageText = editMessage.getText().toString().trim();
        if (!messageText.isEmpty()) {
            TextView newMessage = new TextView(this);
            newMessage.setText(messageText);
            newMessage.setTextSize(16);
            newMessage.setPadding(16, 16, 16, 16);
            newMessage.setBackgroundColor(0xFFE0E0E0);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(16, 16, 16, 16);
            newMessage.setLayoutParams(params);

            messagesContainer.addView(newMessage);

            editMessage.setText("");
        }
    }
}