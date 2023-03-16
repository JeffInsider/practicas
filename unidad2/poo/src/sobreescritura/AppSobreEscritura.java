package sobreescritura;

public class AppSobreEscritura{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.print("Clase Animal: ");
        animal1.hacerSonido();
        
        Perro firulais = new Perro();
        System.out.print("Clase perro: ");
        firulais.hacerSonido();
    }
}
