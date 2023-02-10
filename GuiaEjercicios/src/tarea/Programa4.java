package tarea;

import java.util.Scanner;

public class Programa4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu de operaciones:");
        System.out.println("--------------------");
        System.out.println("1. Operaion a: 3/2 + 4/3");
        System.out.println("2. Operaion b: 1/x-5 - 3xy/4");
        System.out.println("3. Operaion c: 1/2 + 7");
        System.out.println("4. Operaion d: 7 + 1/2");
        System.out.println("5. Operaion e: (a²/b-c) + (d-e /(f - gh/j))");
        System.out.println("6. Operaion f: m/n + p");
        System.out.println("7. Operaion g: m + n/p-q");
        System.out.println("8. Operaion h: a²/b² + c²/d²");
        System.out.println("9. Operaion i: (m + n/p) / (q - r/s)");
        System.out.println("10. Operaion j: (3a + b) / (c - (d + 5e / f + g/2h))");
        System.out.println("11. Operaion k: (a² + 2ab + b²) / (1/x² + 2)");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                          
                double operacion1 = (3/2) + (4/3);
                
                System.out.println("Resultado de la operacion a) = " 
                        + operacion1);
                
                break;
            case 2:
                System.out.print("Ingrese el valor de x: ");
                double x= sc.nextDouble();
                System.out.print("Ingrese el valor de y: ");
                double y= sc.nextDouble();  
                
                double operacion2 = (1/(x-5)) - ((3*x*y)/4);
                
                System.out.println("Resultado de la operacion b) = " 
                        + operacion2);
                
                break;
            case 3:
                               
                double operacion3 = (1/2) + 7;
                
                System.out.println("Resultado de la operacion operacion c) = " 
                        + operacion3);
                
                break;
            case 4:
                
                double operacion4 = 7 +(1/2);
                
                System.out.println("Resultado de la operacion operacion d) = " 
                        + operacion4);
                
                break;
            case 5:
                System.out.print("Ingrese el valor de a: ");
                double a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                double b= sc.nextDouble();
                System.out.print("Ingrese el valor de c: ");
                double c= sc.nextDouble();
                System.out.print("Ingrese el valor de d: ");
                double d= sc.nextDouble();
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
                
                System.out.println("Resultado de la operacion operacion e) = " 
                        + operacion5);
                break;
            case 6:
                System.out.print("Ingrese el valor de m: ");
                double m = sc.nextDouble();
                System.out.print("Ingrese el valor de n: ");
                double n = sc.nextDouble();
                System.out.print("Ingrese el valor de p: ");
                double p = sc.nextDouble();
                
                double operacion6 = (m/n) + p;
                
                System.out.println("Resultado de la operacion operacion f) = " 
                        + operacion6);
                break;
            case 7:
                System.out.print("Ingrese el valor de m: ");
                m= sc.nextDouble();
                System.out.print("Ingrese el valor de n: ");
                n= sc.nextDouble();
                System.out.print("Ingrese el valor de p: ");
                p= sc.nextDouble();
                System.out.print("Ingrese el valor de q: ");
                double q = sc.nextDouble();
                
                double operacion7 = m + (n/(p-q));
                
                System.out.println("Resultado de la operacion operacion g) = " 
                        + operacion7);
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
                
                System.out.println("Resultado de la operacion operacion h) = " 
                        + operacion8);
                
                break;
            case 9:
                System.out.print("Ingrese el valor de m: ");
                m= sc.nextDouble();
                System.out.print("Ingrese el valor de n: ");
                n= sc.nextDouble();
                System.out.print("Ingrese el valor de p: ");
                p= sc.nextDouble();
                System.out.print("Ingrese el valor de q: ");
                q= sc.nextDouble();
                System.out.print("Ingrese el valor de r: ");
                double r= sc.nextDouble();
                System.out.print("Ingrese el valor de s: ");
                double s= sc.nextDouble();
                
                double operacion9 = (m+(n/p)) / (q-(r/s));
                
                System.out.println("Resultado de la operacion operacion i) = " 
                        + operacion9);
                
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
                
                System.out.println("Resultado de la operacion operacion j) = " 
                        + operacion10);
                break;
            case 11:
                System.out.print("Ingrese el valor de a: ");
                a= sc.nextDouble();
                System.out.print("Ingrese el valor de b: ");
                b= sc.nextDouble();
                System.out.print("Ingrese el valor de x: ");
                x= sc.nextDouble();
                
                double operacion11 = (Math.pow(a, 2)+(2*a*b) +
                        Math.pow(b, 2)) / ((1/Math.pow(x, 2))+2);
                
                System.out.println("Resultado de la operacion operacion k) = " + operacion11);
                break;
            default:
                System.out.println("Ingreso un dato erroneo");
        }
        

        
        
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        
    }
}
