package arreglos;

import java.util.Random;
import java.util.Scanner;

public class TareaArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Encontrar el numero mas repetido");
        System.out.println("-----------------------------------");

        System.out.print("Ingrese de cuantos numeros desea la lista:");
        int tamaño = sc.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(10);
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
                if (veces > veces2) {
                    repetido = lista[i];
                    veces2 = veces;
                }
            }

        }

        System.out.println("El numero mas repetido en la lista es: " + repetido);
    }
}
