package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reimann extends AppCompatActivity {
    private EditText BatasAtas_R, BatasBawah_R, bagian_R, txt_h_R, fx, txt_reimann;
    private Button btn_Reimann, btn_h_R, btn_reset_R;
    private TextView cara_h_R, cara_reimann;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reimann);
        BatasAtas_R = findViewById(R.id.BatasAtas_R);
        BatasBawah_R = findViewById(R.id.BatasBawah_R);
        bagian_R = findViewById(R.id.bagian_R);
        cara_h_R = findViewById(R.id.cara_h_R);
        cara_reimann = findViewById(R.id.cara_reimann);
        txt_h_R = findViewById(R.id.txt_h_R);
        fx = findViewById(R.id.fx);
        btn_Reimann = findViewById(R.id.btn_reimann);
        btn_h_R = findViewById(R.id.btn_h_R);
        btn_reset_R = findViewById(R.id.btn_reset_R);
        txt_reimann = findViewById(R.id.txt_reimann);
        txt_reimann.setEnabled(false);

        btn_Reimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(txt_h_R.getText().toString());
                double fx_ = Double.parseDouble(fx.getText().toString());
                double hasil_reimann = h*fx_;
                cara_reimann.setText(txt_h_R.getText()+"*"+fx.getText());
                txt_reimann.setText(String.valueOf(hasil_reimann));
            }
        });
        btn_h_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double batas_a = Double.parseDouble(BatasAtas_R.getText().toString());
                double batas_b = Double.parseDouble(BatasBawah_R.getText().toString());
                double bagian_ = Double.parseDouble(bagian_R.getText().toString());
                double hasil_h = (batas_a-batas_b)/bagian_;
                cara_h_R.setText("("+BatasAtas_R.getText()+"-"+BatasBawah_R.getText()+")/"+bagian_R.getText());
                txt_h_R.setText(String.valueOf(hasil_h));
                txt_h_R.setEnabled(false);
            }
        });
        btn_reset_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BatasAtas_R.setText("");
                BatasBawah_R.setText("");
                bagian_R.setText("");
                txt_h_R.setText("");
                fx.setText("");
                txt_reimann.setText("");
                cara_h_R.setText("");
                cara_reimann.setText("");
                txt_h_R.setEnabled(true);
            }
        });
    }
}
