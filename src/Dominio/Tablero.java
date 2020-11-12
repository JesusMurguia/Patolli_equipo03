/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Dominio.Ficha;
import Dominio.CasillaCentral;
import Dominio.Casilla;
import Dominio.Caña;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author javie
 */
public class Tablero extends Canvas {
//tablero de 68, 60 ,52,44
           //14  12  10 08
           //16  14  12 10
    
  private iCasilla[] casillas ;
    private Caña cañas[];
    int numeroCasillas;

    public Tablero(int numeroCasillas) {
        this.numeroCasillas = numeroCasillas;
        casillas = new iCasilla[numeroCasillas];
    }
    
    

    public void setCasillas(iCasilla[] casillas) {
        this.casillas = casillas;
    }

    public void lanzar() {
        System.out.println("lanzar cania");
    }

    /**
     * el siguiente metodo dibujara un tablero con 14 casillas por aspa y las 4
     * del centro
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {

        //VARIABLES ( estas variables son el numero de fichas que se dibujaran por aspa depende del tablero elejido )
        //de arriba al cento

        //inicio arribaCentro =0
      //fin
        byte centroArriba = (byte) ((((casillas.length - 4) / 4) / 2)+1);
       


        //inicio 
        //-centroArriba
        //fin
        byte izquierdaCentro = (byte) ((byte) ((((casillas.length - 4) / 4) / 2) + 1)+ ((((casillas.length - 4) / 4) / 2)));
        
        //inicio
        //-IzquierdaCentro
         ///fin
        byte centroIzquierda =(byte) ((byte) ((((casillas.length - 4) / 4) / 2) * 2+1)+((((casillas.length - 4) / 4) / 2) + 1));
       
        //inicio
        //-centroIzquierda
        //fin 
        byte abajoCentro = (byte) (centroIzquierda +  ((((casillas.length - 4) / 4) / 2)));
        
        //inicio
        //-abajoCentro
        //fin
        byte centroAbajo = (byte) (abajoCentro+((((casillas.length - 4) / 4) / 2)+1));
        
        //incio
        //-centroAbajo
        //fin
        byte derechaCentro =(byte) (centroAbajo+((((casillas.length - 4) / 4) / 2)));
    
        
        //inicio
        //-derechaCentro
        //fin
        byte centroArribaAux=(byte) (derechaCentro+((((casillas.length - 4) / 4) / 2))+1);
        
        //inicio
        //-centroArribaAux
        //fin
        byte arribaCentro=(byte) (centroArribaAux+((((casillas.length - 4) / 4) / 2)));
        
      


       
      //--------------------------//
      //tablero de 14 por aspa
      switch (casillas.length) {
          case 68:
              vertical(0, centroArriba, 560, 50,false,0, g);
              horizontal(centroArriba, izquierdaCentro, 800, 290,true,centroArriba,  g);
              horizontal(izquierdaCentro, centroIzquierda, 1070, 320,false,0, g);
              vertical(centroIzquierda, abajoCentro, 560, 350,true,centroIzquierda, g);
              vertical(abajoCentro, centroAbajo, 590, 320, false,0,g);
              horizontal(centroAbajo, derechaCentro, 2120, 320,true, derechaCentro-1,  g);
              horizontal(derechaCentro, centroArribaAux, 2360, 290, false,0,g);
              vertical(centroArribaAux, arribaCentro, 590, 50,true, arribaCentro-1, g);
              break;
          case 60:
              //-----------------------//
              //tablero de 12 por aspa
              
              
              vertical(0, centroArriba, 560, 80,false,0, g);
              horizontal(centroArriba, izquierdaCentro, 770, 290,true,centroArriba, g);
              horizontal(izquierdaCentro, centroIzquierda, 1010, 320,false,0, g);
              vertical(centroIzquierda, abajoCentro, 560, 350,true,centroIzquierda, g);
              vertical(abajoCentro, centroAbajo, 590, 320,false,0, g);
              horizontal(centroAbajo, derechaCentro, 1940, 320,true, derechaCentro-1, g);
              horizontal(derechaCentro, centroArribaAux, 2150, 290,false,0, g);
              vertical(centroArribaAux, arribaCentro, 590, 80, true, arribaCentro-1,g);
              break;
          case 52:
              //--------------------tablero de 10 por aspa-----------------//
              
              vertical(0, centroArriba, 560, 80,false,0, g);
              horizontal(centroArriba, izquierdaCentro, 740, 260,true,centroArriba, g);
              horizontal(izquierdaCentro, centroIzquierda, 950, 290,false,0, g);
              vertical(centroIzquierda, abajoCentro, 560, 320,true,centroIzquierda, g);
              vertical(abajoCentro, centroAbajo, 590, 290,false,0, g);
              horizontal(centroAbajo, derechaCentro, 1760, 290,true, derechaCentro-1, g);
              horizontal(derechaCentro, centroArribaAux, 1940, 260,false,0, g);
              vertical(centroArribaAux, arribaCentro, 590, 80, true, arribaCentro-1,g);
              break;
          default:
              //--------------------tablero de 08 por aspa-----------------//
              
              vertical(0, centroArriba, 560, 80, false,0,g);
              horizontal(centroArriba, izquierdaCentro, 710, 230,true,centroArriba, g);
              horizontal(izquierdaCentro, centroIzquierda, 890, 260,false,0, g);
              vertical(centroIzquierda, abajoCentro, 560, 290,true,centroIzquierda, g);
              vertical(abajoCentro, centroAbajo, 590, 260,false,0, g);
              horizontal(centroAbajo, derechaCentro, 1580, 260,true, derechaCentro-1,g);
              horizontal(derechaCentro, centroArribaAux, 1730, 230,false,0, g);
              vertical(centroArribaAux, arribaCentro, 590, 80,true, arribaCentro-1,g);
              break;
      }
    }

    public iCasilla[] getCasillas() {
        return casillas;
    }

    private void vertical(int inicio, int fin,int x,int y, boolean casillaCentral,int posicionCasCentral,Graphics g) {
byte j = -1;
        for (int i = inicio; i < fin; i++) {
      j++;
            
      if(casillaCentral && posicionCasCentral==i)
      {
          
          casillas[i]= new CasillaCentral(x, y + 30 * j);
      }else{
            casillas[i] = new Casilla(x, y + 30 * j);
           
      }
          
            casillas[i].paint(g);
            

        }
       
    }

    public void horizontal(int inicio,int fin,int x,int y,boolean casillaCentral,int posicionCasCentral,Graphics g) {

        for (int i = inicio; i < fin; i++) {
          
             
             if(casillaCentral && posicionCasCentral==i)
             {
                 casillas[i]=new CasillaCentral(x - 30 * i, y);
             }else{
            casillas[i] = new Casilla(x - 30 * i, y);
             }
            casillas[i].paint(g);
             
        }

       
    }
    
    
}
