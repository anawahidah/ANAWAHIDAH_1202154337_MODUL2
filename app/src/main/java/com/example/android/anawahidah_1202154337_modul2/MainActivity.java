package com.example.android.anawahidah_1202154337_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi radio button
    private RadioButton mRb1, mRb2;
    //deklarasi button
    private RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup = findViewById(R.id.rg);
        Toast.makeText(this, "ANAWAHIDAH_1202154337", Toast.LENGTH_LONG).show();
    }

    public void pesanSekarang(View view) {
        //mendefinisikan radion button group jika di cek makan valuenya akan disimpan dalam sebuah variabel
        int selectedId = RadioGroup.getCheckedRadioButtonId();
        mRb1 = findViewById(R.id.rb1);
        mRb2 = findViewById(R.id.rb2);

        //mengecek apakah value yang terpilih sesuai dengan nilai radio groupnya kalau benar maka akan pindah tampilan
        if (selectedId == mRb1.getId()){
            Intent intent = new Intent(MainActivity.this, DineInActivity.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(MainActivity.this, TakeAwayActivity.class);
            startActivity(intent);
        }
    }
}
