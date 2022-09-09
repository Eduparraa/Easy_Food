package com.easy_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void registrar (View View ) {
        EditText textPersonName =  findViewById(R.id.rnombre);
        EditText textPassword = findViewById(R.id.editTextPassword);

        Log.i (  "Nombre: ", textPersonName.getText().toString());
        Log.i (  "password: ", textPersonName.getText().toString());

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}