/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import java.util.Scanner;

/**
 *
 * @author C-Lug
 */
public class AdivinarNumero {
    public static void main(String[] args) {
        int numeroRandon = new java.util.Random().nextInt(100);
        System.out.println(numeroRandon);
        Scanner scanIn = new Scanner (System.in);
        System.out.print("Por favor, ingrese un numero: ");
        int numeroUsuario= scanIn.nextInt();
        
        while(numeroUsuario != numeroRandon){
            
            if (numeroUsuario < numeroRandon) {
                System.out.print("Cerca, el numero que ingresaste es menor, intenta de nuevo: ");
                numeroUsuario = scanIn.nextInt();
            }else{
                System.out.print("Cerca, el numero que ingresaste es mayor, intenta de nuevo: ");
                numeroUsuario = scanIn.nextInt();
            }
            
        }
        System.out.println("Adivinaste el numero era: " + numeroRandon);
    }
}
