package com.example.vfairoh.mathcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setVariable();
        btnFunction();
    }

    Button btnReimann, btnTrapezoid, btnSimpson13, btnSimpson38, btnSimpson, btnGauss2;

    private void setVariable(){
        btnReimann = findViewById(R.id.menu_reimann);
        btnTrapezoid = findViewById(R.id.menu_trapezoid);
        btnSimpson13 = findViewById(R.id.menu_simpson13);
        btnSimpson38 = findViewById(R.id.menu_simpson38);
        btnGauss2 = findViewById(R.id.menu_gauss2);
    }

    private void btnFunction(){
        btnReimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Reimann.class);
                startActivity(i);
            }
        });

        btnTrapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Trapezoid.class);
                startActivity(i);
            }
        });

        btnSimpson13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Simpson13.class);
                startActivity(i);
            }
        });

        btnSimpson38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Simpson38.class);
                startActivity(i);
            }
        });

        btnGauss2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Gauss2.class);
                startActivity(i);
            }
        });
    }
}
