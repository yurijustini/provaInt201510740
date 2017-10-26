package com.tabuada.arqdsis.provaarqdesis;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Autor:Yuri Justini Acurccio 201510740
 */
public class SecundariaActivity extends Activity {

    /**
     * Autor:Yuri Justini Acurccio 201510740
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        Intent intent = getIntent();
        String retorno = intent.getStringExtra(PrincipalActivity.NUMERO);
        TextView view = (TextView)findViewById(R.id.btCalc);
        view.setText(RealizarTabuada(retorno))
    }

    /**
     * Autor:Yuri Justini Acurccio 201510740
     */
    public String RealizarTabuada(String tabuada)
    {
        for (int i = 0; i < tabuada.length();i++){


            }

        }


    }

