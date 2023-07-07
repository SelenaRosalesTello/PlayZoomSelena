package com.selena.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.selena.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private Button btnGetStarted;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v->{
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        binding.fabAddMovie.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(), "Add a movie" , Snackbar.LENGTH_SHORT).show();
        });
        binding.textMovie.setText("Mira tu pelicula\nfavorita.");

        binding.fabAddMovie.setOnClickListener(view -> {
            String[] msg = {
                    "Hello!",
                    "Welcome",
                    "Go with me",
                    "come on"
            };
            int mensajeAleatorio = (int) (Math.random() * msg.length);
            String mensajeElegido = msg[mensajeAleatorio];
            Snackbar.make(binding.getRoot(), mensajeElegido,Snackbar.LENGTH_SHORT).show();
        });



    }
}