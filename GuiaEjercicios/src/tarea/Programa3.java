package tarea;

import java.util.Scanner;

public class Programa3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Facturacion");
        System.out.println("-------------");
        
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = sc.nextInt();
        
        System.out.print("Ingrese el precio del producto: ");
        int precio = sc.nextInt();
        
        int total = cantidad * precio;
        
        System.out.println("Total a pagar: " + total);
    }
}
