package com.example.itc_recycleview;

import java.util.ArrayList;

public class UserPemain {
    String namaPemain,asalNegara,gaji,transfer,pindahKlub;

    int imagePemain;

    public UserPemain(String namaPemain, String asalNegara, String gaji, String transfer, String pindahKlub, int imagePemain) {
        this.namaPemain = namaPemain;
        this.asalNegara = asalNegara;
        this.gaji = gaji;
        this.transfer = transfer;
        this.pindahKlub = pindahKlub;
        this.imagePemain = imagePemain;
    }

    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public void setAsalNegara(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getPindahKlub() {
        return pindahKlub;
    }

    public void setPindahKlub(String pindahKlub) {
        this.pindahKlub = pindahKlub;
    }

    public int getImagePemain() {
        return imagePemain;
    }

    public void setImagePemain(int imagePemain) {
        this.imagePemain = imagePemain;
    }
}
