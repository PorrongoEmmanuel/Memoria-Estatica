/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodememoriaestatica;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel
 */
public class Usodememoriaestatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero[]= new int[5];
        int numerotes[]= new int[numero.length];
        String palabras[]= new String[5];
        int i;
        for(i=0; i<5; i++){
            numero[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el elemnto del indice " + i));
        }
        //mostrando los datos como los ingresmos
        System.out.println("los datos sin ordenar  son");
        for(i=0; i<5; i++){
            System.out.println("["+numero[i]+"]");
            
        }
        System.out.println("\nlos datos ordenados son: ");
        Arrays.sort(numero);//ordenamos al arreglo
        for(i=0; i<5; i++){
            System.out.println("["+numero[i]+"]");
            
            
    }
    //arreglo palabras
    Arrays.fill(palabras, "bienvenido");
    System.out.println("elementos del areglo palabras");
for(i=0; i<5; i++){
   System.out.println("["+palabras[i]+"]"); 
   }
//copiando los elementos del arreglo numeros
System.arraycopy(numero, 0, numerotes, 0, numero.length);
   System.out.println("elementos del areglo NUMEROTES");
for(i=0; i<5; i++){
   System.out.println("["+numerotes[i]+"]"); 
    }
}
    }
