package com.example.vfairoh.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapezoid extends AppCompatActivity {
    private EditText BatasAtas_T, BatasBawah_T, bagian_T, txt_h_T, fo_T, fi_T, fn_T, txt_trapezoid;
    private Button btn_trapezoid, btn_h_T, btn_reset_T;
    private TextView cara_h_T, cara_trapezoid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);
        BatasAtas_T = findViewById(R.id.BatasAtas_T);
        BatasBawah_T = findViewById(R.id.BatasBawah_T);
        bagian_T = findViewById(R.id.bagian_T);
        cara_h_T = findViewById(R.id.cara_h_T);
        cara_trapezoid = findViewById(R.id.cara_trapezoid);
        txt_h_T = findViewById(R.id.txt_h_T);
        fo_T = findViewById(R.id.fo_T);
        fi_T = findViewById(R.id.fi_T);
        fn_T = findViewById(R.id.fn_T);
        btn_trapezoid = findViewById(R.id.btn_trapezoid);
        btn_h_T = findViewById(R.id.btn_h_T);
        btn_reset_T = findViewById(R.id.btn_reset_T);
        txt_trapezoid = findViewById(R.id.txt_trapezoid);
        txt_trapezoid.setEnabled(false);

        btn_trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(txt_h_T.getText().toString());
                double fo_ = Double.parseDouble(fo_T.getText().toString());
                double fi_ = Double.parseDouble(fi_T.getText().toString());
                double fn_ = Double.parseDouble(fn_T.getText().toString());
                double hasil_trapezoid = (h/2)*(fo_+(2*fi_)+fn_);
                cara_trapezoid.setText("("+txt_h_T.getText()+"/2)*("+fo_T.getText()+"+(2*"+fi_T.getText()+")+"+fn_T.getText()+")");
                txt_trapezoid.setText(String.valueOf(hasil_trapezoid));
            }
        });
        btn_h_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double batas_a = Double.parseDouble(BatasAtas_T.getText().toString());
                double batas_b = Double.parseDouble(BatasBawah_T.getText().toString());
                double bagian_ = Double.parseDouble(bagian_T.getText().toString());
                double hasil_h = (batas_a-batas_b)/bagian_;
                cara_h_T.setText("("+BatasAtas_T.getText()+"-"+BatasBawah_T.getText()+")/"+bagian_T.getText());
                txt_h_T.setText(String.valueOf(hasil_h));
                txt_h_T.setEnabled(false);
            }
        });
        btn_reset_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BatasAtas_T.setText("");
                BatasBawah_T.setText("");
                bagian_T.setText("");
                txt_h_T.setText("");
                fo_T.setText("");
                fi_T.setText("");
                fn_T.setText("");
                txt_trapezoid.setText("");
                cara_h_T.setText("");
                cara_trapezoid.setText("");
                txt_h_T.setEnabled(true);
            }
        });
    }
}
