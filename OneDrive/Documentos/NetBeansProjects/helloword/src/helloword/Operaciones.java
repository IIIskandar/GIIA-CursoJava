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
public class Operaciones {
    
    
    public double suma(double n1,double n2){
            
            return n1 + n2;
        }
    
    public double multi(double n1,double n2){
            
            return n1 * n2;
        }
    public double division(double n1,double n2){
            
            return n1 / n2;
        }
    public double resta(double n1,double n2){
            
            return n1 - n2;
        }
    
    public static boolean validarNumero(String numero){
            try{
                Double.parseDouble(numero);
                return true;
            }catch(NumberFormatException nfe){
                
            }
            return false;
        
    }
    
    public static boolean validarOperacion(String operacion){
        switch (operacion) {
            case "+":
            case "-":
            case "/":
            case "x":
                return true;
        }
        return false;
    }
    

    
    public static void main(String[] args) {
        
        
        if (args.length < 3 ||
            !validarNumero(args[0]) ||
            !validarOperacion(args[1]) ||
            !validarNumero(args[2])){
            System.out.println("Debe ingresar 2 numeros o un operador valido");
            return;
        }else if(args.length >3) {
            System.out.println("Debe ingresar solo 2 numeros");
            return;
        }
        
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        Operaciones c = new Operaciones();
        switch (args[1]) {
            case "+":
                {
                    System.out.println(n1 + " + " + n2 + " = " +c.suma(n1,n2));
                    break;
                }
            case "x":
                {
                    System.out.println(n1 + " x " + n2 + " = " +c.multi(n1, n2));
                    break;
                }
            case "/":
                {
                    System.out.println(n1 + " / " + n2 + " = " +c.division(n1, n2));
                    break;
                }
            case "-":
                {
                    System.out.println(n1 + " - " + n2 + " = " +c.resta(n1, n2));
                    break;
                }
        }
    }
    
}
