/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author moise
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public long fibonacci(long numero) {
        if(numero == 1) {
            return 0;
        } else if (numero == 2) {
            return 1;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}
