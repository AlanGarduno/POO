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
public class Cita 
{
    private Cliente cliente;
    private Auto auto;
    private String d;

    public Cita(Cliente cliente, Auto auto, String d) {
        this.cliente = cliente;
        this.auto = auto;
        this.d = d;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Cita{" + "cliente=" + cliente + ", auto=" + auto + ", d=" + d + '}';
    }
            
}
