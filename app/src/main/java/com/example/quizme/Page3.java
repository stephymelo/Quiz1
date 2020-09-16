package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class Page3 extends AppCompatActivity {
    private Button continuarButton3;
    private CheckBox nexo1, nexo2, nexo3, nexo4, nexo5;
    private PuntajeRiesgo puntajeRiesgo;
    private String name, id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        continuarButton3 = findViewById(R.id.continuarButton3);
        nexo1 = findViewById(R.id.checkNexo1);
        nexo2 = findViewById(R.id.checkNexo2);
        nexo3 = findViewById(R.id.checkNexo3);
        nexo4 = findViewById(R.id.checkNexo4);
        nexo5 = findViewById(R.id.checkNexo5);
        puntajeRiesgo = new PuntajeRiesgo();
        name = getIntent().getStringExtra("name");
        id = getIntent().getStringExtra("id");


        seleccionar();

        continuarButton3.setOnClickListener(
                (v) -> {
                    Intent b = new Intent(this, Page4.class);
                    puntajeRiesgo.sumaNexo();
                    b.putExtra("name", name);
                    b.putExtra("id", id);
                    b.putExtra("sumaNexo", puntajeRiesgo.getSumaNexo());
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada, R.anim.transition);


                }


        );

    }


    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkNexo1:
                if (checked) {
                    puntajeRiesgo.setOpcion1N(3);
                }

                break;
            case R.id.checkNexo2:
                if (checked) {
                    puntajeRiesgo.setOpcion2N(3);
                }

                break;
            case R.id.checkNexo3:
                if (checked) {
                    puntajeRiesgo.setOpcion3N(3);
                }

                break;
            case R.id.checkNexo4:
                if (checked) {
                    puntajeRiesgo.setOpcion4N(3);
                }

                break;
            case R.id.checkNexo5:
                if (checked) {
                    puntajeRiesgo.setOpcion5N(0);
                }

                break;

        }

        if (nexo1.isChecked() || nexo2.isChecked() || nexo3.isChecked() || nexo4.isChecked() || nexo5.isChecked()) {
            continuarButton3.setBackgroundResource(R.drawable.colorbutton);
            continuarButton3.setEnabled(true);
        } else {
            continuarButton3.setBackgroundResource(R.drawable.colorbuttonoff);
            continuarButton3.setEnabled(false);
        }

    }

    public void seleccionar() {
        if (nexo1.isChecked()) {
            nexo1.setChecked(true);
            continuarButton3.setEnabled(true);
            continuarButton3.setBackgroundResource(R.drawable.colorbutton);
        } else {
            nexo1.setChecked(false);
            continuarButton3.setEnabled(false);
            continuarButton3.setBackgroundResource(R.drawable.colorbuttonoff);

        }

    }

}



