package ejercicio3;

public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Arrancar() {
        System.out.println("Arrancando coche...");
        

    }

    public void Detener() {
        System.out.println("Deteniendo vehiculo");
    }

}
