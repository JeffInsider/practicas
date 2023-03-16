package ejercicio4;

import java.util.Random;

public class AppRectangulo {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int largo = rand.nextInt(20)+5;
        int ancho = rand.nextInt(20)+5;
        
        System.out.println("El largo de la figura es: " + largo);
        System.out.println("El ancho de la figura es: " + ancho);
        
        Rectangulo rec = new Rectangulo(largo, ancho);
        rec.calcularArea();
        rec.calcularPerimetro();
        System.out.println(rec.esCuadrado(largo, ancho));
        
        
        
    }
}
