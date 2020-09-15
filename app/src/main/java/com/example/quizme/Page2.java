package com.example.quizme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Page2 extends AppCompatActivity {

    private EditText nameEdit;
    private EditText identiEdit;
    private Button continuarButton2;
    private ArrayList<Names>usuarios=new ArrayList<>();;
    public static final String SHARED_PREFS="sharedPrefs";
    public static final String TEXT="text";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        nameEdit=findViewById(R.id.nameEdit);
        identiEdit=findViewById(R.id.identiEdit);
        continuarButton2=findViewById(R.id.continueButton2);










        continuarButton2.setOnClickListener(

                (v)->{     Intent b=new Intent(this,Page3.class);
                    guardarDatos();

                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);
                }

        );

    }

    public void guardarDatos(){
        usuarios.add(new Names(nameEdit.getText().toString(),identiEdit.getText().toString(),"PUNTAJE"));

        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();

        String concatusers = "";
        for(int i=0;i<usuarios.size();i++) {
            concatusers+=(usuarios.get(i).getName()+" "+usuarios.get(i).getPuntaje()+",");
        }
        editor.putString(TEXT, concatusers);
        Log.e("array","list"+usuarios.size());


        editor.apply();



    }



}