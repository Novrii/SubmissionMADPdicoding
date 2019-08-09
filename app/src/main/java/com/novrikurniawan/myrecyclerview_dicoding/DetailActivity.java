package com.novrikurniawan.myrecyclerview_dicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    private String title = "Detail Kelas";

    public static final String EXTRA_GAMBAR = "extra_gambar";
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_OLEH = "extra_oleh";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setActionBarTitle(title);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String gambar = getIntent().getStringExtra(EXTRA_GAMBAR);
        String oleh = getIntent().getStringExtra(EXTRA_OLEH);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);

        TextView tVNama = findViewById(R.id.tV_detail_nama);
        ImageView iVGambar = findViewById(R.id.iV_detail_gambar);
        TextView tVOleh = findViewById(R.id.tV_detail_oleh);
        TextView tvHarga = findViewById(R.id.tv_detail_harga);
        TextView tVDeskripsi = findViewById(R.id.tV_text_deskripsi);

        String olehh = "oleh "+oleh;

        tVNama.setText(nama);
        Glide.with(getApplicationContext())
                .load(gambar)
                .into(iVGambar);
        tVOleh.setText(olehh);
        tvHarga.setText(harga);
        tVDeskripsi.setText(deskripsi);

    }

    private void setActionBarTitle (String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
