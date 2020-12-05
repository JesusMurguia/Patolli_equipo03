/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author javie
 */
public class FrmCasillaSemicircular extends FrmAbstractCasilla{
    
    public FrmCasillaSemicircular(int x, int y) {
        super(x, y);
    }

    @Override
    public void analizarJugada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {
         g.setColor(Color.BLACK);
        g.fillRect(getX(), getY(), getAlto(), getAncho());
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getAlto(), getAncho());
    }
}
