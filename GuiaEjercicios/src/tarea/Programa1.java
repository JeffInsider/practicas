package tarea;

import java.util.Scanner;

public class Programa1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Operaciones");
        System.out.println("------------");
        
        System.out.print("Ingrese el primer valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Ingrese el segundo valor: ");
        double valor2 = sc.nextDouble();
        
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;
        double division = valor1 / valor2;
        
        System.out.println("El valor de la suma es: " + suma);
        System.out.println("El valor de la resta es: " + resta);
        System.out.println("El valor de la multiplicacion es: " + multiplicacion);
        System.out.println("El valor de la division es: " + division);
    }
}

