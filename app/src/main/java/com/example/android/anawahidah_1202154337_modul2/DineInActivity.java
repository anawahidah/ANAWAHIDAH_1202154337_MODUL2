package com.example.android.anawahidah_1202154337_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        Toast.makeText(this, "Dine In", Toast.LENGTH_LONG).show();

        //menginstance spinner kemudian mendifinisikan id kedalam instance tersebut
        spinner = findViewById(R.id.sp);

        //membuat sebuah fungsi agar data resource untuk spinnernya bisa muncul ketika di drop down
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //mengecek apakah spinner itu kosong atau tidak kalau ada isinya makanya datanya bisa didrop down
        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }

    public void showPesan(View view) {
        //membuat kondisi jika item dari spinner terpilih maka akan menampilkan sebuah toast dan pindah ke tampilan berikutnya
        String meja = spinner.getSelectedItem().toString();
        if (meja != null){
            Intent intent = new Intent(DineInActivity.this, RecyclerViewActivity.class);
            Toast.makeText(this, meja + " Telah Terpilih", + Toast.LENGTH_LONG).show();
            startActivity(intent);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSpinnerlabel = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
