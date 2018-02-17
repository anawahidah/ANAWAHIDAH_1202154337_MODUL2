package com.example.android.anawahidah_1202154337_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilngkan toolbar (action bar)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //menghilngkan notification(yg ada jam, baterai dll)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //menghilangin toolbar dan notification lalu nampilin activitynya
        setContentView(R.layout.activity_splash);

        //ngatur timer lama muncul splashscreennya
        final Handler handler = new Handler();
        //post delay -> menampilkan activity setelah delay bbrp detik
        handler.postDelayed(new Runnable() {
            @Override
            public void run(){
                //intent -> mengubungkan ke activity lain
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                //ketika mengakhiri aplikasi agar tidak kembali ke spalsh
                finish();
            }
        }, 5000L); //5000L = 5 detik
    }
}
