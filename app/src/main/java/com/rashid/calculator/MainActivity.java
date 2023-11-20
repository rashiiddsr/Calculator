package com.rashid.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, num3;
    Button tambah, kurang, kali, bagi, batal, keluar;
    double a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number_1);
        num2 = findViewById(R.id.number_2);
        num3 = findViewById(R.id.number_3);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        batal = findViewById(R.id.batal);
        keluar = findViewById(R.id.keluar);

        tambah.setOnClickListener(this::onClick);
        kurang.setOnClickListener(this::onClick);
        bagi.setOnClickListener(this::onClick);
        kali.setOnClickListener(this::onClick);
        batal.setOnClickListener(this::onClick);
        keluar.setOnClickListener(this::onClick);


    }

        public void onClick(View x) {
            if (x.getId() == R.id.tambah) {
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                c = a + b;
                num3.setText(String.valueOf(c));
            } else if (x.getId() == R.id.kurang) {
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                c = a - b;
                num3.setText(String.valueOf(c));
            } else if (x.getId() == R.id.kali) {
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                c = a * b;
                num3.setText(String.valueOf(c));
            } else if (x.getId() == R.id.bagi) {
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());
                c = a / b;
                num3.setText(String.valueOf(c));
            } else if (x.getId() == R.id.batal) {
                num1.setText("");
                num2.setText("");
                num3.setText("");
            } else if (x.getId() == R.id.keluar) {
                finish();
                System.exit(0);
            }
        }
}