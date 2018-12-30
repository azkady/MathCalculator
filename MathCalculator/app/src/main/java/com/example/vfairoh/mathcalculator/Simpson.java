package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;

public class Simpson extends AppCompatActivity {
    private EditText b, a, N, H, f0, nFganjil, nFgenap, jml_fganjil, jml_fgenap, fn, hasils;
    private Button addfganjil, addfgenap, hitungHs, resets, hitungs;
    private TextView cara_h_S, cara_simpson;
    String jmlganjil,jmlgenap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpson);

        b = findViewById(R.id.BatasAtass);
        a = findViewById(R.id.BatasBawahs);
        N = findViewById(R.id.N);
        H = findViewById(R.id.txt_nilaiH);
        f0 = findViewById(R.id.f0_s);
        nFganjil = findViewById(R.id.fganjil_s);
        nFgenap = findViewById(R.id.fgenap_s);
        fn = findViewById(R.id.fn_s);
        jml_fganjil = findViewById(R.id.jumlah_fganjil);
        jml_fgenap = findViewById(R.id.jumlah_fgenap);
        hasils = findViewById(R.id.txt_hasils);
        cara_h_S = findViewById(R.id.cara_h_S);
        cara_simpson = findViewById(R.id.cara_simpson);
        addfganjil = findViewById(R.id.btn_addFganjil);
        addfgenap = findViewById(R.id.btn_addFgenap);
        hitungHs = findViewById(R.id.btn_cariHs);
        hitungs = findViewById(R.id.btn_hitungs);
        resets = findViewById(R.id.btn_resets);

        hitungHs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb = Double.parseDouble(b.getText().toString());
                double na = Double.parseDouble(a.getText().toString());
                double nN = Double.parseDouble(N.getText().toString());
                double nilaiH = (nb-na)/nN;
                cara_h_S.setText("("+b.getText()+"-"+a.getText()+")/"+N.getText());
                H.setText(String.valueOf(nilaiH));
                H.setEnabled(false);
            }
        });

        nFganjil.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                jmlganjil = jml_fganjil.getText().toString();
                if(TextUtils.isEmpty(jmlganjil)){
                    jml_fganjil.setText("0");
                }else{
                    jml_fganjil.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        addfganjil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nfGanjil = Double.parseDouble(nFganjil.getText().toString());
                double njlmGanjil = Double.parseDouble(jml_fganjil.getText().toString());
                double nilaijlm1 = nfGanjil+njlmGanjil;
                jml_fganjil.setText(String.valueOf(nilaijlm1));
                jml_fganjil.setEnabled(false);
                nFganjil.setText("");
                nFganjil.requestFocus();
            }
        });

        nFgenap.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                jmlgenap = jml_fgenap.getText().toString();
                if(TextUtils.isEmpty(jmlgenap)){
                    jml_fgenap.setText("0");
                }else{
                    jml_fgenap.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        addfgenap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nfGenap = Double.parseDouble(nFgenap.getText().toString());
                double njlmGenap = Double.parseDouble(jml_fgenap.getText().toString());
                double nilaijlm2 = nfGenap+njlmGenap;
                jml_fgenap.setText(String.valueOf(nilaijlm2));
                jml_fgenap.setEnabled(false);
                nFgenap.setText("");
                nFgenap.requestFocus();
            }
        });

        hitungs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nf0 = Double.parseDouble(f0.getText().toString());
                double njlmGanjil = Double.parseDouble(jml_fganjil.getText().toString());
                double njlmGenap = Double.parseDouble(jml_fgenap.getText().toString());
                double nfn = Double.parseDouble(fn.getText().toString());
                double nH = Double.parseDouble(H.getText().toString());
                double Hdibagi3 = nH/3;
                double hitungF = nf0+(njlmGanjil*4)+(njlmGenap*2)+nfn;
                double Hasils = Hdibagi3*hitungF;
                cara_simpson.setText("("+H.getText()+"/3 "+"("+f0.getText()+" + ("+jml_fganjil.getText()+"*4) + ("+jml_fgenap.getText()+"*2) + "+fn.getText()+"))");
                hasils.setText(String.valueOf(Hasils));
            }
        });

        resets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                a.setText("");
                N.setText("");
                H.setText("");
                f0.setText("");
                nFganjil.setText("");
                nFgenap.setText("");
                jml_fganjil.setText("");
                jml_fgenap.setText("");
                fn.setText("");
                cara_h_S.setText("");
                cara_simpson.setText("");
                hasils.setText("");
                H.setEnabled(true);
                jml_fganjil.setEnabled(true);
                jml_fgenap.setEnabled(true);
                b.requestFocus();
            }
        });
    }
}
