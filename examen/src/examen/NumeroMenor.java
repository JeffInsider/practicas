package examen;

import java.util.Random;
import java.util.Scanner;

public class NumeroMenor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Encontrar menor y mayor de una matriz");
        System.out.println("---------------------------------------");
        
        int opcion;
        do {
            System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
            int tamaño = sc.nextInt();
        
            int[][] matriz = new int[tamaño][tamaño];
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("[ " + i + " , " + j + " ]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
        
            System.out.println("------------------------");
            
            int menor = 1000*10;
            int mayor = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                    }
                    
                    if (matriz[i][j] > mayor) {
                        mayor = matriz[i][j];
                    }
                }
            }
            
            System.out.println("\nEl numero menor de la matriz es: " + menor);
            System.out.println("El numero mayor de la matriz es: " + mayor);
            
            System.out.println("\nDesea continuar? 1.Si 2.No");
            opcion = sc.nextInt();
        } while (opcion == 1);
    }
}