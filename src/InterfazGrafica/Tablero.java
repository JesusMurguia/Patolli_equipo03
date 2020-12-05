/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author javie
 */
public class Tablero extends Canvas {
//tablero de 68, 60 ,52,44
    //14  12  10 08
    //16  14  12 10

    private FrmAbstractCasilla[] casillas;
   // private Caña cañas[];
    int numeroCasillas;

    public Tablero(int numeroCasillas) {
        this.numeroCasillas = numeroCasillas;
        casillas = new FrmAbstractCasilla[numeroCasillas];
        calculateSquares();
    }

    public void setCasillas(FrmAbstractCasilla[] casillas) {
        this.casillas = casillas;
    }

    public void lanzar() {
        System.out.println("lanzar cania");
    }

    byte centroArriba;
    byte izquierdaCentro;
    byte centroIzquierda;
    byte abajoCentro;
    byte centroAbajo;
    byte derechaCentro;
    byte centroArribaAux;
    byte arribaCentro;

    public void calculateSquares() {
        //VARIABLES ( estas variables son el numero de fichas que se dibujaran por aspa depende del tablero elejido )
        //de arriba al cento
        //inicio arribaCentro =0
        //fin
        this.centroArriba = (byte) ((((casillas.length - 4) / 4) / 2) + 1);

        //inicio 
        //-centroArriba
        //fin
        this.izquierdaCentro = (byte) ((byte) ((((casillas.length - 4) / 4) / 2) + 1) + ((((casillas.length - 4) / 4) / 2)));

        //inicio
        //-IzquierdaCentro
        ///fin
        this.centroIzquierda = (byte) ((byte) ((((casillas.length - 4) / 4) / 2) * 2 + 1) + ((((casillas.length - 4) / 4) / 2) + 1));

        //inicio
        //-centroIzquierda
        //fin 
        this.abajoCentro = (byte) (centroIzquierda + ((((casillas.length - 4) / 4) / 2)));

        //inicio
        //-abajoCentro
        //fin
        this.centroAbajo = (byte) (abajoCentro + ((((casillas.length - 4) / 4) / 2) + 1));

        //incio
        //-centroAbajo
        //fin
        this.derechaCentro = (byte) (centroAbajo + ((((casillas.length - 4) / 4) / 2)));

        //inicio
        //-derechaCentro
        //fin
        this.centroArribaAux = (byte) (derechaCentro + ((((casillas.length - 4) / 4) / 2)) + 1);

        //inicio
        //-centroArribaAux
        //fin
        this.arribaCentro = (byte) (centroArribaAux + ((((casillas.length - 4) / 4) / 2)));

    }

    /**
     * el siguiente metodo dibujara un tablero con 14 casillas por aspa y las 4
     * del centro
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {

        //--------------------------//
        //tablero de 14 por aspa
        switch (casillas.length) {
            case 68:
                drawIxachiBoard(g);
                break;
            case 60:
                //-----------------------//
                //tablero de 12 por aspa

                drawBigBoard(g);
                break;
            case 52:
                //--------------------tablero de 10 por aspa-----------------//

                drawMediumBoard(g);
                break;
            default:
                //--------------------tablero de 08 por aspa-----------------//
                /*
                inicio, fin, x, y, boolean casillaCentral, posicionCasCentral, posicionTriangular, graficos*/
                drawSmallBoard(g);
                break;
        }
    }

    public FrmAbstractCasilla[] getCasillas() {
        return casillas;
    }

    /**
     *
     * @param inicio
     * @param fin
     * @param x
     * @param y
     * @param casillaCentral
     * @param posicionCasCentral
     * @param posicionTriangular
     * @param g
     */
    private void verticalPositiva(int inicio, int fin, int x, int y, boolean casillaCentral,
            int posicionTriangular, Graphics g) {
        byte j = -1;
        for (int i = inicio; i < fin; i++) {
            j++;

            if (casillaCentral && j == 0) {
                casillas[i] = new FrmCasillaCentral(x, y + 30 * j);
            } else if (j == posicionTriangular) {
                casillas[i] = new FrmCasillaTriangularCuadrada(x, y + 30 * j);
                casillas[i].paint(g);
                i = i + 1;
                j++;
                casillas[i] = new FrmCasillaTriangular(x, y + 30 * j);
                casillas[i].paint(g);
                i = i + 1;
                j++;
                casillas[i] = new FrmCasillaTriangularCuadrada(x, y + 30 * j);
                System.out.println("Cocaina");
            } else {
                casillas[i] = new FrmCasilla(x, y + 30 * j);
//                System.out.println("Valor x: " + x);
//                System.out.println("Valor y: " + y + 30 * j);

            }
            casillas[i].paint(g);

        }

    }

    private void verticalNegativa(int inicio, int fin, int x, int y, boolean casillaCentral,
            int posicionTriangular, Graphics g) {
        byte j = -1;
        for (int i = inicio; i < fin; i++) {
            j++;

            if (casillaCentral && j == 0) {
                casillas[i] = new FrmCasillaCentral(x, y - 30 * j);
            } else if (j == posicionTriangular) {
                casillas[i] = new FrmCasillaTriangularCuadrada(x, y - 30 * j);
                casillas[i].paint(g);
                i = i + 1;
                j++;
                casillas[i] = new FrmCasillaTriangular(x, y - 30 * j);
                casillas[i].paint(g);
                i = i + 1;
                j++;
                casillas[i] = new FrmCasillaTriangularCuadrada(x, y - 30 * j);
              
            } else {
                casillas[i] = new FrmCasilla(x, y - 30 * j);
//                System.out.println("Valor x: " + x);
//                System.out.println("Valor y: " + y + 30 * j);

            }
            casillas[i].paint(g);

        }

    }

    /**
     *
     * @param inicio
     * @param fin
     * @param x
     * @param y
     * @param casillaCentral
     * @param posicionCasCentral
     * @param g
     */
    public void horizontalNegativa(int inicio, int fin, int x, int y, boolean casillaCentral, Graphics g) {
        int j = -1;
        for (int i = inicio; i < fin; i++) {
            j++;
            if (casillaCentral && j == 0) {
                casillas[i] = new FrmCasillaCentral(x - 30 * i, y);
                System.out.println(x - 30 * i);
            } else {
                casillas[i] = new FrmCasilla(x - 30 * i, y);
                System.out.println(x - 30 * i);
            }

            casillas[i].paint(g);

        }

    }

    public void horizontalPositiva(int inicio, int fin, int x, int y, boolean casillaCentral, Graphics g) {
        byte j = -1;
        for (int i = inicio; i < fin; i++) {
            j++;
            if (casillaCentral && j == 0) {
                casillas[i] = new FrmCasillaCentral(x + 30 * j, y);
            } else {
                casillas[i] = new FrmCasilla(x + 30 * j, y);
            }

            casillas[i].paint(g);

        }

    }

    public void drawIxachiBoard(Graphics g) {
        verticalPositiva(0, this.centroArriba, 560, 50, false, 1, g);
        horizontalNegativa(this.centroArriba, this.izquierdaCentro, 800, 290, true, g);
        horizontalPositiva(this.izquierdaCentro, this.centroIzquierda, 320, 320, false, g);
        verticalPositiva(this.centroIzquierda, this.abajoCentro, 560, 350, true, 4, g);
        verticalNegativa(this.abajoCentro, this.centroAbajo, 590, 560, false, 1, g);
        horizontalPositiva(this.centroAbajo, this.derechaCentro, 620, 320, true, g);
        horizontalNegativa(this.derechaCentro, this.centroArribaAux, 2360, 290, false, g);
        verticalNegativa(this.centroArribaAux, this.arribaCentro, 590, 260, true, 4, g);
    }

    public void drawBigBoard(Graphics g) {
        verticalPositiva(0, this.centroArriba, 560, 80, false, 1, g);
        horizontalNegativa(this.centroArriba, this.izquierdaCentro, 770, 290, true, g);
        horizontalPositiva(this.izquierdaCentro, this.centroIzquierda, 350, 320, false, g);
        verticalPositiva(this.centroIzquierda, this.abajoCentro, 560, 350, true, 3, g);
        verticalNegativa(this.abajoCentro, this.centroAbajo, 590, 530, false, 1, g);
        horizontalPositiva(this.centroAbajo, this.derechaCentro, 620, 320, true, g);
        horizontalNegativa(derechaCentro, this.centroArribaAux, 2150, 290, false, g);
        verticalNegativa(this.centroArribaAux, this.arribaCentro, 590, 260, true, 3, g);
    }

    public void drawMediumBoard(Graphics g) {
        verticalPositiva(0, this.centroArriba, 560, 80, false, 1, g);
        horizontalNegativa(this.centroArriba, this.izquierdaCentro, 740, 260, true, g);
        horizontalPositiva(this.izquierdaCentro, this.centroIzquierda, 380, 290, false, g);
        verticalPositiva(this.centroIzquierda, this.abajoCentro, 560, 320, true, 2, g);
        verticalNegativa(this.abajoCentro, this.centroAbajo, 590, 470, false, 1, g);
        horizontalPositiva(this.centroAbajo, this.derechaCentro, 620, 290, true, g);
        horizontalNegativa(this.derechaCentro, this.centroArribaAux, 1940, 260, false, g);
        verticalNegativa(this.centroArribaAux, this.arribaCentro, 590, 230, true, 2, g);
    }

    public void drawSmallBoard(Graphics g) {
        verticalPositiva(0, this.centroArriba, 560, 80, false, 1, g);
        horizontalNegativa(this.centroArriba, this.izquierdaCentro, 710, 230, true, g);
        horizontalPositiva(izquierdaCentro, this.centroIzquierda, 410, 260, false, g);
        verticalPositiva(this.centroIzquierda, this.abajoCentro, 560, 290, true, 1, g);
        verticalNegativa(this.abajoCentro, this.centroAbajo, 590, 410, false, 1, g);
        horizontalPositiva(this.centroAbajo, this.derechaCentro, 620, 260, true, g);
        horizontalNegativa(this.derechaCentro, this.centroArribaAux, 1730, 230, false, g);
        verticalNegativa(this.centroArribaAux, this.arribaCentro, 590, 200, true, 1, g);
    }

}
