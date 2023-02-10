package arreglos;

public class Arreglo01{
    public static void main(String[] args) {
        // Declaracion de un arreglo de enteros con tamaño de 5
        int[] numeros = new int[5];
        
        // Inicializar los elementos del arreglo
        numeros[0] = 3;
        numeros[1] = 12;
        numeros[2] = 32;
        numeros[3] = 54;
        numeros[4] = 22;
        
        // acceder a vslores del arreglo
        
        //System.out.println(numeros[3]);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        
    }
}
