/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combo;

public class GenerarClave {
    
    private String genero;
    private String estado;
    private String clave;

        public GenerarClave(String genero, String estado) {
        this.genero = genero;
        this.estado = estado;
        this.clave = "";
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void obtenerEstado()
    {
        this.clave =this.clave+estado.substring(0,1)+ estado.charAt(estado.length() - 1);
    }
   
    public void obtenerGenero()
    {
        this.clave =this.clave + genero.substring(0, 1);
    }
    
    public void obtenerAleatorio()
    {
        int numero = (int)(Math.random() *99) +1;
        this.clave = this.clave + Integer.toString(numero);
    }
}
