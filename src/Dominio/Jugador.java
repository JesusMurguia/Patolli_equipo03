/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Dominio.Ficha;
import Dominio.CasillaCentral;
import Dominio.Apuesta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class Jugador implements Serializable {

    private String nombre;
    private double montoFijo;
    private CasillaCentral casillaInicio;
    private List<Apuesta> apuestas = new ArrayList<>();
    private Ficha fichas[];

    public Jugador(String nombre, double montoFijo) {
        this.nombre = nombre;
         this.montoFijo = montoFijo;
        
    }
    
     public Jugador(String nombre) {
        this.nombre = nombre;
        
        
    }
    
    public Jugador( int montoFijo, CasillaCentral casillaInicio) {
        
        this.montoFijo = montoFijo;
        this.casillaInicio = casillaInicio;

    }
    
    

    public CasillaCentral getCasillaInicio() {
        return casillaInicio;
    }

    public void setCasillaInicio(CasillaCentral casillaInicio) {
        this.casillaInicio = casillaInicio;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }
    
    
}
