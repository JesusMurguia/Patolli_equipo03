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
import Sockets.ClienteSocket;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.ClienteBBO;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben Cardoza, Javier Barreras, Jesus Murguia y Brayan Fajardo
 */
public class FrmMain extends javax.swing.JFrame implements Observer {

    private FrmTablero tablero;
    //cse crea jugador
    private Jugador jugador_uno;

    ClienteSocket clienteSocket = new ClienteSocket();

    public FrmMain() {

                 initComponents();
    }

    public FrmMain(int numeroCasillas) {

        configurarJugador();
        desplegarFicha();

    }

    public void crearPartida(BlackBoardObject crearPartidaBBO) {

        clienteSocket.enviarBBO(crearPartidaBBO);
       

    }

    public void unirsePartida(BlackBoardObject unirsePartidaBBO) {
     
        clienteSocket.enviarBBO(unirsePartidaBBO);
       

    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof ClienteBBO) {
            System.out.println("estoy en updated");
            ClienteBBO cliente = (ClienteBBO) arg;
           
           
            
            
        
             
               this.tablero = new FrmTablero(cliente.getTablero().getTamanioTablero());
               this.tablero.setSize(1200, 1200);
                this.setExtendedState(this.MAXIMIZED_BOTH);
               this.add(tablero);
               
                for (int i = 0; i < cliente.getJugadores().size(); i++) {
                    System.out.println("entre for");
                    if (!cliente.getJugadores().get(i).getNombre().isEmpty()) {
                       
                        switch (i) {
                            case 0:
                                jLabelJugadorUno.setText(cliente.getJugadores().get(0).getNombre());
                                break;
                            case 1:
                                jLabelJugadorDos.setText(cliente.getJugadores().get(1).getNombre());
                                break;
                            case 2:
                                jLabelJugadorTres.setText(cliente.getJugadores().get(2).getNombre());
                                break;
                            case 3:
                                jLabelJugadorCuatro.setText(cliente.getJugadores().get(3).getNombre());
                                break;
                        
                    }
                }
            } 

        }
         this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonAvanzar = new javax.swing.JButton();
        jLabelJugadorUno = new javax.swing.JLabel();
        jLabelJugadorDos = new javax.swing.JLabel();
        jLabelJugadorTres = new javax.swing.JLabel();
        jLabelJugadorCuatro = new javax.swing.JLabel();

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

        jLabelJugadorUno.setText("JUGADOR UNO");

        jLabelJugadorDos.setText("JUGADOR DOS");

        jLabelJugadorTres.setText("JUGADOR TRES");

        jLabelJugadorCuatro.setText("JUGADOR CUATRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 501, Short.MAX_VALUE)
                .addComponent(jButtonAvanzar))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJugadorUno)
                    .addComponent(jLabelJugadorDos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJugadorTres)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1))
                    .addComponent(jLabelJugadorCuatro)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelJugadorUno)
                        .addComponent(jLabelJugadorTres)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAvanzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJugadorDos)
                    .addComponent(jLabelJugadorCuatro))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Deseas salir?");
        if (respuesta == 0) {
            FrmMenuPrincipal menu = new FrmMenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvanzarActionPerformed

        avanzar();
        this.add(tablero);


    }//GEN-LAST:event_jButtonAvanzarActionPerformed

    public void configurarJugador() {
        //  jugador_uno = new Jugador("javier",true,1000, new CasillaCentral(570,280));
        jugador_uno.getFichas()[0] = new Ficha();
        jugador_uno.getFichas()[0].setColor(Colores.NEGRO);
        System.out.println("config->" + jugador_uno.getFichas()[0].getColor().getColor());

    }

    //le asigna la ficha a la casilla inicial del jugador
    public void desplegarFicha() {

        if (jugador_uno.getFichas()[0].getCasilla() == null) {

            jugador_uno.getCasillaInicio().setFichaUno(jugador_uno.getFichas()[0]);
            //tablero.getCasillas()[9]=jugador_uno.getCasillaInicio();
        }
    }

    public void avanzar() {
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
    private javax.swing.JLabel jLabelJugadorCuatro;
    private javax.swing.JLabel jLabelJugadorDos;
    private javax.swing.JLabel jLabelJugadorTres;
    private javax.swing.JLabel jLabelJugadorUno;
    // End of variables declaration//GEN-END:variables

}
