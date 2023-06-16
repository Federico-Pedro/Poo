package Entidad;
import java.util.Scanner;
/**
 *
 * @author Familia Pedro
 */
public class Operacion {
    private int numero1;
    private int numero2;
    
    public Operacion(){
    }
    
    public Operacion(int num1, int num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }
    
    public void setNumero1(int num1){
        this.numero1 = num1;
    }
    public void setNumero2(int num2){
        this.numero2 = num2;
    }
    
    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
       return numero2;
    }
    
    public static void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        Operacion op1 = new Operacion(num1, num2);
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Producto: " + multiplicar(num1, num2));
        System.out.println("Razón: " + dividir(num1, num2));
    }
    
    public static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public static int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    public static double multiplicar(int numero1, int numero2){
        if (numero1 == 0 || numero2 == 0){
            double producto = 0;
            System.out.println("Multiplicar por cero siempre da cero");
            return producto;
        }else{
            double producto = numero1 * numero2;
            return producto;
        }
        
    }
    public static double dividir(int numero1, int numero2){
        if (numero2 == 0){
        double razon = 0;
        System.out.println("No se puede dividir por cero");
        return razon;
        } else{
                double razon = numero1 / numero2;
        return razon;
    }
       
    }
}
   
