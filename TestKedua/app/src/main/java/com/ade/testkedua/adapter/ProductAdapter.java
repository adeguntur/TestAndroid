package com.ade.testkedua.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ade.testkedua.R;
import com.ade.testkedua.model.ProductDataItem;
import com.ade.testkedua.model.RumahSakit;
import com.ade.testkedua.model.RumahsakitItem;
import com.bumptech.glide.Glide;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.EmployeeViewHolder> {

    private Context mContext;
    private ArrayList<ProductDataItem> dataList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }


    public ProductAdapter(Context context, ArrayList<ProductDataItem> dataList) {
        mContext = context;
        this.dataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.row_employee, parent, false);
        return new EmployeeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.kode.setText("kode : "+dataList.get(position).getProductCode());

        holder.judul.setText(dataList.get(position).getTitle());

        int price = dataList.get(position).getPrice();
        NumberFormat formatter = new DecimalFormat("#,###");
        String formattedNumber = formatter.format(price);
        holder.harga.setText("Rp"+formattedNumber);

        int priceDiscount = dataList.get(position).getPriceDiscount();
        NumberFormat priceDiscountformatter = new DecimalFormat("#,###");
        String formattedDiscount = priceDiscountformatter.format(priceDiscount);
        holder.hargaDiskon.setText("Rp"+formattedDiscount);

        String imagecuy = dataList.get(position).getPhoto().getOriginal();

        if(dataList.get(position).getPhoto().getOriginal() != null){
            Glide.with(mContext).load(imagecuy).into(holder.mImageView);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null) ? 0 : dataList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView judul, harga,kode,hargaDiskon;
        public ImageView mImageView;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            judul = (TextView) itemView.findViewById(R.id.judul);
            harga = (TextView) itemView.findViewById(R.id.harga);
            hargaDiskon = (TextView) itemView.findViewById(R.id.hargaDiskon);
            kode = (TextView) itemView.findViewById(R.id.kode);

            harga.setPaintFlags(harga.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);

            mImageView = (ImageView) itemView.findViewById(R.id.image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}