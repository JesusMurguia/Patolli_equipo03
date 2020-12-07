/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import Dominio.Jugador;
import Dominio.Tablero;
import blackboardObjects.CrearPartidaBBO;

/**
 *
 * @author jesus
 */
public class FrmConfiguracionPartida extends javax.swing.JFrame {
//FrmSalaEspera waitingplayers=new FrmSalaEspera();
    FrmMain juegoPrincipal;
int numeroCasillas = 44;
    /** Creates new form FrmConfigurarPartida */
    public FrmConfiguracionPartida() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldMontoFijo = new javax.swing.JTextField();
        jTextFieldMontoApuesta = new javax.swing.JTextField();
        jTextFieldNombreJugador = new javax.swing.JTextField();
        crearPartida = new javax.swing.JButton();
        CasillasCombo = new javax.swing.JComboBox<>();
        jComboBoxNumeroFichas = new javax.swing.JComboBox<>();
        jLabelNombreJugador = new javax.swing.JLabel();
        jLabelmontoFijo = new javax.swing.JLabel();
        jLabelMontoApuesta = new javax.swing.JLabel();
        jLabelNumeroFichas = new javax.swing.JLabel();
        jLabelTamanioTablero = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldMontoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMontoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 140, 30));
        getContentPane().add(jTextFieldMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 140, 30));
        getContentPane().add(jTextFieldNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 140, 30));

        crearPartida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagraficos/imgs/button_crear-partida (1).png"))); // NOI18N
        crearPartida.setText("CREAR PARTIDA");
        crearPartida.setContentAreaFilled(false);
        crearPartida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagraficos/imgs/button_crear-partidahover (1).png"))); // NOI18N
        crearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPartida(evt);
            }
        });
        getContentPane().add(crearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 317, 91));

        CasillasCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chico", "mediano", "grande", "ixachi" }));
        CasillasCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNumeroCasillas(evt);
            }
        });
        getContentPane().add(CasillasCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 130, 30));

        jComboBoxNumeroFichas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        getContentPane().add(jComboBoxNumeroFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 130, 30));

        jLabelNombreJugador.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreJugador.setText("Nombre del jugador");
        getContentPane().add(jLabelNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabelmontoFijo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelmontoFijo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmontoFijo.setText("Monto fijo:");
        getContentPane().add(jLabelmontoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 110, -1));

        jLabelMontoApuesta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMontoApuesta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoApuesta.setText("Monto de apuesta:");
        getContentPane().add(jLabelMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 170, -1));

        jLabelNumeroFichas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelNumeroFichas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroFichas.setText("Numero de fichas:");
        getContentPane().add(jLabelNumeroFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabelTamanioTablero.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelTamanioTablero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTamanioTablero.setText("Tamaño del tablero:");
        getContentPane().add(jLabelTamanioTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagraficos/imgs/menuprincipal.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 800, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearPartida(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPartida

        Tablero tablero = new Tablero(Double.valueOf(jTextFieldMontoFijo.getText()),Double.valueOf(jTextFieldMontoApuesta.getText()),
                                      Integer.parseInt(jComboBoxNumeroFichas.getSelectedItem().toString()),this.numeroCasillas);
        Jugador jugador = new Jugador(jTextFieldNombreJugador.getText(), Double.valueOf(jTextFieldMontoFijo.getText()));
        
        CrearPartidaBBO crearPartidaBBO = new CrearPartidaBBO(jugador, tablero);
      
       juegoPrincipal=new FrmMain();
       
        this.dispose();
       juegoPrincipal.crearPartida(crearPartidaBBO);
       
    }//GEN-LAST:event_crearPartida

    private void jTextFieldMontoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoFijoActionPerformed
       
    }//GEN-LAST:event_jTextFieldMontoFijoActionPerformed

    private void checkNumeroCasillas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNumeroCasillas
       System.out.println(CasillasCombo.getSelectedItem());
       
       switch(CasillasCombo.getSelectedItem().toString())
       {
           case "chico": this.numeroCasillas=44;
           break;
           case "mediano": this.numeroCasillas=52;
           break;
           case "grande": this.numeroCasillas=60;
           break;
           case "ixachi": this.numeroCasillas=68;
           break;
       }
       
    }//GEN-LAST:event_checkNumeroCasillas

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmConfiguracionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfiguracionPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConfiguracionPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CasillasCombo;
    private javax.swing.JButton crearPartida;
    private javax.swing.JComboBox<String> jComboBoxNumeroFichas;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMontoApuesta;
    private javax.swing.JLabel jLabelNombreJugador;
    private javax.swing.JLabel jLabelNumeroFichas;
    private javax.swing.JLabel jLabelTamanioTablero;
    private javax.swing.JLabel jLabelmontoFijo;
    private javax.swing.JTextField jTextFieldMontoApuesta;
    private javax.swing.JTextField jTextFieldMontoFijo;
    private javax.swing.JTextField jTextFieldNombreJugador;
    // End of variables declaration//GEN-END:variables

}