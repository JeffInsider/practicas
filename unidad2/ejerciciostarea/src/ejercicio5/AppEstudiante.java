package ejercicio5;

import java.util.Scanner;

public class AppEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estu = new Estudiante();
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = sc.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        
        
        
        System.out.print("Ingrese el nombre del estudiante:");
        double promedio = sc.nextInt();
        
        estu.setNombre(nombre);
        estu.setEdad(edad);
        estu.setCarrera(carrera);
        estu.setPromedio(promedio);
        
        estu.imprimirDatos();
        
        System.out.println("Ingrese la calificacion de un curso: ");
        int calificacion = sc.nextInt();
        
        estu.aprobarCurso(calificacion);
    }
}
