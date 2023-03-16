package ejercicio;

public class Calculadora{
    
    private double suma;
    private double restar;
    private double dividir;
    private double multiplicar;
    
    public Calculadora(){
        /*this.suma = suma;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;*/
    }

    public double getSuma(double n1, double n2) {
        suma = n1+n2;
        
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getRestar(double n1, double n2) {
        restar = n1-n2;
        return restar;
    }

    public void setRestar(double restar) {
        this.restar = restar;
    }

    public double getDividir(double n1, double n2) {
        dividir = n1/n2;
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    public double getMultiplicar(double n1, double n2) {
        multiplicar = n1*n2;
        return multiplicar;
    }

    public void setMultiplicar(double multiplicar) {
        this.multiplicar = multiplicar;
    }
    
    
}


