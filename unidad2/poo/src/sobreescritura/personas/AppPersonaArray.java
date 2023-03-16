package sobreescritura.personas;

import java.util.Scanner;

public class AppPersonaArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de perosnas a ingresar:");
        int cpersonas = sc.nextInt();
        
        Persona[] personas = new Persona[cpersonas];
        
        for (int i = 0; i < cpersonas; i++) {
            String nombre = sc.nextLine();
            char genero = sc.next().charAt(0);
            int edad = sc.nextInt();
            String nacionalidad = sc.nextLine();
            String sangre = sc.nextLine();
            int peso = sc.nextInt();
            
            personas[i] = new Persona(nombre, genero, edad, nacionalidad, sangre, peso);
        }
        
        
    }
}
