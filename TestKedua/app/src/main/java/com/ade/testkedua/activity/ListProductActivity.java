package com.ade.testkedua.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.ade.testkedua.R;
import com.ade.testkedua.adapter.ProductAdapter;
import com.ade.testkedua.api.RetrofitClient;
import com.ade.testkedua.db.SharedPrefManager;
import com.ade.testkedua.db.User;
import com.ade.testkedua.model.ProductDataItem;
import com.ade.testkedua.model.ProductResponse;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListProductActivity extends AppCompatActivity implements ProductAdapter.OnItemClickListener {

    private ProductAdapter adapter;
    private RecyclerView recyclerView;

    private ArrayList<ProductDataItem> empDataList;

    public static final String KODE = "kode";
    public static final String JUDUL= "judul";
    public static final String HARGA = "harga";
    public static final String HARGADISKON = "harga_diskon";
    public static final String HARGABASE = "harga_base";
    public static final String BERAT = "berat";
    public static final String SPESIFIKASI = "spesifikasi";
    public static final String URLIMAGE = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        User user = SharedPrefManager.getInstance(getApplicationContext()).getUser();

        Call<ProductResponse> call = RetrofitClient.getInstance()
                .getApi().search(
                        user.getAccessToken()
                );

        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {

                empDataList = response.body().getProductData();

                if (empDataList != null) {
                    //if data is available, don't show the empty text

                    adapter = new ProductAdapter(getApplicationContext(), empDataList);
                    adapter.setOnItemClickListener(ListProductActivity.this);
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
                    recyclerView.setLayoutManager(manager);
//
                    recyclerView.setAdapter(adapter);


                }


            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {

            }
        });
    }


    @Override
    public void onItemClick(int position) {
        Intent detailIntent = new Intent(this, DetailProduct.class);
        ProductDataItem clickedItem = empDataList.get(position);
        NumberFormat formatter = new DecimalFormat("#,###");
        String formattedNumber = formatter.format(clickedItem.getPrice());
        String formattedNumber2 = formatter.format(clickedItem.getPriceDiscount());
        String formattedNumber3 = formatter.format(clickedItem.getPriceBase());
        String berat = String.valueOf(clickedItem.getWeight());

        detailIntent.putExtra(KODE, clickedItem.getProductCode());
        detailIntent.putExtra(JUDUL, clickedItem.getTitle());
        detailIntent.putExtra(HARGA, formattedNumber);
        detailIntent.putExtra(HARGADISKON, formattedNumber2);
        detailIntent.putExtra(HARGABASE, formattedNumber3);
        detailIntent.putExtra(BERAT, berat);
        detailIntent.putExtra(SPESIFIKASI, clickedItem.getSpesifikasi());
        detailIntent.putExtra(URLIMAGE, clickedItem.getPhoto().getOriginal());

        startActivity(detailIntent);
    }

}
