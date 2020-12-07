/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Ficha {
     
 List <RegistroMovimiento> registros= new  ArrayList<>();
iCasilla casilla;


private int x=0;
private int y=0;

private final int ancho = 15;
private final int alto = 15;
private final int movimiento = 40;

 private Colores color;
    public Ficha(iCasilla casilla) {
       this.casilla=casilla;
    }
 public Ficha(int x,int y) {
       this.x=x;
       this.y=y;
    }

    public Ficha(Colores color) {
        this.color = color;
    }

   public Ficha() {
      
    }
/**
 * el siguiente metodo pinta un circulo relleno
 * de color rosa con el contorno de color negro
 * represantando la ficha.
 * @param g 
 */
    public void paint(Graphics g) {
        g.setColor(this.color.getColor());
        g.fillOval(x, y, alto, ancho);
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawOval(x, y, alto, ancho);
    }


    
    public List<RegistroMovimiento> getRegistros() {
        return registros;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    
    
    
    public void setRegistros(List<RegistroMovimiento> registros) {
        this.registros = registros;
    }

    public iCasilla getCasilla() {
        return casilla;
    }

    public void setCasilla(iCasilla casilla) {
        this.casilla = casilla;
    }
    
    
    public void caminar()
    {
        System.out.println("caminando...");
    }
}
