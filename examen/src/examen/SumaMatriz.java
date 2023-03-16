package examen;

import java.util.Random;
import java.util.Scanner;

public class SumaMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Suma de matriz");
        System.out.println("------------------");
        
        int opcion;
        do {
            System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
            int tamaño = sc.nextInt();
        
            int[][] matriz = new int[tamaño][tamaño];
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(100) + 1;
                }
            }
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
        
            System.out.println("------------------------");
        
        
            for (int i = 0; i < matriz.length; i++) {
                int fila = 0;
                int columna = 0;
            
                for (int j = 0; j < matriz[i].length; j++) {
                    fila += matriz[i][j];
                    columna += matriz[j][i];
                }
            
                System.out.println(
                        "\nLa suma de la fila " + i + " es: " + fila);
                System.out.println(
                        "La suma de la columna " + i + " es: " + columna);
            }
            
            System.out.println("\nDesea continuar? 1.Si 2.No");
            opcion = sc.nextInt();
        } while (opcion == 1);
        
    }
}
