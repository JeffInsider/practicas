package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Arreglo03{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        
        int opcion;
        
        do {  
            int[] numeros = new int[20];
            System.out.println("Tamaño de arreglo: " + numeros.length);
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(100) + 1;
                System.out.println("numeros[" + i + "] = " + numeros[i]);
            
                
            }
            System.out.println("Desea continuar? (Si=1/No=2)");
            opcion = sc.nextInt();
        } while (opcion == 1);
    }
}
