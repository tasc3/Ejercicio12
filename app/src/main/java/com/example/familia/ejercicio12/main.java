package com.example.familia.ejercicio12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class main extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.editText);
    }

    public void ver(View v)
    {
        Intent i= new Intent(this, pagina.class);
        i.putExtra("dirección", et1.getText().toString());
        startActivity(i);
    }

}
