/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

/**
 *
 * @author C-Lug
 */
public class Taller2Numeros {
    
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println("Numero del 1 al 100 sin incluir 2 y 5");
        for (int j = 0; j < 100; j++) {
            if (j  == a) {
                a=a+10;
                continue;
            }else if (j == b) {
                b=b+10;
                continue;
            }else{
                System.out.println(j);
            }
        }
        
        System.out.println("Numeros pares desde el 1539 al 2505");
        for (int i = 1539; i < 2505; i++) {
            i++;
            System.out.println(i);
        }
        
    }
}
