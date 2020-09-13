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
    public static final String SHARED_PREFS="sharedPrefs";
    public static final String TEXT="text";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        nameEdit=findViewById(R.id.nameEdit);
        identiEdit=findViewById(R.id.identiEdit);
        continuarButton2=findViewById(R.id.continueButton2);
        List<String> datos=new ArrayList<>();
        datos.add(nameEdit.getText().toString());
        datos.add(identiEdit.getText().toString());




        continuarButton2.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page3.class);
//                    b.putExtra("name", (Serializable) nameEdit);
//                    b.putExtra("id", (Serializable) identiEdit);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);

                    StringBuilder stringBuilder=new StringBuilder();
                    for(String s : datos){
                        stringBuilder.append(s);
                        stringBuilder.append(",");
                    }


                    guardarDatos();



                }

        );

    }

    public void guardarDatos(){


        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();

        editor.putString(TEXT,nameEdit.getText().toString());
        editor.putString(TEXT,identiEdit.getText().toString());
        editor.apply();



    }



}