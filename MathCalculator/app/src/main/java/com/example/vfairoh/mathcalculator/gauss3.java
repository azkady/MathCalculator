package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gauss3 extends AppCompatActivity {
    private EditText b, a, x, g3_m35, g3_35, txt_hasilg3, g12ba3, g30;
    private Button btn_carixG3, btn_resetg3, btn_hitungg3;
    private TextView cara_x_G3, cara_gauss3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss3);

        b = findViewById(R.id.BatasAtasG3);
        a = findViewById(R.id.BatasBawahG3);
        x = findViewById(R.id.txt_nilaixG3);
        g12ba3 = findViewById(R.id.g12ba3);
        g3_m35 = findViewById(R.id.g3_m35);
        g3_35 = findViewById(R.id.g3_35);
        g30 = findViewById(R.id.g30);
        txt_hasilg3 = findViewById(R.id.txt_hasilg3);
        cara_x_G3 = findViewById(R.id.cara_x_G3);
        cara_gauss3 = findViewById(R.id.cara_gauss3);
        btn_carixG3 = findViewById(R.id.btn_carixG3);
        btn_hitungg3 = findViewById(R.id.btn_hitungg3);
        btn_resetg3 = findViewById(R.id.btn_resetg3);
        txt_hasilg3.setEnabled(false);
        g12ba3.setEnabled(false);
        x.setEnabled(false);

        btn_carixG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb = Double.parseDouble(b.getText().toString());
                double na = Double.parseDouble(a.getText().toString());
                double nilaixm = (nb-na)/2;
                double nilaixp = (nb+na)/2;
                cara_x_G3.setText("(("+b.getText()+"-"+a.getText()+")/2)u + "+"(("+b.getText()+"+"+a.getText()+")/2)");
                g12ba3.setText(String.valueOf(nilaixm));
                x.setText(String.valueOf(nilaixm)+"u + "+String.valueOf(nilaixp));
            }
        });

        btn_hitungg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double g3m = Double.parseDouble(g3_m35.getText().toString());
                double g3p = Double.parseDouble(g3_35.getText().toString());
                double g3o = Double.parseDouble(g30.getText().toString());
                double Hasilg3 = g3m+g3p+g3o;
                cara_gauss3.setText(g30.getText()+" + "+g3_m35.getText()+" + "+g3_35.getText());
                txt_hasilg3.setText(String.valueOf(Hasilg3));
            }
        });

        btn_resetg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                a.setText("");
                x.setText("");
                g3_m35.setText("");
                g3_35.setText("");
                txt_hasilg3.setText("");
                cara_x_G3.setText("");
                cara_gauss3.setText("");
                g12ba3.setText("");
                g30.setText("");
            }
        });
    }
}
