package com.example.android.anawahidah_1202154337_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;
    //Daftar Menu
    private String[] menu = {"Paket 1", "Paket 2", "Paket 3", "Paket 4", "Paket 5", "Paket 6"};
    //Daftar Harga
    private String[] price = {"50.000", "40.000", "20.000", "75.000", "30.000", "15.000"};
    //Daftar Gambar
    private int[] image = {R.drawable.burger1, R.drawable.burger2, R.drawable.burger3, R.drawable.burger4, R.drawable.burger5,
            R.drawable.burger6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(Menu, Price, Gambar);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

    }

    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}
