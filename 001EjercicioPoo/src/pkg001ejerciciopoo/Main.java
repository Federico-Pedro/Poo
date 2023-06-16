package pkg001ejerciciopoo;
import Entidad.Libro;
import java.util. Scanner;
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
      
       Libro libroUno  = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        libroUno.setIsbn(leer.nextInt());
        System.out.println("Ingrese el Título del libro");
        libroUno.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del libro");
        libroUno.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de páginas del libro");
        libroUno.setPaginas(leer.nextInt());
        
        System.out.println("ISBN: " + libroUno.getIsbn());
        System.out.println("Título: " + libroUno.getTitulo());
        System.out.println("Autor: " + libroUno.getAutor());
        System.out.println("Nro. de páginas: " + libroUno.getPaginas());
        
        
        Libro libroDos = new Libro(256369, "Juan es abogado", "Federico", 536);
        System.out.println("ISBN: " + libroDos.getIsbn());
        System.out.println("Título: " + libroDos.getTitulo());
        System.out.println("Autor: " + libroDos.getAutor());
        System.out.println("Nro. de páginas: " + libroDos.getPaginas());
        
    }
    
}
