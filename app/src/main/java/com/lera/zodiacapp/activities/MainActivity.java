    package com.lera.zodiacapp.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.inputmethod.InputMethodManager;

import com.lera.zodiacapp.R;
import com.lera.zodiacapp.data.ZodiacSign;


    public class MainActivity extends AppCompatActivity {
        private EditText zodiacWomanEditText;
        private EditText zodiacManEditText;
        private Button calculateCompatibilityButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            zodiacWomanEditText = findViewById(R.id.zodiac_sign_woman_editText);
            zodiacManEditText = findViewById(R.id.zodiac_sign_man_editText);
            calculateCompatibilityButton = findViewById(R.id.calculate_compatibility_button);

            calculateCompatibilityButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String zodiacWoman = zodiacWomanEditText.getText().toString();
                    String zodiacMan = zodiacManEditText.getText().toString();
                    if (ZodiacSign.isValidZodiacSign(zodiacWoman) && ZodiacSign.isValidZodiacSign(zodiacMan)) {
                        // Создаем новый Intent для открытия CompatibilityActivity
                        Intent intent = new Intent(MainActivity.this, CompatibilityActivity.class);
                        // Добавляем данные о совместимости в Intent
                        intent.putExtra("zodiacWoman", zodiacWoman);
                        intent.putExtra("zodiacMan", zodiacMan);

                        // Запускаем CompatibilityActivity
                        startActivity(intent);
                    } else {
                        // Show dialog with error message
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Некорректный ввод. Введите знаки зодиака снова.")
                                .setTitle("Ошибка")
                                .setPositiveButton("OK", null)
                                .show();
                    }
                    zodiacWomanEditText.setText("");
                    zodiacManEditText.setText("");
                }
            });

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent ev) {
            if (ev.getAction() == MotionEvent.ACTION_DOWN) {
                View view = getCurrentFocus();
                if (view instanceof EditText) {
                    Rect outRect = new Rect();
                    view.getGlobalVisibleRect(outRect);
                    if (!outRect.contains((int) ev.getRawX(), (int) ev.getRawY())) {
                        view.clearFocus();
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }
                }
            }
            return super.dispatchTouchEvent(ev);
        }


    }