package ejercicio3;

import java.util.Scanner;

public class AppVehiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo veh = new Vehiculo();
        Coche coc = new Coche();

        System.out.println("Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();

        System.out.println("Ingrese el modelo del vehiculo: ");
        String modelo = sc.nextLine();

        veh.setMarca(marca);
        veh.setModelo(modelo);

        veh.Arrancar();
        System.out.println("Ingrese la velocidad del coche km/: ");
        int velocidad = sc.nextInt();
        coc.setVelocidad(velocidad);

        while (coc.getVelocidad() > 0) {
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            int op = sc.nextInt();

            if (op == 1) {
                coc.Acelerar();
            } else {
                coc.Frenar();
            }
            System.out.println("Velocidad actual: " + coc.getVelocidad());
        }
        veh.Detener();

    }
}
