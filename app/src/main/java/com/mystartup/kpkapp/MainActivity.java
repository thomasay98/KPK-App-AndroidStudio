package com.mystartup.kpkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.txtResult);
    }

    public void btnIsClick(View buttonView){
        EditText bil1 = findViewById(R.id.edtBil1);
        EditText bil2 = findViewById(R.id.edtBil2);
        int mBil1 = Integer.parseInt(bil1.getText().toString());
        int mBil2 = Integer.parseInt(bil2.getText().toString());
        int pengali1 = 1;
        int pengali2 = 1;
        int hasil1 = mBil1;
        int hasil2 = mBil2;

        while (hasil1 != hasil2){
            if (hasil1 > hasil2){
                pengali2 += 1;
                hasil2 = pengali2 * mBil2;
            }
            else {
                pengali1 += 1;
                hasil1 = pengali1 * mBil1;
            }
        }
        result.setText(hasil1 + "");

    }

}
