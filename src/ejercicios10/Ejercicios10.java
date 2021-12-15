/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alumno
 */
public class Ejercicios10 {

    /**
     * @param args the command line arguments
     */
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
        String entradaUsuario;
        do{
            System.out.println("**************************************************");
            System.out.println("*  1. empieza por A                              *");
            System.out.println("*  2. empieza por A y acaba en número            *");
            System.out.println("*  3. no empieza por $ o digito                  *");
            System.out.println("*  4.                                            *");
            System.out.println("*  5.                                            *");
            System.out.println("*  6.                                            *");
            System.out.println("*  7.                                            *");
            System.out.println("*  8.                                            *");
            System.out.println("*  9.                                            *");
            System.out.println("* 10.                                            *");
            System.out.println("* 11.                                            *");
            System.out.println("*  0. Salir                                      *");
            System.out.println("**************************************************");
            entradaUsuario = sc.nextLine();
            switch(entradaUsuario){
                case "1":
                    ejercicio01();
                    break;
                case "2":
                    ejercicio02();
                    break;
                case "3":
                    ejercicio03();
                    break;
                case "4":
                    ejercicio04();
                    break;
                case "5":
                    ejercicio05();
                    break;
                case "6":
                    ejercicio06();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(!entradaUsuario.equals("0"));         
    }
    
    public static void ejercicio01(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();
        System.out.println(Pattern.matches("^[aA]+*",s)?"Empieza por a":"no empieza por a");
    }
    
    public static void ejercicio02(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();
        System.out.println(Pattern.matches("^[aA].*[\\d]$",s)
                ?"Empieza por a y termina en numero"
                :"no empieza por a ni termina en numero ");

    }
    
    public static void ejercicio03(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();
        System.out.println(Pattern.matches("^[$\\d]+",s)
                ?"No empieza por $ ni por un digito"
                :"Empieza por $ o por un digito");        
        
    }
    
    public static void ejercicio04(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();        
        System.out.println(comprobarEjercicio04(s)
                ?"si"
                :"no");        
        
    }
    public static boolean comprobarEjercicio04(String s){
        boolean result = true;
        result = s.length() != 3?false:true;
        
        for (int i = 0; i < s.length(); i++) {
            
            
        }
        
        
        return true;
    }
    
    public static void ejercicio05(){
        
    }
    
    public static void ejercicio06(){
        
    }
    
    public static void ejercicio07(){
        
    }
    
    public static void ejercicio08(){
        
    }
    
    public static void ejercicio09(){
        
    }
    
    public static void ejercicio10(){
        
    }
    
    public static void ejercicio11(){
        
    }
    
    
}
