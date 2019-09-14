package com.example.paulogsnapolitano.calcularimc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilTest {
    Testes calc;

    @Before
    public void setup() { calc  = new Testes();}

    @Test
    public void CalculaMagrezaTeste() {
        assertEquals(18.4, calc.Imc(47.3,1.60), 0.1);
    }

    @Test
    public void CalculaNormalTeste(){
        assertEquals(22.2, calc.Imc(50.0,1.50), 0.1);
    }

    @Test
    public void CalculaSobrepesoTeste(){
        assertEquals(27.7, calc.Imc(100.0,1.90),0.1);
    }

    @Test
    public void CalculaObesidadeTeste (){
        assertEquals(31.3, calc.Imc(80.0,1.60),0.1);
    }

    @Test
    public void CalculaObesidadeGrave() {
        assertEquals(118.3, calc.Imc(200.0,1.30), 0.1);
    }
}
