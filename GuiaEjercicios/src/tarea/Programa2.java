package tarea;

import java.util.Scanner;

public class Programa2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Una operacion");
        System.out.println("--------------");
        
        System.out.print("Ingrese el primer valor: ");
        int valor1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = sc.nextInt();
        
        int operacion = ( valor1 + valor2)*(valor1 - valor2);
        
        System.out.println("El resultado de la operacio es: " + operacion);
    }
}

