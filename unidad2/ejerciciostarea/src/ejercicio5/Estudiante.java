package ejercicio5;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante() {
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void imprimirDatos(){
        System.out.println("\nNombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Promedio: " + this.promedio);
    }
    
    public void aprobarCurso(double calificacion){
        double nuevoProm;
        nuevoProm = (calificacion + this.promedio)/2;
        System.out.println("El nuevo promedio es de: " + nuevoProm);
    }
    
    
}
