package com.example.rejestrujkonto;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
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
        Button buttonZatwierdz = findViewById(R.id.zatwierdz);

        buttonZatwierdz.setOnClickListener(v -> {

            EditText editEmail = findViewById(R.id.email);
            EditText editHaslo = findViewById(R.id.haslo);
            EditText editPowtHaslo = findViewById(R.id.powtHaslo);

            TextView textKomunikaty = findViewById(R.id.komunikaty);

            String email = editEmail.getText().toString();
            String haslo = editHaslo.getText().toString();
            String powtHaslo = editPowtHaslo.getText().toString();
            if (!czyZawieraMalpe(email)){
                textKomunikaty.setText("Niepoprawidłowy adres e-mail");
            }
            if (!czyHaslaSaTakieSame(haslo, powtHaslo)){
                textKomunikaty.setText("Hasła się różnią");
            }
            if (czyZawieraMalpe(email) && czyHaslaSaTakieSame(haslo, powtHaslo)){
                textKomunikaty.setText("Witaj " + email);
            }
        });

    }

    public boolean czyZawieraMalpe(String email){
        return email.contains("@");
    }
    public boolean czyHaslaSaTakieSame(String haslo, String powtHaslo){
     return haslo.equals(powtHaslo);
    }
}