package com.example.therapyapp;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public class FirestoreHelper {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void saveUserData(String userId, String email) {
        // Firestore'da kullanıcı verilerini saklamak için
        Map<String, Object> userData = new HashMap<>();
        userData.put("email", email);

        db.collection("users").document(userId)
                .set(userData)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Kullanıcı verileri başarıyla kaydedildi
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Kullanıcı verilerini kaydederken bir hata oluştu
                    }
                });
    }
}
