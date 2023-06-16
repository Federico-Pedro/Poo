package pkg004ejerciciopoo;
//import Entidad.Rectangulo;
import Servicio.RectanguloService;
import java.util.Scanner;
/**
 *
 * @author Familia Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int bas = leer.nextInt();
        System.out.println("Ingrese la altura");
        int alt = leer.nextInt();
        RectanguloService.crearRectangulo(bas, alt);
       
    }
    
}
 