package tarea;
        
import java.util.Scanner;

public class Programa6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dias de la semana");
        System.out.println("------------------");
        System.out.print("Ingrese un dia de la semana en valor numerico: ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6 :
                System.out.println("Sabado");
                break;
            case 7 :
                System.out.println("Domingo");
                break;
            default:
                throw new AssertionError();
        }
    }
}
