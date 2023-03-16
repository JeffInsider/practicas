package sobreescritura.personas;

import java.util.Scanner;

public class AppPersona{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas personas desea registrar?");
        int cantp = sc.nextInt();
        
        /*for (int i = 0; i < cantp; i++) {
            Persona p = new Persona(
                "Juan Perez",
                'M',
                22,
                'H',
                'o',
                52
            );
            System.out.println(p.toString());
            System.out.println("-------------");
        }*/
        /*Persona p = new Persona(
                "Juan Perez",
                'M',
                22
        );
        
        Persona p2 = new Persona(
                "Karla Lopez",
                'F',
                20
        );
        System.out.println(p.toString());
        System.out.println("-------------");
        System.out.println(p2.toString());*/
    }
}
