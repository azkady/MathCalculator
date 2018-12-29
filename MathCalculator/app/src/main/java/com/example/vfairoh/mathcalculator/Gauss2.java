package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gauss2 extends AppCompatActivity {
    private EditText b, a, x, g2_m13, g2_13, txt_hasilg2, g12ba2;
    private Button btn_carixG2, btn_resetg2, btn_hitungg2;
    private TextView cara_x_G2, cara_gauss2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss2);

        b = findViewById(R.id.BatasAtasG2);
        a = findViewById(R.id.BatasBawahG2);
        x = findViewById(R.id.txt_nilaixG2);
        g12ba2 = findViewById(R.id.g12ba2);
        g2_m13 = findViewById(R.id.g2_m13);
        g2_13 = findViewById(R.id.g2_13);
        txt_hasilg2 = findViewById(R.id.txt_hasilg2);
        cara_x_G2 = findViewById(R.id.cara_x_G2);
        cara_gauss2 = findViewById(R.id.cara_gauss2);
        btn_carixG2 = findViewById(R.id.btn_carixG2);
        btn_hitungg2 = findViewById(R.id.btn_hitungg2);
        btn_resetg2 = findViewById(R.id.btn_resetg2);
        txt_hasilg2.setEnabled(false);
        g12ba2.setEnabled(false);
        x.setEnabled(false);

        btn_carixG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb = Double.parseDouble(b.getText().toString());
                double na = Double.parseDouble(a.getText().toString());
                double nilaixm = (nb-na)/2;
                double nilaixp = (nb+na)/2;
                cara_x_G2.setText("(("+b.getText()+"-"+a.getText()+")/2)u + "+"(("+b.getText()+"+"+a.getText()+")/2)");
                g12ba2.setText(String.valueOf(nilaixm));
                x.setText(String.valueOf(nilaixm)+"u + "+String.valueOf(nilaixp));
            }
        });

        btn_hitungg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double g2m = Double.parseDouble(g2_m13.getText().toString());
                double g2p = Double.parseDouble(g2_13.getText().toString());
                double Hasilg2 = g2m+g2p;
                cara_gauss2.setText(g2_m13.getText()+" + "+g2_13.getText());
                txt_hasilg2.setText(String.valueOf(Hasilg2));
            }
        });

        btn_resetg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                a.setText("");
                x.setText("");
                g2_m13.setText("");
                g2_13.setText("");
                txt_hasilg2.setText("");
                cara_x_G2.setText("");
                cara_gauss2.setText("");
                g12ba2.setText("");
            }
        });
    }
}
