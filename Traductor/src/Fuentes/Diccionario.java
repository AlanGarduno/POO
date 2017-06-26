/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author JCVELMON
 */
public class Diccionario 
{
    private ArrayList<Palabras> diccionario;
    
    public Diccionario() 
    {
        this.diccionario = new ArrayList<Palabras>();
    }

    public ArrayList<Palabras> getDiccionario() {
        return diccionario;
    }
    
    public String buscar(String cad)
    {
        for(Palabras p: diccionario)
        {
            if(!p.traducir(cad).equals(""))
            {
                p.traducir(cad);
            }
        }
        return "La palabra no existe";
    }
    
    
    
    
    
}
