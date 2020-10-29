package com.example.progmob2020.Model;

public class MahasiswaDebugging {
    private String nama;
    private String nim;
    private String notlp;

    public MahasiswaDebugging(String nama, String nim, String notlp) {
        this.nama = nama;
        this.nim = nim;
        this.notlp = notlp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }
}