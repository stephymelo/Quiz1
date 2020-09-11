package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Page2 extends AppCompatActivity {

    private EditText nameEdit;
    private EditText identiEdit;
    private Button continuarButton2;
    ArrayList<Names> namesitos = new ArrayList<Names>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        nameEdit=findViewById(R.id.nameEdit);
        identiEdit=findViewById(R.id.identiEdit);
        continuarButton2=findViewById(R.id.continueButton2);



        continuarButton2.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page3.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);


                }

        );

    }

}