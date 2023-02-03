package tarea;

import java.util.Scanner;

public class Programa8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tabla de multiplicar hasta x multiplo");
        System.out.println("---------------------------------------\n");
        
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        System.out.print("Ingrese uhasta el multiplo a mostrar: ");
        int multiplo = sc.nextInt();
        
        int i = 1;
        while (i<=multiplo) {            
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}
