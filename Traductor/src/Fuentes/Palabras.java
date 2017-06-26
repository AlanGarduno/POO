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
public class Palabras 
{
    private String palabra;
    private String significado;

    public Palabras(String palabra, String significado) {
        this.palabra = palabra;
        this.significado = significado;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
    
    public String traducir(String cad)
    {
        if(cad.equals(palabra))
        {
            return significado;
        }
        if(cad.equals(significado))
        {
            return palabra;
        }
        
        return "";
    }
    
    
    
}
