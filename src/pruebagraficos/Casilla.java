/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author javie
 */
public class Casilla extends iCasilla {

    public Casilla(int x,int y) {
        super(x,y);
    }
    
    public Casilla() {
       
    }
    

    @Override
    public void analizarJugada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
/**
 * este metodo dibujara un rectangulo de color rosa con un contorno negro
 * @param g 
 */
    @Override
    public void paint(Graphics g) {
          g.setColor(Color.PINK);
        g.fillRect(getX(), getY(), getAlto(), getAncho());
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getAlto(), getAncho());
        
          if(getFichaUno()!=null){
            getFichaUno().setX(getX());
            getFichaUno().setY(getY());
              getFichaUno().paint(g);
        }
       
    }

 
}
