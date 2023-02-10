package arreglos;

import java.util.Scanner;

public class Arreglo05{
    public static void main(String[] args) {
        //El usuario determina el tamaño de la matriz
        //El usuario ingresa los datos de la matriz
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de filas ");
        int filas = sc.nextInt();
        
        System.out.print("Ingrese el numero de columnas ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int [filas][columnas];
        
        System.out.println("Ingrese los valores de la matriz");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(
                        "Valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int f = 0; f < matriz.length; f++) { 
            for (int c = 0; c < matriz[f].length; c++) {
                //matriz[f][c] = f + c;
                System.out.print(matriz[f][c] + "\t");
                
            }
            System.out.println("");
        }
    }
}
