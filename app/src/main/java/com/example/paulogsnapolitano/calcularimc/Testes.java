package com.example.paulogsnapolitano.calcularimc;

public class Testes {
    public Double Imc (Double peso, Double altura) {
        return peso / (altura * altura);
    }

    public String situacao (Double imc) {
        String situacao = "";

        if (imc < 18.5) {
            situacao = "- Magreza:";

        } else if (imc >= 18.5 && imc <= 24.9) {
            situacao = "- Saudável:";

        } else if (imc >= 25.0 && imc <= 29.9) {
            situacao = "- Sobrepeso:";

        } else if (imc >= 30.0 && imc <= 34.9) {
            situacao = "- Obesidade Grau 1:";

        } else if (imc >= 35.0 && imc <= 39.9) {
            situacao = "- Obesidade Severa Grau 2:";

        } else if (imc > 40.0) {
            situacao = "- Obesidade Mórbita Grau 3:";
        }
        return situacao;
    }
}
