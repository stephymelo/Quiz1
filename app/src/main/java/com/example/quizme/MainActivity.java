package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final int CODE=0;
    private Button continuar;
    private TextView resultados;
    private String name;
    private String nameSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continuar=findViewById(R.id.continueButton);
        resultados=findViewById(R.id.resultadoText);

        continuar.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page2.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);

                }

        );



    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CODE && resultCode==RESULT_OK){
            name=data.getExtras().getString("name");

            if(name.equals("blanco")){

            }

        }
    }
}