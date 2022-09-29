
package test;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class DiferenciarNotas {
    
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
            
    int num;
        System.out.println("Introduzca por teclado la nota del alumno (1 - 10): ");
        num = ent.nextInt();
        while(num>=0 && num<=10){
        if(num<5){
            System.out.println("El alumno ha SUSPENDIDO");
        }else if(num>=5 && num<6){
            System.out.println("El alumno ha aprobado");
        }else if(num>=6 && num<7){
            System.out.println("El alumno ha sacado BIEN");
        }else if(num>=7 && num<=8){
            System.out.println("El alumno ha sacado NOTABLE");
        }else{
            System.out.println("Ela lumno ha sacado SOBRESALIENTE");
        }
        }
        System.out.println("La nota es INCORRECTA, introduzca un número entre el 1 - 10");

    
    }

}
