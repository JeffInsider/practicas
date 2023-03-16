package sobreescritura.personas;

public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String nacionalidad;
    private String sangre;
    private int peso;

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        if (this.genero == 'M') {
            return "Hombre";
        }else{
            return "Mujer";
        }
        
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre()
                + "\nEdad: " + this.getEdad()
                + "\nGenero: " + this.getGenero()
                + "\nNacionalidad: " + this.getNacionalidad()
                + "\nSangre: " + this.getSangre()
                + "\nPeso: " + this.getPeso();
                
    }

    public Persona(String nombre, char genero, int edad, String nacionalidad, String sangre, int peso) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sangre = sangre;
        this.peso = peso;
        
    }
    
    
    
}
