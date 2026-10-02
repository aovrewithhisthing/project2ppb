package com.example.myapplication;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
    }

    public void showText(View view) {
        String nophone = editText.getText().toString();
        String pilih = "";

        if (radioButton4.isChecked()) {
            pilih = "Telepon Rumah";
        } else if (radioButton5.isChecked()) {
            pilih = "Telepon Mobile";
        } else if (radioButton6.isChecked()) {
            pilih = "Telepon Gudang";
        }

        Toast.makeText(this, pilih + ": " + nophone, Toast.LENGTH_SHORT).show();
    }
}