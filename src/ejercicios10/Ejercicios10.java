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
            System.out.println("*********************************************");
            System.out.println("*  1. empieza por A                         *");
            System.out.println("*  2. empieza por A y acaba en número       *");
            System.out.println("*  3. no empieza por $ o digito             *");
            System.out.println("*  4.                                       *");
            System.out.println("*  5.                                       *");
            System.out.println("*  6.                                       *");
            System.out.println("*  7.                                       *");
            System.out.println("*  8.                                       *");
            System.out.println("*  9.                                       *");
            System.out.println("* 10.                                       *");
            System.out.println("* 11.                                       *");
            System.out.println("*  0. Salir                                 *");
            System.out.println("*********************************************");
            entradaUsuario = sc.nextLine();
            String s = "";
            switch(entradaUsuario){
                case "1":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[aA].*",s));
                    break;
                case "2":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[aA].*[\\d]$",s));
                    break;
                case "3":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[^$\\d].*",s));
                    break;
                case "4":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();        
                    System.out.println(Pattern.matches("[aAbBcC]{3}",s));
                    break;
                case "5":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(!Pattern.matches("[1-9][0-9]",s));
                    break;
                case "6":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("\\d{4}[A-Z]{2}",s));
                    break;
                case "7":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("[A-Za-z]{5,10}",s));
                    break;
                case "8":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches(".*\\.docx|.*\\.doc",s));
                    break;
                case "9":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches(".*[aA].*[eE].*[iI].*[oO].*[uU].*",s));
                    System.out.println(Pattern.matches(".*[aA][^eEiIoOuU]*[eE][^iIoOuU]*[iI][^oOuU]*[oO][^uU]*[uU].*",s));
                    break;
                case "10":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
                    break;
                case "11":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
                    break;
                case "12":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
                    break;
                case "13":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
                    break;
                case "14":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
                    break;
                case "15":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("EXPRESION",s));
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
        System.out.println(Pattern.matches("^[aA].*",s)
                ?"Empieza por a"
                :"no empieza por a");
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
        //System.out.println(Pattern.compile("EXPRESION").matcher(s).matches() o .find()
        System.out.println(Pattern.matches("^[^$\\d].*",s)
                ?"No empieza por $ ni por un digito"
                :"Empieza por $ o por un digito");        
        
    }
    
    public static void ejercicio04(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();        
        System.out.println(Pattern.matches("[aAbBcC]{3}",s)
                ?"SI"
                :"NO");         
        
    }

    
    public static void ejercicio05(){
        System.out.print("Introduce una string: ");
        String s = sc.nextLine();
        System.out.println(Pattern.compile("\\b[1-9][0-9]\\b").matcher(s).find()
                ?"Si"
                :"NO");
        
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
