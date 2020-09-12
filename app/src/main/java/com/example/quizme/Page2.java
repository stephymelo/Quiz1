package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Page2 extends AppCompatActivity {

    private EditText nameEdit;
    private EditText identiEdit;
    private Button continuarButton2;
    ArrayList<String> namesitos = new ArrayList<String>();
    ArrayList<String> identis = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        nameEdit=findViewById(R.id.nameEdit);
        identiEdit=findViewById(R.id.identiEdit);
        continuarButton2=findViewById(R.id.continueButton2);

        String name=nameEdit.getText().toString();
        String identi=identiEdit.getText().toString();


        continuarButton2.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page3.class);
//                    b.putExtra("name", (Serializable) nameEdit);
//                    b.putExtra("id", (Serializable) identiEdit);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);
                    guardarDatos();



                }

        );

    }

    public void guardarDatos(){
        namesitos.add(nameEdit.getText().toString());
        identis.add(identiEdit.getText().toString());
        Log.e("name",""+namesitos.get(0));

    }

}