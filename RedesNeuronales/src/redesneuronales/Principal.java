/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesneuronales;

import java.io.IOException;

/**
 *
 * @author Juan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException 
    {
        String  dir ="../RedesNeuronales/src/arff/prueba.arff";
        RedesNeuronales red = new RedesNeuronales();
        red.perceptron_multicapa(dir, 1);
        
    }
    
}
