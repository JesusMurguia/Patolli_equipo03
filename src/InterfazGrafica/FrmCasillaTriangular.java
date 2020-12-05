/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author javie
 */
public class FrmCasillaTriangular  extends FrmAbstractCasilla{
    
    
    public FrmCasillaTriangular(int x, int y) {
        super(x, y);
    }

    @Override
    public void analizarJugada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        Polygon FiguratTriangulo = new Polygon();

        g.setColor(Color.PINK);
        g.fillRect(getX(), getY(), getAlto(), getAncho());
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getAlto(), getAncho());
        // (x1 + (ancho / 2), y)
        FiguratTriangulo.addPoint(getX() + (getAncho() / 2), getY());
        FiguratTriangulo.addPoint((getX() + (getAncho() / 2)) + getAncho(), getY());
        // (x2, y + ancho)
        FiguratTriangulo.addPoint(getX() + getAncho(), getY() + getAlto());
        g.drawPolygon(FiguratTriangulo);
        g.fillPolygon(FiguratTriangulo);
    }
}
