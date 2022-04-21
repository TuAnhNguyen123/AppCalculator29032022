package com.example.appcalculator29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1,edtNum2, edtResult;
    Button btnAdd,btnSub,btnMul,btnDiv;
    int valNum1,valNum2,valResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        GetNumber();

    }

    private void GetNumber() {
         valNum1 = Integer.parseInt(edtNum1.getText().toString());
         valNum2 = Integer.parseInt(edtNum2.getText().toString());
    }

    private void AnhXa() {
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        edtResult = findViewById(R.id.edtResult);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);
    }

    public void AddButton(View view) {
      valResult = valNum1 + valNum2;
      edtResult.setText(valResult);

    }

    public void MulButton(View view) {
        valResult = valNum1 * valNum2;
        edtResult.setText(valResult);
    }

    public void SubButton(View view) {
        valResult = valNum1 - valNum2;
        edtResult.setText(valResult);
    }

    public void DivButton(View view) {
        if(valNum2!=0) {
            valResult = valNum1 / valNum2;
            edtResult.setText(valResult);
        }else{
            edtResult.setText("Error!, Can't div for Zero");
        }
    }
}