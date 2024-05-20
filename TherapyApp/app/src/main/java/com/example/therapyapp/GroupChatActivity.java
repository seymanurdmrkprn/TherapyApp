package com.example.therapyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GroupChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chat);

        Button groupButton = findViewById(R.id.groupButton);
        Button chatButton = findViewById(R.id.chatButton);

        groupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Grup aktivitesine git
                startActivity(new Intent(GroupChatActivity.this, GroupTherapyActivity.class));
            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sohbet aktivitesine git
                startActivity(new Intent(GroupChatActivity.this, FilterUsersActivity.class));
            }
        });
    }
}
