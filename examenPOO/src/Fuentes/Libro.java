/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author JCVELMON
 */
public class Libro 
{
    private String autor;
    private String titulo;
    private double precio;

    public Libro(String autor, String titulo, double precio) 
    {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autor =" + autor + ", Titulo =" + titulo + ", Precio =" + precio ;
    }
    
    
    
    
    
}
