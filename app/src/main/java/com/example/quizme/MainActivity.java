package com.example.quizme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.example.quizme.Page2.SHARED_PREFS;
import static com.example.quizme.Page2.TEXT;

public class MainActivity extends AppCompatActivity {

    private Button continuar;
    private TextView resultados;
    private String namesito;
    private String re,texto;

    private PuntajeRiesgo puntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continuar=findViewById(R.id.continueButton);
        resultados=findViewById(R.id.resultadoText);
        puntaje=new PuntajeRiesgo();
        texto="";
        continuar.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page2.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);

                }

        );

        new Thread(
                ()-> {
                    loadData();




                }
        ).start();

    }




    public void resultadosText(){
        re=String.valueOf(puntaje.getSumaTotal());

    }
    public void loadData(){
        runOnUiThread(
                ()-> {

                    SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
                    String wordsString=sharedPreferences.getString(TEXT,"");

                    String[] users=wordsString.split(",");
                    for(int i=0;i<users.length;i++){
                        texto+=users[i]+"\n";

                    }

                    resultados.setText(texto);
                }
        );






    }



}