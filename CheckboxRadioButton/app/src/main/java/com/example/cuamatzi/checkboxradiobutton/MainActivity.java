package com.example.cuamatzi.checkboxradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton r1,r2;
    private CheckBox CB1,CB2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.ET1);
        et2=(EditText)findViewById(R.id.ET2);
        tv1=(TextView) findViewById(R.id.TV);
        r1=(RadioButton)findViewById(R.id.RB1);
        r2=(RadioButton)findViewById(R.id.RB2);
        CB1 = (CheckBox)findViewById(R.id.CB1);
        CB2 = (CheckBox)findViewById(R.id.CB2);
    }

    public void Calcular(View view){
        String resultado = "";
        String VS1 = et1.getText().toString();
        String VS2 = et2.getText().toString();

        int VI1 = Integer.parseInt(VS1);
        int VI2 = Integer.parseInt(VS2);
        //validamos los radiobutton
        if (r1.isChecked() == true){
            int suma = VI1 + VI2;
            resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (r2.isChecked() == true){
            int resta = VI1 - VI2;
            resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
        //Validamos los checkbox
        if (CB1.isChecked()){
            int suma = VI1 + VI2;
            resultado = " Operacion radiobutton: "+ resultado + "\n" + "  Suma Checkbox: "+ suma + "\n";
        }
        if (CB2.isChecked()){
            int resta = VI1 - VI2;
            resultado = " Operacion radiobutton: "+ resultado + "\n" + " Resta Checkbox: "+ resta ;
        }
        tv1.setText(resultado);
    }
}
