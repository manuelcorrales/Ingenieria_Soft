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
    public void metodoSumarTest(){
    ModuloAritmetica ma = new ModuloAritmetica();
    int a = 2;
    int b = 3;
    
    assertEquals(ma.sumar(a, b),5);
    }
    
    
    @Test
    public void metodoMultiplicarTest(){
    ModuloAritmetica ma = new ModuloAritmetica();
    int a = 2;
    int b = 3;
    
    assertEquals(ma.multiplicar(a, b),6);
    }
    
}
