package ejercicio4;

public class Rectangulo {

    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void calcularArea() {
        int area;
        area = this.largo * this.ancho;
        System.out.println("\nEl area de la figura es: " + area);
    }

    public void calcularPerimetro() {
        int perimetro;
        perimetro = (this.largo * 2) + (this.ancho * 2);
        System.out.println("El perimetro de la figura es: " + perimetro);
    }

    public String esCuadrado(int largo, int ancho) {
        if (largo == ancho) {
            return "La figura es un cuadrado";
        } else {
            return "La figura es un rectangulo";
        }
    }

}
