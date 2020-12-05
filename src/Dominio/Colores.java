/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.awt.Color;

/**
 *
 * @author javie
 */
public enum Colores {
    
     BLANCO(Color.WHITE), 
    AMARILLO(Color.YELLOW), 
    ROJO(Color.RED),
    NEGRO(Color.BLACK),
    GRIS(Color.LIGHT_GRAY),
    AZUL(Color.BLUE);

  
    private Color color;
    


    private Colores(Color color) {
        this.color = color;
      
    }

    public static Colores getBLANCO() {
        return BLANCO;
    }

    public static Colores getAMARILLO() {
        return AMARILLO;
    }

    public static Colores getROJO() {
        return ROJO;
    }

    public static Colores getNEGRO() {
        return NEGRO;
    }

    public static Colores getGRIS() {
        return GRIS;
    }

    public static Colores getAZUL() {
        return AZUL;
    }

    public Color getColor() {
        return color;
    }

    
   
   
    
       
    
    
}
