package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import unittestsisw.*;

public class ModuloAritmeticaTest {

    public ModuloAritmeticaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void metodoSumarTest() {
        ModuloAritmetica ma = new ModuloAritmetica();
        int a = 2;
        int b = 3;
        int resultadoEsperado = a + b;
        assertEquals(ma.sumar(a, b), resultadoEsperado);
    }
    
    @Test
    public void metodoSumarErrorTest() {
        ModuloAritmetica ma = new ModuloAritmetica();
        int a = 2;
        int b = 3;
        int resultadoEsperado = a - b;
        assertFalse(ma.sumar(a, b) == resultadoEsperado);
    }

    @Test
    public void metodoMultiplicarTest() {
        ModuloAritmetica ma = new ModuloAritmetica();
        int a = 2;
        int b = 3;
        int resultadoEsperado = a * b;
        assertEquals(ma.multiplicar(a, b), resultadoEsperado);
    }

    @Test
    public void metodoRestarTest() {
        ModuloAritmetica ma = new ModuloAritmetica();
        int a = 2;
        int b = 3;
        int resultadoEsperado = -1;
        assertTrue(ma.restar(a, b) == resultadoEsperado);
    }

    @Test
    public void metodoDividirTest() {
        ModuloAritmetica ma = new ModuloAritmetica();
        int a = 2;
        int b = 3;
        double resultadoEsperado = 2/3;
        assertTrue(ma.dividir(a, b) == resultadoEsperado);

    }

}
