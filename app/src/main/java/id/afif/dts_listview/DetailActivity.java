package id.afif.dts_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView txtName;
    private TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle(getIntent().getStringExtra("nama_negara"));

        txtName = findViewById(R.id.tv_Name);
        txtDetail = findViewById(R.id.tv_Detail);

        txtName.setText(getIntent().getStringExtra("nama_negara"));
        txtDetail.setText(getIntent().getStringExtra("detail_negara"));
    }
}