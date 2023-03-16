package arreglos;

import java.util.Random;
import java.util.Scanner;

public class PracticaPrueba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        /*System.out.println("Ingrese la cantidad de notas a promediar:");
        int notas = sc.nextInt();
        
        int[] promedio = new int[notas];
        
        for (int i = 0; i < promedio.length; i++) {
            
            promedio[i] = rand.nextInt(20);
            System.out.println("Numero: " + promedio[i]);
        }
        
        
        double suma = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma = suma + promedio[i];   
        }
        
        double total = suma/notas;
        
        System.out.println("El promedio es: "  + total);
        */
        System.out.println("Ingrese el numero de renglones: ");
        int filas = sc.nextInt();
        
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[ " + i + " , " + j + " ]:");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        
        System.out.println("Suma: " + suma);
    }
}