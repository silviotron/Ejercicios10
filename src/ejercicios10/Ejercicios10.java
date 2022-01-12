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
            System.out.println("*********************************************************************");
            System.out.println("*  1. empieza por A                                                 *");
            System.out.println("*  2. empieza por A y acaba en número                               *");
            System.out.println("*  3. no empieza por $ o digito                                     *");
            System.out.println("*  4. no tiene una palabra de tres letras compuesta por a, b o c    *");
            System.out.println("*  5. no contiene un número entre 10 y 99                           *");
            System.out.println("*  6. 4 números y 2 letras mayús                                    *");
            System.out.println("*  7. existe una palabra entre 5 y 10 letras                        *");
            System.out.println("*  8. verificación matrículas                                       *");
            System.out.println("*  9. verificación DNIs                                             *");
            System.out.println("* 10. extension .doc o .docx                                        *");
            System.out.println("* 11. contiene las 5 vocales en orden                               *");
            System.out.println("* 12. 3 letras Mayus, 3 digitos y 1 letra(A, E, O, F, M)            *");
            System.out.println("* 13. termina en .                                                  *");
            System.out.println("* 14. remplaza numeros de 4 digitos por ****                        *");
            System.out.println("* 15. 4 o 5 mayús, 1 guión, 3 cifras, 1 guión y 2 cifras            *");
            System.out.println("* 16. remplazar todo que no sean ni numeros ni letras ni _ por _    *");
            System.out.println("* 17. validación fecha                                              *");
            System.out.println("* 18. limpiar string                                                *");
            System.out.println("* 19. validación ip                                                 *");
            System.out.println("*  0. Salir                                                         *");
            System.out.println("*********************************************************************");
            entradaUsuario = sc.nextLine();
            String s = "";
            String[] array;
            switch(entradaUsuario){
                case "1":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[aA].*",s));
                    break;
                case "2":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[aA].*\\d$",s));
                    break;
                case "3":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("^[^$\\d].*",s));
                    break;
                case "4":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine(); 
                    System.out.println(!Pattern.compile("\\b[aAbBcC]{3}\\b").matcher(s).find());
                    break;
                case "5":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(!Pattern.matches(".*\\b[1-9][0-9]\\b.*",s));
                    break;
                case "6":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("\\d{4}[A-Z]{2}",s));
                    break;
                case "7":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("\\b[A-Za-z]{5,10}",s));
                    break;
                case "8":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    array = s.trim().split(" +");
                for (String matricula : array) {
                    System.out.printf("%s: %s\n", matricula, Pattern.matches("^\\d{4}[A-Z]{3}$", matricula));
                }
                    break;

                case "9":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    array = s.trim().split(" +");
                for (String matricula : array) {
                    System.out.printf("%s: %s\n", matricula, Pattern.matches("\\b\\d{7,8}[A-Z]\\b", matricula));
                }
                    break;                    
                    
                case "10":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches(".*\\.docx|.*\\.doc",s));
                    break;
                case "11":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("[^aAeEiIoOuU]*[aA][^eEiIoOuU]*[eE][^aAiIoOuU]*[iI][^aAeEoOuU]*[oO][^aAeEiIuU]*[uU][^aAeEiIoO]*[^aAeEiIoOuU]*",s));
                    break;
                case "12":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("[A-Z]{3}\\d{3}[AEOFM]",s));
                    break;
                case "13":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches(".*\\.$",s));
                    break;
                case "14":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(s.replaceAll("\\b\\d{4}\\b", "****"));
                    break;
                case "15":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("[A-Z]{4,5}-\\d{3}-\\d{2}",s));
                    break;
                case "16":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(s.replaceAll("[^\\w]", "_"));
                    break;
                case "17":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(Pattern.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|[1][012])/(\\d|[1-9]\\d|[1-9]\\d{2}|[1-9]\\d{3})",s));
                    break;
                case "18":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    System.out.println(s.replaceAll("[^A-Za-z\\d]", ""));
                    break;
                case "19":
                    System.out.print("Introduce una string: ");
                    s = sc.nextLine();
                    String ip = "(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d||25[0-5])";
                    System.out.println(Pattern.matches(ip + "\\." + ip + "\\." + ip + "\\." + ip,s));                   
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(!entradaUsuario.equals("0"));         
    }
    
    //Esto no es nada solo me gusta como queda
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
