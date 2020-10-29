package com.example.progmob2020.Pertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.progmob2020.Adapter.MahasiswaRecyclerAdapter;
import com.example.progmob2020.Model.Mahasiswa;
import com.example.progmob2020.R;

import java.util.ArrayList;
import java.util.List;

public class DebuggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debugging);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvLatihan);
        MahasiswaRecyclerAdapter mahasiswaRecyclerAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa( "Harold", "72160050","082223177098");
        Mahasiswa m2 = new Mahasiswa( "Imanuel", "72160051","0815232224545");
        Mahasiswa m3 = new Mahasiswa( "escobar", "72160052","081320003211");
        Mahasiswa m4 = new Mahasiswa( "Emilio", "72160053","081299992211");
        Mahasiswa m5 = new Mahasiswa( "Gaviria", "72160054","081234543210");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        List<Mahasiswa> mahasiswaListDebug = new ArrayList<Mahasiswa>();

        mahasiswaRecyclerAdapter = new MahasiswaRecyclerAdapter(DebuggingActivity.this);
        mahasiswaRecyclerAdapter.setMahasiswaList(mahasiswaListDebug);

        rv.setLayoutManager(new LinearLayoutManager(DebuggingActivity.this));
        rv.setAdapter(mahasiswaRecyclerAdapter);
    }
}