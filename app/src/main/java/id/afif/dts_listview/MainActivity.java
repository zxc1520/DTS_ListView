package id.afif.dts_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import id.afif.dts_listview.collections.Negara;
import id.afif.dts_listview.collections.NegaraData;

public class MainActivity extends AppCompatActivity {

    private NegaraAdapter negaraAdapter;

    private ListView listView;
    private ArrayList<Negara> dataNegara = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List Negara");

        // Listview Binding
        listView = findViewById(R.id.lvNegara);

        dataNegara.addAll(NegaraData.getNegara());

        negaraAdapter = new NegaraAdapter(dataNegara, MainActivity.this);
        listView.setAdapter(negaraAdapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int pos, long id){
               Toast.makeText(MainActivity.this, "Anda Memilih: " + dataNegara.get(pos).getNama(), Toast.LENGTH_SHORT)
                       .show();

               Intent intent = new Intent(parent.getContext(), DetailActivity.class);
               intent.putExtra("nama_negara", dataNegara.get(pos).getNama());
               intent.putExtra("detail_negara", dataNegara.get(pos).getDetail());

               view.getContext().startActivity(intent);
           }
        });

    }
}