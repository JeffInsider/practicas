package examen;

import java.util.Scanner;

public class NumeroComun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Encontrar el numero mas repetido");
        System.out.println("-----------------------------------");
        
        int opcion;
        do {
            System.out.print("Ingrese de cuantos numeros desea la lista:");
            int tamaño = sc.nextInt();
            
            int[] lista = new int[tamaño];
            
            for (int i = 0; i < lista.length; i++) {
                System.out.print("Ingrese el numero: " + (i+1) + " :");
                lista[i] = sc.nextInt();
            }
            
            System.out.println("-----------------------");
            
            for (int i = 0; i < lista.length; i++) {
                System.out.println("-> " + lista[i]);
            }
            
            int veces = 0;
            int veces2 = 0; 
            int repetido = 0;
            for (int i = 0; i < tamaño; i++) {
                veces = 0;
                for (int j = 1; j < tamaño; j++) {
                    if (lista[i] == lista[j]) {
                        veces++;
                    }
                    if (veces>veces2) {
                        repetido = lista[i];
                        veces2 = veces;
                    }
                }
                
            }
            
            System.out.println("El numero mas comun en la lista es: " + repetido);
            
            System.out.println("\nDesea continuar? 1.Si 2.No");
            opcion = sc.nextInt();
        } while (opcion == 1);
    }
}
