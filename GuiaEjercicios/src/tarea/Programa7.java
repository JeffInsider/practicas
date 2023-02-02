package tarea;

import java.util.Scanner;

public class Programa7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tablas de multiplicar");
        System.out.println("-----------------------");
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
