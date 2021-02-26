/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial58797;

/**
 *
 * @author josea
 */
public class Factorial58797 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double factorial = 1;
        
     double numero=15;   
     
     while ( numero!=0) {
  factorial=factorial*numero;
  numero--;
}
     System.out.println(factorial);
     
        
    }
    
}
