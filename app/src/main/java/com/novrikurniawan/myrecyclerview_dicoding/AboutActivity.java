package com.novrikurniawan.myrecyclerview_dicoding;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {
    private String title = "Tentang saya";

    private String url_profil = "https://www.dicoding.com/images/small/avatar/20190807215223049e880996a6511ed6278dcffa1dd445.jpg";
    private String nama = "Novri Kurniawan";
    private String email = "novrikurniawan19@gmail.com";

    private ImageView iVProfil;
    private TextView tVNama, tVEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        setActionBarTitle(title);

        iVProfil = findViewById(R.id.img_profil);
        tVNama = findViewById(R.id.tV_nama);
        tVEmail = findViewById(R.id.tv_email);

        Glide.with(getApplicationContext())
                .load(url_profil)
                .apply(new RequestOptions().override(200,200))
                .into(iVProfil);

        tVNama.setText(nama);
        tVEmail.setText(email);
    }

    private void setActionBarTitle (String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
