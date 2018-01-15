/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testAll() {
        System.out.println("Probando getResultado");
        Calculadora instance = new Calculadora();

        // prueba del constructor
        assertEquals("Valor inicial de memoria no es 0", 0, instance.getMemory(), 1e-6);
        assertEquals("Valor inicial de resultado no es 0", 0 , instance.getResult(), 1e-6);
        
        //getter y setter
        
        instance.setResult(1000);
        assertEquals("Error tras setResultado/getResultado", 1000 , instance.getResult(), 1e-6);
        
        // 
        instance.clear();
        assertEquals("Error tras clear", 0 , instance.getResult(), 1e-6);
        instance.plus(20);
        assertEquals("Error tras sumar", 20 , instance.getResult(), 1e-6);
        instance.minus(5);
        assertEquals("Error tras restar", 15 , instance.getResult(), 1e-6);
        instance.multiply(20);
        assertEquals("Error tras multiplicar", 300 , instance.getResult(), 1e-6);
        instance.divide(3);
        assertEquals("Error tras dividir", 100 , instance.getResult(), 1e-6);
        instance.squareRoot();
        assertEquals("Error tras raíz cuadrada", 10 , instance.getResult(), 1e-6);
        instance.changeSign();
        assertEquals("Error tras cambio de signo", -10 , instance.getResult(), 1e-6);
        
        
        // prueba de memoria
        // result es - 10.
        instance.plusMemory();
        assertEquals("Error tras guardar a memoria y obtener memoria", -10 , instance.getMemory(), 1e-6);
        instance.plusMemory();
        assertEquals("Error tras guardar a memoria", -20 , instance.getMemory(), 1e-6);
        instance.setResult(5);
        instance.plusMemory();
        assertEquals("Error tras guardar a memoria", -15 , instance.getMemory(), 1e-6);       
        instance.clearMemory();
        assertEquals("Error tras borrar memoria", 0 , instance.getMemory(), 1e-6);       
        
    }

    
}
