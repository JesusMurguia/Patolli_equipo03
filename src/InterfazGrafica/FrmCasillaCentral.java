/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Dominio.Ficha;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author javie
 */
public class FrmCasillaCentral extends FrmAbstractCasilla {
    
    public FrmCasillaCentral(int x, int y) {
        super(x, y);
    }
    
      public FrmCasillaCentral(Ficha fichaUno) {
        this.fichaUno = fichaUno;
       
    }
     
    @Override
    public void analizarJugada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * este metodo pintara un rectangulo de color amarillo con un 
 * contorno de color negro, represaentara las casillas centrales
 * @param g 
 */
    @Override
    public void paint(Graphics g) {
            g.setColor(Color.YELLOW);
        g.fillRect(getX(), getY(), getAlto(), getAncho());
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getAlto(), getAncho());
        
        if( getFichaUno()!=null){
            getFichaUno().setX(getX());
            getFichaUno().setY(getY());
            getFichaUno().paint(g);
        }
    
        
        
    }
    
}
