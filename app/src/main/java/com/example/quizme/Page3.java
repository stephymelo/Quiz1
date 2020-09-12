package com.example.quizme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

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
//        String name=getIntent().getExtras().getString("name");
//        String id=getIntent().getExtras().getString("id");
//        Serializable namesito =getIntent().getExtras().getSerializable("name");


      seleccionar();

        continuarButton3.setOnClickListener(
                (v)->{     Intent b=new Intent(this,Page4.class);
                    startActivity(b);
                    overridePendingTransition(R.anim.transitionentrada,R.anim.transition);


                }


        );

    }


    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkNexo1:
                if(checked){
                    Log.e("check","check");
                }

            break;
            case R.id.checkNexo2:

                break;
            case R.id.checkNexo3:

                break;
            case R.id.checkNexo4:

                break;
            case R.id.checkNexo5:

                break;

        }

        if(nexo1.isChecked()|| nexo2.isChecked() || nexo3.isChecked() || nexo4.isChecked() || nexo5.isChecked() ){
            continuarButton3.setBackgroundResource(R.drawable.colorbutton);
            continuarButton3.setEnabled(true);
        }
        else{
            continuarButton3.setBackgroundResource(R.drawable.colorbuttonoff);
            continuarButton3.setEnabled(false);
        }

    }

    public void seleccionar() {
        if (nexo1.isChecked()) {
            nexo1.setChecked(true);
            continuarButton3.setEnabled(true);
            continuarButton3.setBackgroundResource(R.drawable.colorbutton);
        } else {
            nexo1.setChecked(false);
            continuarButton3.setEnabled(false);
            continuarButton3.setBackgroundResource(R.drawable.colorbuttonoff);

        }

    }

    }



