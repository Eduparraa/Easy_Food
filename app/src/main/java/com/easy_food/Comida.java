package com.easy_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Comida extends AppCompatActivity {

    public void guardar (View View ) {
        EditText textPersonName = findViewById(R.id.rnombre);
        EditText text = findViewById(R.id.editCalle);

        Log.i("Calle:", textPersonName.getText().toString());
        Log.i("N°: ", text.getText().toString());

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }
}