package com.example.tarea02;

/**
 * Creado por Marcos Julián Noriega Rodríguez 4/3/24
 */

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/* public class HolaTodos extends Activity{

    //@Override
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import androidx.appcompat.app.AppCompatActivity;  */

public class MainActivity extends AppCompatActivity {

    Button btnGoToIngresarPelicula;
    Button btnGoToInicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);

        btnGoToIngresarPelicula = findViewById(R.id.btn_go_to_ingresar_pelicula);
        btnGoToInicioSesion = findViewById(R.id.btn_go_to_inicio_sesion);

        btnGoToIngresarPelicula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IngresarPeliculaActivity.class));
            }
        });

        btnGoToInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InicioSesionActivity.class));
            }
        });
    }
}
