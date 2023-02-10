package arreglos;

public class Arreglo04{
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        
        numeros[1][1] = 98;
        
        for (int f = 0; f < 3; f++) { 
            for (int c = 0; c < 3; c++) {
                numeros[f][c] = f + c;
                System.out.print(numeros[f][c] + "\t");
                
            }
            System.out.println("");
        }
    }
}
