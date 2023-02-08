package estructurasControl;

import java.util.Scanner;

public class ListarNumeros04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Listar numeros hasta: ");
        System.out.println("---------------------\n");
        
        System.out.println("Ingrese un numero");
        int limite = sc.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
            
        }
        
    }
}
