package com.example.chagas.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrancesActivity extends AppCompatActivity {
    private String traducao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frances);

        TextView t = (TextView)findViewById(R.id.textView2);
        Intent i = getIntent();
        if(i != null){
            Bundle bundle = i.getExtras();
            if(bundle != null){
                String cor = bundle.getString("COR");
                if(cor.equalsIgnoreCase("amarelo")){
                    traducao = "Jaune";
                    t.setText("Tradução: "+traducao);
                }
                if(cor.equalsIgnoreCase("azul")){
                    traducao = "Bleu";
                    t.setText("Tradução: "+traducao);
                }
                if (cor.equalsIgnoreCase("vermelho")){
                    traducao = "Rouge";
                    t.setText("Tradução: "+traducao);
                }


            }
            ((Button)findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

    }
}
