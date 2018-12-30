package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Simpson38 extends AppCompatActivity {
    private EditText b, a, H, f0, f1, f2, f3, hasils38;
    private Button hitungHs38, resets38, hitungs38;
    private TextView cara_h_S38, cara_simpson38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpson38);

        b = findViewById(R.id.BatasAtass38);
        a = findViewById(R.id.BatasBawahs38);
        H = findViewById(R.id.txt_nilaiH38);
        f0 = findViewById(R.id.f0_s38);
        f1 = findViewById(R.id.f1_s38);
        f2 = findViewById(R.id.f2_s38);
        f3 = findViewById(R.id.f3_s38);
        hasils38 = findViewById(R.id.txt_hasils38);
        cara_h_S38 = findViewById(R.id.cara_h_S38);
        cara_simpson38 = findViewById(R.id.cara_simpson38);
        hitungHs38 = findViewById(R.id.btn_cariHs38);
        hitungs38 = findViewById(R.id.btn_hitungs38);
        resets38 = findViewById(R.id.btn_resets38);

        hitungHs38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb = Double.parseDouble(b.getText().toString());
                double na = Double.parseDouble(a.getText().toString());
                double nilaiH = (nb-na)/3;
                cara_h_S38.setText("("+b.getText()+"-"+a.getText()+")/3");
                H.setText(String.valueOf(nilaiH));
                H.setEnabled(false);
            }
        });

        hitungs38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nf0 = Double.parseDouble(f0.getText().toString());
                double nf1 = Double.parseDouble(f1.getText().toString());
                double nf2 = Double.parseDouble(f2.getText().toString());
                double nf3 = Double.parseDouble(f3.getText().toString());
                double nH1 = Double.parseDouble(H.getText().toString());
                double Hdibagi38 = (nH1*3)/8;
                double hitungF = nf0+(nf1*3)+(nf2*3)+nf3;
                double Hasils38 = Hdibagi38*hitungF;
                cara_simpson38.setText("(("+H.getText()+"*3)/8"+"("+f0.getText()+" + ("+f1.getText()+"*3) + ("+f2.getText()+"*3) + "+f3.getText()+"))");
                hasils38.setText(String.valueOf(Hasils38));
            }
        });

        resets38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                a.setText("");
                H.setText("");
                f0.setText("");
                f1.setText("");
                f2.setText("");
                f3.setText("");
                cara_h_S38.setText("");
                cara_simpson38.setText("");
                hasils38.setText("");
                H.setEnabled(true);
                b.requestFocus();
            }
        });
    }
}
