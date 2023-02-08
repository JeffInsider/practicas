package estructurasControl;

import java.util.Scanner;

public class ListarNumeros02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            
            System.out.println("Listar numeros hasta: ");
            System.out.println("---------------------\n");
        
            System.out.println("Ingrese un numero");
            int limite = sc.nextInt();
        
            int i = 1;
            while (i <= limite) {            
                System.out.println(i);
                i++;
            
            }
            
            System.out.println("Desea continuar? (s/n)");
            String respuesta = sc.next().toLowerCase();
            
            continuar = respuesta.equalsIgnoreCase("s");
  
        } 
    }
}
