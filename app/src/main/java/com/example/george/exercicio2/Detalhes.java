package com.example.george.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detalhes extends AppCompatActivity {
    String nome;
    int votar = 0;
    String[] candidatos = new String[]{"Albert Einstein", "Nikola Tesla", "Alan Turing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        int candidatoId = 3;
        Intent it = getIntent();

        String[] partidos = new String[]{"Partido dos fisicos", "Partido Energetico", "Partido da computacao"};
        Integer[] imageId = new Integer[]{R.drawable.einstein, R.drawable.nikola, R.drawable.alan};

        ImageView iv = (ImageView)findViewById(R.id.iv);
        TextView tvNome = (TextView)findViewById(R.id.tvNome);
        TextView tvPartido = (TextView)findViewById(R.id.tvPartido);

        if(it != null){
            candidatoId = it.getIntExtra("candidatoId",3);
        }

        if(candidatoId == 3){
            tvNome.setText("");
            tvPartido.setText("");
        } else if(candidatoId == 0){
            iv.setImageResource(imageId[candidatoId]);
            tvNome.setText(candidatos[candidatoId]);
            tvPartido.setText(partidos[candidatoId]);
            nome = "Albert Einstein";

        }else if(candidatoId == 1){
            iv.setImageResource(imageId[candidatoId]);
            tvNome.setText(candidatos[candidatoId]);
            tvPartido.setText(partidos[candidatoId]);
            nome = "Nikola Tesla";
        }else if(candidatoId == 2){
            iv.setImageResource(imageId[candidatoId]);
            tvNome.setText(candidatos[candidatoId]);
            tvPartido.setText(partidos[candidatoId]);
            nome = "Alan Turing";
        }


    }

//    if(votar == 1){
//        Toast.makeText(Detalhes.this, "Você já votou", Toast.LENGTH_SHORT).show();
//    } else {
        public int voto (View view){

        Button bt = (Button)findViewById(R.id.button);
        Toast.makeText(Detalhes.this, "Votou no " + nome, Toast.LENGTH_SHORT).show();
        int votar = 1;
        bt.setVisibility(View.INVISIBLE);
        return votar;

        }

}
