package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity {
    private Button continuarButton3;
    private CheckBox nexo1,nexo2,nexo3,nexo4,nexo5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        continuarButton3=findViewById(R.id.continuarButton3);
        nexo1=findViewById(R.id.checkNexo1);
        nexo2=findViewById(R.id.checkNexo2);
        nexo3=findViewById(R.id.checkNexo3);
        nexo4=findViewById(R.id.checkNexo4);
        nexo5=findViewById(R.id.checkNexo5);
        seleccionar();



        continuarButton3.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page4.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);


                }


        );

    }




    public void seleccionar(){
        if(nexo1.isChecked()) {
            nexo1.setChecked(true);
            Log.e("yes", "" + nexo1);
            continuarButton3.setEnabled(true);
        }else{
            nexo1.setChecked(false);
            continuarButton3.setEnabled(false);
            continuarButton3.setBackgroundResource(R.drawable.colorbuttonoff);

        }



    }



}