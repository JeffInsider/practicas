package ejercicio3;

public class Coche extends Vehiculo{
    private int velocidad;
    
    public void Coche(){
        
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void Acelerar(){
        System.out.println("Acelerando...");
        this.velocidad = this.velocidad + 20;
        
    }
    
    public void Frenar(){
        System.out.println("Frenando...");
        this.velocidad = this.velocidad - 20;
    }
}
