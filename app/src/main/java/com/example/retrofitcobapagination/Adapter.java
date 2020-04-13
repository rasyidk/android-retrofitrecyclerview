package com.example.retrofitcobapagination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter {

    private static final String TAG = "RecyclerAdapter";
    List<ValueLaporan> laporanList;


    public Adapter(List<ValueLaporan> moviesList) {
        this.laporanList = moviesList;
    }

    @Override
    public int getItemViewType(int position) {
        if (laporanList.get(position).getImg_laporan().toLowerCase().contains("kosong")) {
            return 0;
        }
        return 1;
    }

    @Override
    public int getItemCount() {
        return laporanList.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;

        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.row, parent, false);
            return new ViewHolderOne(view);
        }

        view = layoutInflater.inflate(R.layout.row_image, parent, false);
        return new ViewHolderTwo(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (laporanList.get(position).getImg_laporan().toLowerCase().contains("kosong")) {
            ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            viewHolderOne.tv_judul.setText(laporanList.get(position).getJudul_laporan());
        }else{
            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
            viewHolderTwo.tv_judul.setText(laporanList.get(position).getJudul_laporan());
        }
    }

    class ViewHolderOne extends RecyclerView.ViewHolder {

        private TextView tv_judul;
        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            tv_judul = (TextView)itemView.findViewById(R.id.tv_judul);
        }
    }


    class ViewHolderTwo extends RecyclerView.ViewHolder {

        private TextView tv_judul;
        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            tv_judul = (TextView)itemView.findViewById(R.id.tv_judulimage);
        }
    }
}
