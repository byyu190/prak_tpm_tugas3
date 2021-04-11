package com.examples.Tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<LibModel> listLib = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Library");

        rv = findViewById(R.id.rvLib);
        rv.setHasFixedSize(true);
        listLib.addAll(LibData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        LibAdapter libAdapter = new LibAdapter(listLib,this);
        rv.setAdapter(libAdapter);

    }
}