package ejercicio2;

import java.util.Scanner;

public class AppAreas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        Cuadrado c = new Cuadrado();
        
        System.out.println("Eliga que area calcular: ");
        System.out.println("1. Rectangulo ");
        System.out.println("2. Cuadrado ");
        int op = sc.nextInt();
        
        
        
        if (op == 1) {
            System.out.println("Ingrese la base: ");
            int base = sc.nextInt();
            System.out.println("Ingrese la altura: ");
            int altura = sc.nextInt();
            
            r.setBase(base);
            r.setAltura(altura);
            
            System.out.println("El area del rectangulo es: " + r.CalcularArea());
            
        }else if(op == 2){
            System.out.println("Ingrese la base: ");
            int base = sc.nextInt();
            
            c.setBase(base);
            
            System.out.println("El area del cuadrado es: " + c.CalcularArea());
        }
    }
}
