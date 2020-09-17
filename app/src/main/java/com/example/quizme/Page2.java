package com.example.quizme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.example.quizme.Page4.SHARED_PREFS;
import static com.example.quizme.Page4.TEXT;

public class Page2 extends AppCompatActivity {

    private EditText nameEdit;
    private EditText identiEdit;
    private Button continuarButton2;
    private String name;
    private String id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        nameEdit = findViewById(R.id.nameEdit);
        identiEdit = findViewById(R.id.identiEdit);
        continuarButton2 = findViewById(R.id.continueButton2);
        id="";


        continuarButton2.setOnClickListener(

                (v) -> {
                    SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
                    String info=sharedPreferences.getString(TEXT,"");
                    name = nameEdit.getText().toString();
                    id = identiEdit.getText().toString();
                    if(info.contains(id)) {
                        Toast.makeText(this, "este user ya existe", Toast.LENGTH_SHORT).show();
                    }else{
                            Intent b = new Intent(this, Page3.class);
                            b.putExtra("name", name);
                            b.putExtra("id", id);
                            startActivity(b);
                            overridePendingTransition(R.anim.transitionentrada, R.anim.transition);
                        }

                    }

        );



    }


}

