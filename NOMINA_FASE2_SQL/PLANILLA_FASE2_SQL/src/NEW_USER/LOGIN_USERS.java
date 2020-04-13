/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEW_USER;

import ACCESO_ADMINISTRADOR.VISTA_ADMINISTRADOR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovani
 */
public class LOGIN_USERS extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_USERS
     */
    public LOGIN_USERS() {
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

        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("USER LOGIN");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 170, 30));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("RETURN");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 40));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("REGISTER");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 40));

        btnNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NEW USER");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 130, 40));

        txtPass.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        fondo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW_USER/fondo_ingreso_users.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW_USER/fondo login users.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        LOGIN_ADMI regreso = new LOGIN_ADMI();
        regreso.setVisible(true);
        this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        
        try{
        
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/NUEVOS_USUARIOS", "root", "compromiso");
        
        
        PreparedStatement pst = cn.prepareStatement("select * from nuevo_usuario where Usuario = ?");
        
        pst.setString(1, txtUsuario.getText().trim());
        ResultSet rs = pst.executeQuery();
        
        PreparedStatement pst2 = cn.prepareStatement("select * from nuevo_usuario where Pass = ?");
        
        pst2.setString(1, txtPass.getText().trim());
        ResultSet rs2 = pst2.executeQuery();
        
        
                
                
        
        
        if(rs.next()){
            
                if(rs2.next()){
                                JOptionPane.showMessageDialog(null, "Bienvenido" + "     " +rs.getString("Usuario"));
                                
                                
                VISTA_ADMINISTRADOR VentanaAdministrador = new VISTA_ADMINISTRADOR();
                VentanaAdministrador.setVisible(true);
                this.dispose();
                
                }
                        
            } else {
                JOptionPane.showMessageDialog(null, "No registrado.");
                txtUsuario.setText("");
                txtPass.setText("");
                
                
            }
        
        
        
        
        /*
        
        
        pst.setString(1, txtnombreI.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            PreparedStatement pst2 = cn.prepareStatement("select * from registros where contraseña = ?");
            
            
            pst2.setString(1, txtcontraseniaI.getText().trim());
            ResultSet rs2 = pst2.executeQuery();
            
            if(rs.next()){
                
                txtnombre.setText(rs.getString("nombreusuario"));
                
                if(rs2.next()){
                
                txtcontrasenia.setText(rs.getString("contraseña"));
                
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No registrado.");
            }
        
        
        
        */
        
        }catch(Exception e){
            
            
            
        }
        
        
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        
New_User nuevo = new New_User();
nuevo.setVisible(true);
this.dispose();


// TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_USERS().setVisible(true);
            }
        });
                }         
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
