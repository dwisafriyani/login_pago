package com.example.m3_uiux;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.m3_uiux.R;
import com.example.m3_uiux.login;
import com.example.m3_uiux.register;

public class MainActivity extends AppCompatActivity {

    Button login1, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        login1 = findViewById(R.id.Login);
        register = findViewById(R.id.Register);

        login1.setOnClickListener(v -> {
            Intent i = new Intent(this, login.class);
            startActivity(i);
        });

        register.setOnClickListener(v -> {
            Intent i = new Intent(this, com.example.m3_uiux.register.class);
            startActivity(i);
        });

    }
}