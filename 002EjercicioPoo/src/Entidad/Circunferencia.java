package Entidad;
import java.util.Scanner;
/**
 *
 * @author Familia Pedro
 */
public class Circunferencia {

    
    private int radio;
    
    //constructor sin parametros
    public Circunferencia(){
        
    }
    //constructor con parámetros
    public Circunferencia(int radio){
        this.radio = radio;
    }
    //setter
     public void setRadio(int radio) {
        this.radio = radio;
    }
    //getter 
     public int getRadio(){
         return radio;
     }
     //métodos
     public double area(){
         double area = 3.1415 * getRadio() * getRadio();
         return area;
     }
     
     public double perimetro(){
         double perimetro = 3.1415 * 2 * getRadio();
         return perimetro;
     }
     
     public static void crearCircunferencia(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el radio deseado");
         int radio = leer.nextInt();
         Circunferencia circ1 = new Circunferencia(radio);
         
     }
}
