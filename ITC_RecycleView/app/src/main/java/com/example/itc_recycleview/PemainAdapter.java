package com.example.itc_recycleview;

import android.service.autofill.TextValueSanitizer;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class PemainAdapter extends RecyclerView.Adapter<PemainAdapter.PemainViewHolder> {

    ArrayList<UserPemain> user;

    public PemainAdapter(ArrayList<UserPemain> user) {
        this.user = user;
    }

    @NonNull
    @Override
    public PemainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.bursa_pemain,parent,false);
        return new PemainViewHolder(view);
//        return new PemainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.bursa_pemain,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PemainViewHolder holder, int position) {
        holder.ivPemain.setImageResource(user.get(position).getImagePemain());
        holder.tvNama.setText(user.get(position).getNamaPemain());
        holder.tvPindahKlub.setText(user.get(position).getPindahKlub());
        holder.tvTransfer.setText(user.get(position).getTransfer());
        holder.tvGaji.setText(user.get(position).getGaji());
        holder.tvNegara.setText(user.get(position).getAsalNegara());
    }

    @Override
    public int getItemCount() {
        return user.size();
    }

    public class PemainViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPemain;
        TextView  tvNama, tvPindahKlub, tvTransfer,tvGaji,tvNegara;
        public PemainViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPemain = itemView.findViewById(R.id.iv_pemain);
            tvNama = itemView.findViewById(R.id.tv_namaPemain);
            tvPindahKlub = itemView.findViewById(R.id.tv_pindahKlub);
            tvGaji = itemView.findViewById(R.id.tv_gaji);
            tvTransfer = itemView.findViewById(R.id.tv_transfer);
            tvNegara = itemView.findViewById(R.id.tv_asalNegara);
        }
    }
}
