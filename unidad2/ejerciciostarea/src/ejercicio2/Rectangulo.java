package ejercicio2;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(){
        
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int CalcularArea() {
        int area;
        
        area = this.base * this.altura;
        
        return area;
    }
    
}
