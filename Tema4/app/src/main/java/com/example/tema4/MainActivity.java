package com.example.tema4;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
        TextView miTexto = (TextView) findViewById(R.id.texto);
        miTexto.setText("Nuevo texto a mostrar");
        miTexto.setTextColor(Color.RED);
        miTexto.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        miTexto.setTextSize(24);

        Button boton1 = findViewById(R.id.button1);
        Button boton2 = findViewById(R.id.button2);

        // Botón 1: animación de traslación
        boton1.setOnClickListener(view -> {
            Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.animacion);
            anim1.setRepeatMode(Animation.RESTART);
            anim1.setRepeatCount(20);
            miTexto.startAnimation(anim1);
        });

        // Botón 2: animación de rotación
        boton2.setOnClickListener(view -> {
            Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.rotar);
            anim2.setRepeatMode(Animation.RESTART);
            anim2.setRepeatCount(20);
            miTexto.startAnimation(anim2);
        });
    }
}