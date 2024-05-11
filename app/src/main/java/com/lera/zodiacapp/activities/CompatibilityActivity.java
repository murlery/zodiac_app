package com.lera.zodiacapp.activities;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lera.zodiacapp.R;
import com.lera.zodiacapp.data.ZodiacSign;

public class CompatibilityActivity extends AppCompatActivity {
    private String zodiacWoman;
    private String zodiacMan;
    private TextView mainText;
    private TextView zodiacWomanText;
    private TextView zodiacManText;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compatibility);

        mainText = findViewById(R.id.compatibility_text);
        zodiacWomanText = findViewById(R.id.compatibility_zodiacWoman);
        zodiacManText = findViewById(R.id.compatibility_zodiacMan);
        backButton = findViewById(R.id.back_button);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    zodiacWomanText.setText("");
                    zodiacManText.setText("");
                    mainText.setText("");
                    finish(); // Закрываем CompatibilityActivity и возвращаемся в MainActivity
                }
            });
            return insets;
        });

        // Получаем данные из Intent
        zodiacWoman = getIntent().getStringExtra("zodiacWoman");
        zodiacMan = getIntent().getStringExtra("zodiacMan");
        zodiacWomanText.setText(zodiacWoman);
        zodiacManText.setText(zodiacMan);
        mainText.setText(ZodiacSign.calculateCompatibility(zodiacWoman, zodiacMan));
    }
}