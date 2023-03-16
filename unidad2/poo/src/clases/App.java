package clases;

public class App{
    public static void main(String[] args) {
        
        Producto p = new Producto();
        p.setNombre("Semitas");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Producto Nombre:" + p.getNombre());
        
    }
}
