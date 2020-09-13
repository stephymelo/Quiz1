package com.example.quizme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.quizme.Page2.SHARED_PREFS;
import static com.example.quizme.Page2.TEXT;

public class MainActivity extends AppCompatActivity {

    private Button continuar;
    private TextView resultados;
    private String namesito;
    private String re;
    private PuntajeRiesgo puntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continuar=findViewById(R.id.continueButton);
        resultados=findViewById(R.id.resultadoText);
        puntaje=new PuntajeRiesgo();
        continuar.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page2.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);

                }

        );
        loadData();
     resultadosText();



    }


    public void resultadosText(){
        re=String.valueOf(puntaje.getSumaTotal());
        resultados.setText(namesito);
    }
    public void loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        namesito=sharedPreferences.getString(TEXT,"");
    }



}