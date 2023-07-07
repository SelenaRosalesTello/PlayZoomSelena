package com.selena.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.selena.playzoom.databinding.ActivityInicialBinding;

public class InicialActivity extends AppCompatActivity {
    private ActivityInicialBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityInicialBinding.inflate(getLayoutInflater());
        new CountDownTimer(3000,1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish(){
                Intent intent = new Intent(InicialActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }.start();
        setContentView(R.layout.activity_inicial);
    }
}