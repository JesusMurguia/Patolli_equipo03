/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Dominio.Tablero;
import Dominio.Jugador;
import Dominio.Ficha;
import Dominio.CasillaCentral;
import Dominio.Colores;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben Cardoza, Javier Barreras, Jesus Murguia  y Brayan Fajardo
 */
public class FrmMain extends javax.swing.JFrame {

      private Tablero tablero;
      //cse crea jugador
     private Jugador jugador_uno;
    
       //
   // 
    public FrmMain() {
       
       
    }
    
     public FrmMain(int numeroCasillas) 
     {
      initComponents();
          this.tablero = new Tablero(numeroCasillas);
        tablero.setSize(1200,1200);
       
       this.setExtendedState(this.MAXIMIZED_BOTH);
      
        configurarJugador();
          desplegarFicha();
           this.add(tablero);
          this.setVisible(true);
            
      
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonAvanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAvanzar.setText("Avanzar");
        jButtonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 350, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAvanzar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAvanzar)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int respuesta=JOptionPane.showConfirmDialog(this, "Deseas salir?");
        if(respuesta==0){
            FrmMenuPrincipal menu=new FrmMenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvanzarActionPerformed
       
        avanzar();
        this.add(tablero);
        
        
    }//GEN-LAST:event_jButtonAvanzarActionPerformed

    public void configurarJugador()
    {
       jugador_uno = new Jugador("javier",true,1000, new CasillaCentral(570,280));
       jugador_uno.getFichas()[0]= new Ficha();
       jugador_uno.getFichas()[0].setColor(Colores.NEGRO);
        System.out.println("config->"+jugador_uno.getFichas()[0].getColor().getColor());
   
        
       
       
    }
    //le asigna la ficha a la casilla inicial del jugador
    public void desplegarFicha()
   {
       
        if(jugador_uno.getFichas()[0].getCasilla()==null)
        {
           
            jugador_uno.getCasillaInicio().setFichaUno(jugador_uno.getFichas()[0]);
            tablero.getCasillas()[9]=jugador_uno.getCasillaInicio();
        }
    }
    
    
   public void avanzar()
   {
     // tablero.moverFicha(jugador_uno.getFichas()[0]);
   }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAvanzar;
    // End of variables declaration//GEN-END:variables
}
