package tarea;

import java.util.Scanner;

public class Programa4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu de operaciones:");
        System.out.println("--------------------");
        System.out.println("1. Operaion a");
        System.out.println("2. Operaion b");
        System.out.println("3. Operaion c");
        System.out.println("4. Operaion d");
        System.out.println("5. Operaion e");
        System.out.println("6. Operaion f");
        System.out.println("7. Operaion g");
        System.out.println("8. Operaion h");
        System.out.println("9. Operaion i");
        System.out.println("10. Operaion j");
        System.out.println("11. Operaion k");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor de a: ");
                double a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                double b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                double c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                double d= sc.nextDouble();
                
                double operacion1 = (a/b) + (c/d);
                
                System.out.println("Operacion a) = " + operacion1);
                
                break;
            case 2:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();  
                
                double operacion2 = (1/(a-5)) - ((3*a*b)/4);
                
                System.out.println("Operacion b) = " + operacion2);
                
                break;
            case 3:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                
                double operacion3 = (a/b) + c;
                
                System.out.println("Operacion c) = " + operacion3);
                
                break;
            case 4:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                
                double operacion4 = a +( b/c);
                
                System.out.println("Operacion d) = " + operacion4);
                
                break;
            case 5:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                d= sc.nextDouble();
                System.out.print("Ingrese el valor de e: ");
                double e= sc.nextDouble();
                System.out.print("Ingrese el valor de f: ");
                double f= sc.nextDouble();
                System.out.print("Ingrese el valor de g: ");
                double g= sc.nextDouble();
                System.out.print("Ingrese el valor de h: ");
                double h= sc.nextDouble();
                System.out.print("Ingrese el valor de j: ");
                double j= sc.nextDouble();
                
                double operacion5 = (Math.pow(a, 2)/(b-c)) + 
                        ((d-e)/(f-((g*h)/j)));
                
                System.out.println("Operacion e) = " + operacion5);
                break;
            case 6:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                
                double operacion6 = (a/b) + c;
                
                System.out.println("Operacion f) = " + operacion6);
                break;
            case 7:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                d= sc.nextDouble();
                
                double operacion7 = a + (b/(c-d));
                
                System.out.println("Operacion g) = " + operacion7);
                break;
            case 8:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                d= sc.nextDouble();
                
                double operacion8 = (Math.pow(a, 2)/Math.pow(b, 2)) + 
                        (Math.pow(c, 2)/Math.pow(d, 2));
                
                System.out.println("Operacion h) = " + operacion8);
                
                break;
            case 9:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                d= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                e= sc.nextDouble();
                System.out.print("Ingrese el valor de f: ");
                f= sc.nextDouble();
                
                double operacion9 = (a+(b/c)) / (d-(e/f));
                
                System.out.println("Operacion i) = " + operacion9);
                
                break;
            case 10:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                d= sc.nextDouble();
                System.out.print("Ingrese el valor de e: ");
                e= sc.nextDouble();
                System.out.print("Ingrese el valor de f: ");
                f= sc.nextDouble();
                System.out.print("Ingrese el valor de g: ");
                g= sc.nextDouble();
                System.out.print("Ingrese el valor de h: ");
                h= sc.nextDouble();
                
                double operacion10 = ((3*a)+b) / (c-((d+(5*e))/(f+(g/(2*h)))));
                
                System.out.println("Operacion j) = " + operacion10);
                break;
            case 11:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de x: ");
                double x= sc.nextDouble();
                
                double operacion11 = (Math.pow(a, 2)+(2*a*b) +
                        Math.pow(b, 2)) / ((1/Math.pow(x, 2))+2);
                
                System.out.println("Operacion k) = " + operacion11);
                break;
            default:
                System.out.println("Ingreso un dato erroneo");
        }
        

        
        
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        
    }
}
