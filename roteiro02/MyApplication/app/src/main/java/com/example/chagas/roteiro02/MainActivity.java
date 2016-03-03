package com.example.chagas.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCor = (EditText) findViewById(R.id.digCor);
        ((Button)findViewById(R.id.button)).setOnClickListener(new Traduzir("TRADUZIR", null));
        ((Button)findViewById(R.id.button2)).setOnClickListener(new Traduzir("TRADUZIR", "FRANCES"));
        ((Button)findViewById(R.id.button3)).setOnClickListener(new Traduzir("TRADUZIR", "INGLES"));


    }

    private void capturarTexto() {
        String cor = mCor.getText().toString();
    }

    private class Traduzir implements View.OnClickListener{
        private String action;
        private String category;

        Traduzir(String action, String category){
            this.action = action;
            this.category = category;
        }

        @Override
        public void onClick(View v) {
            capturarTexto();
            Intent i = new Intent(this.action);
            if(this.category != null)
                i.addCategory(this.category);
            Bundle bundle = new Bundle();
            bundle.putString("COR", String.valueOf(mCor));
            i.putExtras(bundle);
            startActivity(i);

        }
    }
}
