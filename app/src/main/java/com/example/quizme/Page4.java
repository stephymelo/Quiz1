package com.example.quizme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Page4 extends AppCompatActivity {
    private Button finalizarButton;
    private CheckBox sin1, sin2, sin3, sin4, sin5, sin6, sin7;
    private PuntajeRiesgo puntajeRiesgo;
    private ArrayList<Names> usuarios = new ArrayList<>();
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public String name;
    public String id;
    public String puntaje;
    public int sumanex;


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
        puntajeRiesgo = new PuntajeRiesgo();
        name = getIntent().getStringExtra("name");
        id = getIntent().getStringExtra("id");
        sumanex = getIntent().getIntExtra("sumaNexo", 0);
        puntaje = "0";
        seleccionar();

        finalizarButton.setOnClickListener(
                (v) -> {
                    Intent b = new Intent(this, MainActivity.class);
                    puntajeRiesgo.sumaNexo();
                    puntajeRiesgo.sumaSintomas();
                    puntajeRiesgo.setSumaTotal(sumanex + puntajeRiesgo.getSumaSin());
                    puntaje = String.valueOf(puntajeRiesgo.getSumaTotal());
                    guardarDatos();
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada, R.anim.transition);
                    finish();
                }
        );

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.sintomasCheck1:
                if (checked) {
                    puntajeRiesgo.setOpcion1S(3);
                }
                break;
            case R.id.sintomasCheck2:
                if (checked) {
                    puntajeRiesgo.setOpcion2S(3);
                }
                break;
            case R.id.sintomasCheck3:
                if (checked) {
                    puntajeRiesgo.setOpcion3S(3);
                }
                break;
            case R.id.sintomasCheck4:
                if (checked) {
                    puntajeRiesgo.setOpcion4S(3);
                }
                break;
            case R.id.sintomasCheck5:
                if (checked) {
                    puntajeRiesgo.setOpcion5S(3);
                }
                break;
            case R.id.sintomasCheck6:
                if (checked) {
                    puntajeRiesgo.setOpcion6S(3);
                }
                break;

            case R.id.sintomasCheck7:
                if (checked) {
                    puntajeRiesgo.setOpcion7S(0);
                }
                break;


        }

        if (sin1.isChecked() || sin2.isChecked() || sin3.isChecked() || sin4.isChecked() || sin5.isChecked() || sin6.isChecked() || sin7.isChecked()) {
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

    public void guardarDatos() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String info=sharedPreferences.getString(TEXT,"");
        if(info.isEmpty()){

        }else{
            String[]infoArray=info.split(",");
            for(int i=0;i < infoArray.length;i++){
                String[]param=infoArray[i].split(" ");
                String name=param[0];
                String id=param[1];
                String puntaje=param[2];
                Names names=new Names(name,id,puntaje);
                usuarios.add(names);
            }
        }

        usuarios.add(new Names(name, id, puntaje));
        String concatusers = "";

        for (int i = 0; i < usuarios.size(); i++) {
            concatusers += (usuarios.get(i).getName() +" "+usuarios.get(i).getId() + " "+usuarios.get(i).getPuntaje() + ",");
        }

        editor.putString(TEXT, concatusers);

        editor.apply();

    }

}