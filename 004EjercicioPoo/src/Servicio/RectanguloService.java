/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;


/**
 *
 * @author Familia Pedro
 */
public class RectanguloService {
    public static void crearRectangulo(int bas, int alt){
        
        Rectangulo rec1 = new Rectangulo(bas, alt);
        System.out.println("Perimetro: " + perimetro(bas, alt));
        System.out.println("Area: " + area(bas, alt));
        dibujar(bas, alt);
       
}
     public static int perimetro(int base, int altura){
        int per = (base + altura) * 2;
        return per;
    }
    public static int area(int base, int altura){
        int ar = base * altura;
        return ar;
    }
    
    public static void dibujar(int base, int altura){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}