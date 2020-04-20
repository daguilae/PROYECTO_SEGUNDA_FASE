/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLANILLA_FASE2;

import NEW_USER.Form_Logiin_Users;
import NEW_USER.Form_Login_Admin;
import NEW_USER.Form_New_User;



/**
 *
 * @author Geovani
 */
public class PANTALLA_LOGIN extends javax.swing.JFrame {

    private Form_New_User ventanaNuevoUsuario;
    private Form_Logiin_Users ventanaLoginUsuarios;
    private Form_Login_Admin ventanaLoginAdmin;
    /**
     * Creates new form PANTALLA_LOGIN
     */
    public PANTALLA_LOGIN() {
        initComponents();
       
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuIngresoAdmi = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SEBAS\\Desktop\\Proyecto_SegundaFase\\NOMINA_FASE2_SQL\\PLANILLA_FASE2_SQL\\src\\PLANILLA_FASE2\\fondoIngreso.jpg")); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(10, 30, 650, 370);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        jMenu1.setText("Ingresar");

        jMenuIngresoAdmi.setText("Administrador");
        jMenuIngresoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIngresoAdmiActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuIngresoAdmi);

        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIngresoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIngresoAdmiActionPerformed

        ventanaLoginAdmin = new Form_Login_Admin();
        jDesktopPane1.add(ventanaLoginAdmin);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIngresoAdmiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ventanaLoginUsuarios = new Form_Logiin_Users();
        jDesktopPane1.add(ventanaLoginUsuarios);
   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(PANTALLA_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PANTALLA_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuIngresoAdmi;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
