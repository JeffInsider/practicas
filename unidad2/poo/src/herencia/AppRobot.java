package herencia;

public class AppRobot{
    public static void main(String[] args) {
        Recolector r = new Recolector("Wall-e");
        Recolector t = new Recolector("Terminator");
        
        System.out.println(r.getNombre());
        r.setCapacidadCarga(100);
        r.LlenarBasura();
        
        System.out.println(t.getNombre());
    }
}
