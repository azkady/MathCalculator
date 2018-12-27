package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reimann extends AppCompatActivity {
    private EditText BatasAtas, BatasBawah, bagian, txt_h, fx, txt_reimann;
    private Button btn_Reimann, btn_h, btn_reset;
    private TextView cara_h, cara_reimann;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reimann);
        BatasAtas = findViewById(R.id.BatasAtas);
        BatasBawah = findViewById(R.id.BatasBawah);
        bagian = findViewById(R.id.bagian);
        cara_h = findViewById(R.id.cara_h);
        cara_reimann = findViewById(R.id.cara_reimann);
        txt_h = findViewById(R.id.txt_h);
        fx = findViewById(R.id.fx);
        btn_Reimann = findViewById(R.id.btn_reimann);
        btn_h = findViewById(R.id.btn_h);
        btn_reset = findViewById(R.id.btn_reset);
        txt_reimann = findViewById(R.id.txt_reimann);
        txt_reimann.setEnabled(false);

        btn_Reimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(txt_h.getText().toString());
                double fx_ = Double.parseDouble(fx.getText().toString());
                double hasil_reimann = h*fx_;
                cara_reimann.setText(txt_h.getText()+"*"+fx.getText());
                txt_reimann.setText(String.valueOf(hasil_reimann));
            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double batas_a = Double.parseDouble(BatasAtas.getText().toString());
                double batas_b = Double.parseDouble(BatasBawah.getText().toString());
                double bagian_ = Double.parseDouble(bagian.getText().toString());
                double hasil_h = (batas_a-batas_b)/bagian_;
                cara_h.setText("("+BatasAtas.getText()+"-"+BatasBawah.getText()+")/"+bagian.getText());
                txt_h.setText(String.valueOf(hasil_h));
                txt_h.setEnabled(false);
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BatasAtas.setText("");
                BatasBawah.setText("");
                bagian.setText("");
                txt_h.setText("");
                fx.setText("");
                txt_reimann.setText("");
                cara_h.setText("");
                cara_reimann.setText("");
                txt_h.setEnabled(true);
            }
        });
    }
}
