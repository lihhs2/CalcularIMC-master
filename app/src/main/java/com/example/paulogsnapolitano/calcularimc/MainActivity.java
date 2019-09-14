package com.example.paulogsnapolitano.calcularimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPeso;
    private EditText editTextAltura;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);

        textViewResultado = findViewById(R.id.textView);

        textViewResultado.setText("");

    }

    public void Calcular(View v) {

        String peso = editTextPeso.getText().toString().replace( ",", ".");
        String altura = editTextAltura.getText().toString().replace( ",", ".");

        Double pesoResult = Double.parseDouble(peso);
        Double alturaResult = Double.parseDouble(altura);

        Testes calc = new Testes();
        Double resultado = calc.Imc (pesoResult, alturaResult);
        String resultadoText = resultado.toString().replace( ".", ",");

        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoformatter = df.format(resultado).replace( ".", ",");

        String situacao = calc.situacao(resultado);

            textViewResultado.setText(resultadoformatter + "- " + situacao);

        editTextPeso.onEditorAction(EditorInfo.IME_ACTION_DONE);
        editTextAltura.onEditorAction(EditorInfo.IME_ACTION_DONE);

    }
}
