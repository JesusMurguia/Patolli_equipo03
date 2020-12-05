/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Dominio.Ficha;
import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author javie
 */
public abstract class FrmAbstractCasilla extends Canvas{
      Ficha fichaUno;
    Ficha fichaDos;
    private int x = 0;
    private int y = 0;
    private final int ancho = 30;
    private final int alto = 30;

    public FrmAbstractCasilla(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public FrmAbstractCasilla(Ficha fichaUno) {
        this.fichaUno = fichaUno;
       
    }

    public Ficha getFichaUno() {
        return fichaUno;
    }

    public void setFichaUno(Ficha fichaUno) {
        this.fichaUno = fichaUno;
    }

    public Ficha getFichaDos() {
        return fichaDos;
    }

    public void setFichaDos(Ficha fichaDos) {
        this.fichaDos = fichaDos;
    }
    
    
    
   
    
     public FrmAbstractCasilla() {
       
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

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

  
    



   

    @Override
    public abstract void paint(Graphics g);
public abstract void analizarJugada();


}
