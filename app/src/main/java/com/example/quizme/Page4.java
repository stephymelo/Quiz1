package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page4 extends AppCompatActivity {
    private Button finalizarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        finalizarButton=findViewById(R.id.finalizarButton);


        finalizarButton.setOnClickListener(
                (v)->{     Intent b=new Intent(this,MainActivity.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transition,R.anim.transitionentrada);
                    finish();
                }

        );


    }
}