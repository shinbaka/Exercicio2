package com.example.george.exercicio2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] candidatos = new String[]{"Albert Einsten\n" + "Partido dos fisicos", "Nikola Tesla\n" + "Partido energetico", "Alan Turing\n" + "Partido da computacao"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, candidatos);
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l , View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, Detalhes.class);
        it.putExtra("candidatoId", position);
        startActivity(it);
        Object obj = this.getListAdapter().getItem(position);
        String item = obj.toString();

        Toast.makeText(this, "Selecionado " + item, Toast.LENGTH_SHORT).show();
    }
}
