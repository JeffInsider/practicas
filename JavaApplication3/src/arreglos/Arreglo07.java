package arreglos;

import java.util.Scanner;

/*
Crear un programa en el cual se ingrese un numero de una tabla que se quiera 
visualizar e ingresar otro numero para la cantidad de multiplos a generar
Almacenar los valores en una matriz y mostrar los datos al finalizar el proceso
*/
public class Arreglo07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("Ingrese el numero para mostrar la tabla: ");
            int numero = sc.nextInt();
        
            System.out.println("Ingrese la cantidad de multiplos a mostrar: ");
            int tamaño = sc.nextInt();
        
            int[][] matriz = new int[tamaño][3];
        
  
            for (int i = 0; i < tamaño; i++) {
               matriz[i][2] = numero * (i + 1);
               matriz[i][1] = i + 1;
              matriz[i][0] = numero;
            }
        
            System.out.println("La tabla del numero" + numero + " es: ");
            for (int i = 0; i < matriz.length; i++) {
              System.out.println(
                    matriz[i][0] + " x " + matriz[i][1] + " = " + matriz[i][2]);
            }
            
            System.out.println("Desea continuar? (1Si/2No)");
            opcion = sc.nextInt();
                    
        } while (opcion == 1);
        
        
    }
}
