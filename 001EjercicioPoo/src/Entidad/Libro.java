/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
//ISBN, Título, Autor,
//Número de páginas,
/**
 *
 * @author Familia Pedro
 */

//constructor con argumentos
public class Libro {
    public Libro(int isbn, String titulo, String autor, int paginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
//constructor sin argumentos
    public Libro() {
    }
    
//atributos
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
//setters 
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
//getters    
    public int getIsbn() {
        return isbn;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
}
