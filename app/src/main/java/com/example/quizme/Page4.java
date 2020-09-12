package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Page4 extends AppCompatActivity {
    private Button finalizarButton;
    private CheckBox sin1, sin2, sin3, sin4, sin5, sin6, sin7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        finalizarButton = findViewById(R.id.finalizarButton);
        sin1 = findViewById(R.id.sintomasCheck1);
        sin2 = findViewById(R.id.sintomasCheck2);
        sin3 = findViewById(R.id.sintomasCheck3);
        sin4 = findViewById(R.id.sintomasCheck4);
        sin5 = findViewById(R.id.sintomasCheck5);
        sin6 = findViewById(R.id.sintomasCheck6);
        sin7 = findViewById(R.id.sintomasCheck7);

        seleccionar();

        finalizarButton.setOnClickListener(
                (v) -> {
                    Intent b = new Intent(this, MainActivity.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada, R.anim.transition);
                    finish();
                }

        );


    }

    public void onCheckboxClicked(View view) {

        switch (view.getId()) {
            case R.id.sintomasCheck1:

                break;
            case R.id.sintomasCheck2:

                break;
            case R.id.sintomasCheck3:

                break;
            case R.id.sintomasCheck4:

                break;
            case R.id.sintomasCheck5:

                break;
            case R.id.sintomasCheck6:

                break;

            case R.id.sintomasCheck7:

                break;


        }

        if (sin1.isChecked() || sin2.isChecked() || sin3.isChecked() || sin4.isChecked() || sin5.isChecked()) {
            finalizarButton.setBackgroundResource(R.drawable.colorbutton);
            finalizarButton.setEnabled(true);
        } else {
            finalizarButton.setBackgroundResource(R.drawable.colorbuttonoff);
            finalizarButton.setEnabled(false);
        }

    }


    public void seleccionar() {
        if (sin1.isChecked()) {
            sin1.setChecked(true);
            finalizarButton.setEnabled(true);
            finalizarButton.setBackgroundResource(R.drawable.colorbutton);
        } else {
            sin1.setChecked(false);
            finalizarButton.setEnabled(false);
            finalizarButton.setBackgroundResource(R.drawable.colorbuttonoff);

        }

    }

}