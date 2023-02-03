package tarea;

import java.util.Random;
import java.util.Scanner;

public class Programa5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Juego de adivinar");
        System.out.println("-------------------\n");
        
        Random rand = new Random();
        
        int op = 1;
        while (op == 1) {           
            
            int aleatorio = rand.nextInt(21);
            
            for (int i = 1; i <= 3; i++) {
                System.out.print("Intento " + i + ":");
                int num = sc.nextInt();
                
                if (num == aleatorio) {
                    System.out.println("Felicidades ha ganado\n");
                    break;
                }
                if (i == 3) {
                    System.out.println("Ha perdido, supero el limite de intentos");
                    System.out.println("El numero random era: " + aleatorio + "\n");
                    
                }
            }
                   
            System.out.println("Desea seguir jugando?");
            System.out.println("1. Seguir jugando");
            System.out.println("2. Terminar juego");
            op = sc.nextInt();
        }
        
    }
}
