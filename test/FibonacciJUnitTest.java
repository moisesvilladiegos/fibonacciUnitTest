/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fibonacci.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moise
 */
public class FibonacciJUnitTest {
    
    Fibonacci fibonacci = new Fibonacci();
    
    @Test
    public void testFibonacci1(){
        long esperado = 0L;
        long resultado = fibonacci.fibonacci(1);
        assertEquals(0, resultado);
    }
    
    @Test
    public void testFibonacci2(){
        long esperado = 1L;
        long resultado = fibonacci.fibonacci(2);
        assertEquals(1, resultado);
    }
}
