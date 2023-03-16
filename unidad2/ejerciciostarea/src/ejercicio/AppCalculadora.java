package ejercicio;

import java.util.Scanner;

public class AppCalculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora(); 
        
        System.out.println("Ingrese que operacion realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int op = sc.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        double n1 = sc.nextInt();
        System.out.println("Ingrese el primer numero: ");
        double n2 = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("La suma es: " + calc.getSuma(n1, n2));
                break;
            case 2:
                System.out.println("La resta es: " + calc.getRestar(n1, n2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + calc.getMultiplicar(n1, n2));
                break;
            case 4:
                System.out.println("La division es: " + calc.getDividir(n1, n2));
                break;
            default:
                throw new AssertionError();
        }
        
        
        
    }
}


