package com.ade.testkedua.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.ade.testkedua.R;
import com.ade.testkedua.utils.AspectRatioImageView;
import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import static com.ade.testkedua.activity.ListProductActivity.BERAT;
import static com.ade.testkedua.activity.ListProductActivity.HARGA;
import static com.ade.testkedua.activity.ListProductActivity.HARGABASE;
import static com.ade.testkedua.activity.ListProductActivity.HARGADISKON;
import static com.ade.testkedua.activity.ListProductActivity.JUDUL;
import static com.ade.testkedua.activity.ListProductActivity.KODE;
import static com.ade.testkedua.activity.ListProductActivity.SPESIFIKASI;
import static com.ade.testkedua.activity.ListProductActivity.URLIMAGE;

public class DetailProduct extends AppCompatActivity {

    TextView tvKode,tvJudul,tvHarga,tvHargadiskon,tvBerat,tvSpesifikasi,tvPrice,tvPriceDisc,tvPriceBase;

    AspectRatioImageView imgViwe;

    private CollapsingToolbarLayout collapsingToolbar;
    private AppBarLayout appBarLayout;

    private Menu collapsedMenu;
    private boolean appBarExpanded = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);

        Intent intent = getIntent();
        final String kode = intent.getStringExtra(KODE);
        final String judul = intent.getStringExtra(JUDUL);
        final String harga = intent.getStringExtra(HARGA);
        final String harga_diskon = intent.getStringExtra(HARGADISKON);
        final String harga_base = intent.getStringExtra(HARGABASE);
        final String berat = intent.getStringExtra(BERAT);
        final String spesifikasi = intent.getStringExtra(SPESIFIKASI);
        final String url = intent.getStringExtra(URLIMAGE);


        tvKode = (TextView)findViewById(R.id.kode);
        tvJudul = (TextView)findViewById(R.id.judul);
        tvHarga = (TextView)findViewById(R.id.harga);
        tvHargadiskon = (TextView)findViewById(R.id.hargaDiskon);
        tvBerat = (TextView)findViewById(R.id.berat);
        tvSpesifikasi = (TextView)findViewById(R.id.spesifikasi);
        imgViwe = (AspectRatioImageView)findViewById(R.id.imgProduk);

        tvPrice = (TextView)findViewById(R.id.price);
        tvPriceDisc = (TextView)findViewById(R.id.priceDiscount);
        tvPriceBase = (TextView)findViewById(R.id.priceBase);

        tvHarga.setPaintFlags(tvHarga.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);

        tvKode.setText("kode : "+kode);
        tvJudul.setText(judul);
        tvHarga.setText("Rp"+harga);
        tvHargadiskon.setText("Rp"+harga_diskon);
        tvBerat.setText("berat : "+berat+" KG");
        tvSpesifikasi.setText("Spesidikasi : "+spesifikasi);
        tvPrice.setText("Harga Jual : "+"Rp"+harga);
        tvPriceDisc.setText("Harga Discount : "+"Rp"+harga_diskon);
        tvPriceBase.setText("Modal : "+"Rp"+harga_base);
        Glide.with(getApplicationContext()).load(url).into(imgViwe);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_transparent);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        appBarLayout = (AppBarLayout) findViewById(R.id.appbar);


        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Detail Produk");
        collapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.d(DetailProduct.class.getSimpleName(), "onOffsetChanged: verticalOffset: " + verticalOffset);

                //  Vertical offset == 0 indicates appBar is fully expanded.
                if (Math.abs(verticalOffset) > 200) {
                    appBarExpanded = false;
                    invalidateOptionsMenu();
                } else {
                    appBarExpanded = true;
                    invalidateOptionsMenu();
                }
            }
        });


    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (collapsedMenu != null
                && (!appBarExpanded || collapsedMenu.size() != 1)) {
            //collapsed
//            collapsedMenu.add("Add")
//                    .setIcon(R.drawable.ic_add_black_24dp)
//                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        } else {
            //expanded
        }
        return super.onPrepareOptionsMenu(collapsedMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        collapsedMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_settings:
                return true;
        }
        if (item.getTitle() == "Add") {
            Toast.makeText(this, "clicked add", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
