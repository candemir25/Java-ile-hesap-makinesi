package com.example.hesap_makinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TOPLAM(View view){
        EditText edit1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText edit2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText edit3 =(EditText)findViewById(R.id.editTextNumber3);

        int sayı1 = Integer.parseInt(edit1.getText().toString());
        int sayı2 = Integer.parseInt(edit2.getText().toString());

        int result= sayı1+sayı2;

        edit3.setText("Sayıların Toplamı = " + result);


    }
    public void FARK(View view){
        EditText edit1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText edit2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText edit3 =(EditText)findViewById(R.id.editTextNumber3);

        int sayı1 = Integer.parseInt(edit1.getText().toString());
        int sayı2 = Integer.parseInt(edit2.getText().toString());

        int result= sayı1-sayı2;

        edit3.setText("Sayıların Farkı = " + result);


    }
    public void CARPİM(View view){
        EditText edit1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText edit2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText edit3 =(EditText)findViewById(R.id.editTextNumber3);

        int sayı1 = Integer.parseInt(edit1.getText().toString());
        int sayı2 = Integer.parseInt(edit2.getText().toString());

        int result= sayı1*sayı2;

        edit3.setText("Sayıların Çarpımı = " + result);


    }
    public void BOLUM(View view){
        EditText edit1 =(EditText)findViewById(R.id.editTextNumber1);
        EditText edit2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText edit3 =(EditText)findViewById(R.id.editTextNumber3);

        int sayı1 = Integer.parseInt(edit1.getText().toString());
        int sayı2 = Integer.parseInt(edit2.getText().toString());

        int result= sayı1/sayı2;

        edit3.setText("Sayıların Bölümü = " + result);


    }
}