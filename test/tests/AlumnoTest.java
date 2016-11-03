package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import unittestsisw.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
/**
 *
 * @author fernando
 */
public class AlumnoTest {
    
    public AlumnoTest() {
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
    public void nuevoAlumnoTest(){
    Alumno a = new Alumno();
    int nivel = a.getNivelAlumno().getNumeroNivel();
    assertEquals(nivel, 0);
    }

    @Test
    public void metodoSubirNivelTest(){
    Alumno a = new Alumno();
    int numeroNivelEsperado = 1;
    a.subirNivel();
    assertEquals(a.getNivelAlumno().getNumeroNivel(), numeroNivelEsperado);
    }
    
    @Test
    public void atributoNivelNoNuloTest(){
    Alumno a = new Alumno();
    assertNotNull(a.getNivelAlumno());  
    }
}
