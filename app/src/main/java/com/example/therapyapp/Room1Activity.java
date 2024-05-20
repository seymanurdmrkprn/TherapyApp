package com.example.therapyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Room1Activity extends AppCompatActivity {
    private int roomId;
    private FirebaseAuth mAuth;
    private VoiceCallManager voiceCallManager; // VoiceCallManager nesnesi


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);




        // Intent'ten roomId al
        Intent intent = getIntent();
        roomId = intent.getIntExtra("roomId", -1);

        // roomId'ye göre sayfayı ayarla
        TextView roomTextView = findViewById(R.id.roomTextView);
        roomTextView.setText("Oda " + roomId);


        mAuth = FirebaseAuth.getInstance();

        // VoiceCallManager'ı oluştur
        voiceCallManager = new VoiceCallManager(Room1Activity.this, new VoiceCallManager.VoiceCallListener() {
            @Override
            public void onVoiceSearchResult(String result) {
                // Sesli arama sonuçlarını işleyebilirsiniz
                // Örneğin, sonuçları bir metin görüntüleyicisine yerleştirebilirsiniz
                // textView.setText(result);
            }
        });

        // Butonu bul ve tıklama işlevselliğini ekle
        Button voiceSearchButton = findViewById(R.id.voiceSearchButton);
        voiceSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // VoiceCallManager ile sesli aramayı başlat
                voiceCallManager.startVoiceSearch();
            }
        });


    }
}
