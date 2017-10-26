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

public class PrincipalActivity extends Activity {

    /**
     * Autor:Yuri Justini Acurccio 201510740
     */

    public static final String NUMERO = "com.tabuada.arqdsis.provaarqdesis.NUMERO";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    /**
     * Autor:Yuri Justini Acurccio 201510740
     */

    public void Calcular(View view) {
        Intent intent = new Intent(this,PrincipalActivity.class);
        String numero = ((TextView)findViewById(R.id.textView6)).getText().toString() ;
        String numero2= ((TextView)findViewById(R.id.textView7)).getText().toString() ;
        intent.putExtra(NUMERO,numero);
        intent.putExtra(NUMERO,numero2);
        startActivity(intent);
}

/**
 * Autor:Yuri Justini Acurccio 201510740
 */