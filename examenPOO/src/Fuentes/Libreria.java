/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;
import Vistas.Datos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JCVELMON
 */
public class Libreria 
{
    //private Libro [] libros;
    private ArrayList<Libro> libros;
    private Datos d = new Datos();
    //int indice;

    public Libreria() 
    {
        //this.libros = new Libro[10];
        libros = new ArrayList<Libro>();
        //this.indice = 0;
    }
    
    public void insertar(Libro libro)
    {
        libros.add(libro);
    }
    
    public String listar()
    {
        String aux = null;
        for (int i = 0; i < libros.size(); i++) 
        {
            aux = libros.get(i).toString();
        }
        return aux;
    }
    
    
    
}
