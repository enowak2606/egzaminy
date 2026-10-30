package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int liczbaPolubien = 0;
    TextView polubieniaTextview;

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
        Button polubButton = findViewById(R.id.polubButton);
        Button usunButton = findViewById(R.id.usunButton);
        polubieniaTextview = findViewById(R.id.polubieniaTextView);


        polubButton.setOnClickListener(v -> inkrementacjaPolubien());
        usunButton.setOnClickListener(v -> dekrementacjaPolubien());
    }

    public void inkrementacjaPolubien(){
        liczbaPolubien++;
        polubieniaTextview.setText(liczbaPolubien + " polubień");
    }
    public void dekrementacjaPolubien(){
        if (liczbaPolubien>0){
            liczbaPolubien--;
            polubieniaTextview.setText(liczbaPolubien + " polubień");
        }
    }
}