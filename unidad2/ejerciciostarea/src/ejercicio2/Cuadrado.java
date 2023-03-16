package ejercicio2;

public class Cuadrado extends Rectangulo{
   
    @Override
    
    public int CalcularArea(){
       int area;
       
       area = (this.getBase()*this.getBase());
       
       return area;
    }
}
