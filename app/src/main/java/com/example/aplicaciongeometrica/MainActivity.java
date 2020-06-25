package com.example.aplicaciongeometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNx1;
    private EditText editTextNx2;
    private EditText editTextNy1;
    private EditText editTextNy2;
    private Button buttonDistancia;
    private EditText editTextDistancia;
    private EditText editTextpendiente;
    private Button buttonPendiente;

    private void iniciar(){
        editTextNx1 = (EditText)findViewById(R.id.editTextNx1);
        editTextNx2 = (EditText)findViewById(R.id.editTextNx2);

        editTextNy1 = (EditText)findViewById(R.id.editTextNy1);
        editTextNy2= (EditText)findViewById(R.id.editTextNy2);
        editTextDistancia = (EditText)findViewById(R.id.editTextDistancia);
        editTextpendiente = (EditText)findViewById(R.id.editTextpendiente);

        //inicializar el boton
        buttonDistancia = (Button)findViewById(R.id.buttonDistancia);
        buttonPendiente = (Button)findViewById(R.id.buttonPendiente);

        //asignarle un controlador de eventos: listener
        buttonDistancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Distancia();
            }
        });
        buttonPendiente.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pendiente();
            }
        }));
    }

    private void  Distancia() {
        double x1 = Double.parseDouble(editTextNx1.getText().toString());
        double x2 = Double.parseDouble(editTextNx2.getText().toString());
        double y1 = Double.parseDouble(editTextNy1.getText().toString());
        double y2 = Double.parseDouble(editTextNy2.getText().toString());


        double Distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        editTextDistancia.setText(String.valueOf(Distancia));

    }


    //asignarle un controlador de eventos: listener



    private void pendiente() {
        double x1 = Double.parseDouble(editTextNx1.getText().toString());
        double x2 = Double.parseDouble(editTextNx2.getText().toString());
        double y1 = Double.parseDouble(editTextNy1.getText().toString());
        double y2 = Double.parseDouble(editTextNy2.getText().toString());

        double pendiente = ((y2-y1) / (x2-x1));
        editTextpendiente.setText(String.valueOf(pendiente));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar();
    }
}