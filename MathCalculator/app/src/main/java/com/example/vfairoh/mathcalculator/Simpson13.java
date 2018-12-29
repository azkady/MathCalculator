package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Simpson13 extends AppCompatActivity {
    private EditText b, a, H, f0, f1, f2, hasils13;
    private Button hitungHs13, resets13, hitungs13;
    private TextView cara_h_S13, cara_simpson13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpson13);

        b = findViewById(R.id.BatasAtass13);
        a = findViewById(R.id.BatasBawahs13);
        H = findViewById(R.id.txt_nilaiH13);
        f0 = findViewById(R.id.f0_s13);
        f1 = findViewById(R.id.f1_s13);
        f2 = findViewById(R.id.f2_s13);
        hasils13 = findViewById(R.id.txt_hasils13);
        cara_h_S13 = findViewById(R.id.cara_h_S13);
        cara_simpson13 = findViewById(R.id.cara_simpson13);
        hitungHs13 = findViewById(R.id.btn_cariHs13);
        hitungs13 = findViewById(R.id.btn_hitungs13);
        resets13 = findViewById(R.id.btn_resets13);
        hasils13.setEnabled(false);

        hitungHs13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb = Double.parseDouble(b.getText().toString());
                double na = Double.parseDouble(a.getText().toString());
                double nilaiH = (nb-na)/2;
                cara_h_S13.setText("("+b.getText()+"-"+a.getText()+")/2");
                H.setText(String.valueOf(nilaiH));
                H.setEnabled(false);
            }
        });

        hitungs13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nf0 = Double.parseDouble(f0.getText().toString());
                double nf1 = Double.parseDouble(f1.getText().toString());
                double nf2 = Double.parseDouble(f2.getText().toString());
                double nH = Double.parseDouble(H.getText().toString());
                double HdibagiTiga = nH/3;
                double hitungF = nf0+(nf1*4)+nf2;
                double Hasils13 = HdibagiTiga*hitungF;
                cara_simpson13.setText("("+H.getText()+"/3"+"("+f0.getText()+" + "+f1.getText()+"*4 + "+f2.getText()+"))");
                hasils13.setText(String.valueOf(Hasils13));
            }
        });

        resets13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                a.setText("");
                H.setText("");
                f0.setText("");
                f1.setText("");
                f2.setText("");
                cara_h_S13.setText("");
                cara_simpson13.setText("");
                hasils13.setText("");
                H.setEnabled(true);
            }
        });
    }
}