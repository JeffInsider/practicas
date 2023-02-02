package estructurasControl;

import java.util.Scanner;

public class Promedio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese nota 1: ");
        int nota1 = sc.nextInt();
        System.out.print("Ingrese nota 2: ");
        int nota2 = sc.nextInt();
        System.out.print("Ingrese nota 3: ");
        int nota3 = sc.nextInt();
        
        double promedio = (nota1+nota2+nota3)/3;
        
        System.out.println("Su promedio es: " + promedio);
        
        if (promedio >= 70){
            System.out.println("Aprobado");
            if (promedio > 90 && promedio <= 100) {
                 System.out.println("Sobresaliente");
            }else if(promedio > 80 && promedio <= 90){
                System.out.println("Bueno");
            }
        }else{
            System.out.println("Reprobado");
        }
    }
}
