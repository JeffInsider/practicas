package arreglos;

import java.util.Scanner;


/* 
* Ecribir un programa donde en una matriz de nxm
* definida por el usuario, se suma la diagonal de izquierda a derecha
* despues que el usuario ingreso los datos de la matriz
 */
public class Arreglo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        System.out.println("--------------------------------");

        System.out.print("Ingrese la cantidad de renglones: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.print("Ingrese los valores de la matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(
                        "Valor de la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println("");
        }

        /*int numero2 = 0;
        int total = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                
                //comparar el lugar de las filas y columnas
                if (f == c) {
                    numero2 = matriz[f][c];
                    total = total + numero2;
                }

            }
        }
        
        System.out.println("La suma de su diagonal es: " + total);
        */
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
    }
}
