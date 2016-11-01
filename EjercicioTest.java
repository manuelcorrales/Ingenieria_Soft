Clase EjercicioTest (junit file)


package tests;


import unittestsisw.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;




public class EjercicioTest {
    
    public EjercicioTest() {
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
    public void getNivelEjercicioTest(){
    Ejercicio a = new Ejercicio(new Profesor(), new Nivel());
    Nivel n = a.getNivelEjercicio();
    }
    
    @Test
    public void getCreadorTest(){
    Ejercicio a = new Ejercicio(new Profesor(), new Nivel());
    Profesor p= a.getCreador();
    }


    @Test
    public void setCreadorTest(){
    Profesor profe = new Profesor();
    Ejercicio a = new Ejercicio();
    a.setCreador(profe);
    }
    
    @Test
    public void setNivelEjercicio(){
    Nivel nivel = new Nivel();
    Ejercicio a = new Ejercicio();
    a.setNivelEjercicio(nivel);
    }
}
