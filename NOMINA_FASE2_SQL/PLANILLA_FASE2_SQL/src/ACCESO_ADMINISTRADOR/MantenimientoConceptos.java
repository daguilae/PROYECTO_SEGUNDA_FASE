/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACCESO_ADMINISTRADOR;

/*import static ACCESO_ADMINISTRADOR.Registro.password;
import static ACCESO_ADMINISTRADOR.Registro.server;
import static ACCESO_ADMINISTRADOR.Registro.user;*/
import PLANILLA_FASE2.IngresoAdmin;
import static PLANILLA_FASE2.IngresoAdmin.jDesktopPane1;
import PLANILLA_FASE2.Seleccion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Chacon
 */

public class MantenimientoConceptos extends javax.swing.JInternalFrame {
public static String NombreConcepto = "";

   
   
    /**
     * Creates new form CONCEPTO
     */
    public MantenimientoConceptos() {
        initComponents();
        btnTipo.setVisible(false);
        jLabel4.setVisible(false);
        cbxUsoDeTabla.setVisible(false);
        btnNecesidadTabla.setVisible(false);
        btnAplicaA.setVisible(false);
        txtValorConcepto.setVisible(false);
        lblValor.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cbxTipo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValorConcepto = new javax.swing.JTextField();
        cbxAfecta = new javax.swing.JComboBox();
        lblValor = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnNecesidadTabla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAplicaA = new javax.swing.JButton();
        cbxUsoDeTabla = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbxAplicaA = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnTipo = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAplicacion = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una opcion", "Porcentaje", "Valor" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPanel2.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Afecta:");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("             Conceptos");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, 40));

        txtValorConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorConceptoActionPerformed(evt);
            }
        });
        jPanel2.add(txtValorConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 150, 30));

        cbxAfecta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una opcion", "Percepcion", "Deduccion" }));
        cbxAfecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAfectaActionPerformed(evt);
            }
        });
        jPanel2.add(cbxAfecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 30));

        lblValor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor Concepto:");
        lblValor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 120, 30));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 30));

        btnNecesidadTabla.setText("Ingresar Popiedades");
        jPanel2.add(btnNecesidadTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aplicacion");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        btnAplicaA.setText("Ingresar Propiedades");
        btnAplicaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicaAActionPerformed(evt);
            }
        });
        jPanel2.add(btnAplicaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        cbxUsoDeTabla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige una opcion", "Si", "No" }));
        cbxUsoDeTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUsoDeTablaActionPerformed(evt);
            }
        });
        jPanel2.add(cbxUsoDeTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo:");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 30));

        cbxAplicaA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige opcion", "Todos", "Algunos" }));
        cbxAplicaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAplicaAActionPerformed(evt);
            }
        });
        jPanel2.add(cbxAplicaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 80, 30));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 140, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 82, 34));

        btnTipo.setText("Configuracion Avanzada");
        btnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoActionPerformed(evt);
            }
        });
        jPanel2.add(btnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        btn_Modificar.setText("MODIFICAR");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, 31));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 100, 30));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INGRESE NO. CONCEPTO");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 27, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Necesita tabla?");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 310, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        btnAplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        btnAplicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(btnAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 920, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
              Connection cn = DriverManager.getConnection(Seleccion.BD, Seleccion.Usuario, Seleccion.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from CONCEPTOS where Id_Concepto = ?");
            pst.setString(1, txtBuscar.getText().trim());

            ResultSet rs = pst.executeQuery();
/*
            if(rs.next()){
                txtId.setText(rs.getString("Id_Concepto"));
                txtNombre.setText(rs.getString("NombreConcepto"));
                txtAplicacion.setText(rs.getString("AfectaConcepto"));
                txtValor.setText(rs.getString("valorConcepto"));
                txtTipo.setText(rs.getString("TipoConcepto"));
                txtValorMax.setText(rs.getString("ValorMax"));
                txtValorMin.setText(rs.getString("ValorMin"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Concepto no registrado.");
            }*/

        }catch (Exception e){

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:

        try {
            String ID = txtBuscar.getText().trim();

            Connection cn = DriverManager.getConnection(Seleccion.BD, Seleccion.Usuario, Seleccion.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update CONCEPTOS set Id_Concepto = ?,NombreConcepto = ?, AfectaConcepto = ?, valorConcepto = ?, TipoConcepto = ?, ValorMax = ?, ValorMin = ? where Id_Concepto = " + ID);

            pst.setString(1, txtId.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            /*pst.setString(3, txtAplicacion.getText().trim());
            pst.setString(4, txtValor.getText().trim());            
            pst.setString(5, txtTipo.getText().trim());
            pst.setString(6, txtValor.getText().trim());
            pst.setString(7, txtValor.getText().trim());*/
            pst.executeUpdate();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
       /* if ( txtId.getText().isEmpty() || txtNombre.getText().isEmpty()|| txtAplicacion.getText().isEmpty() || txtValor.getText().isEmpty()|| txtTipo.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(null, " NO SE PUEDE DEJAR CAMPO VACIO");

        }
        else {
            
           
            try{
               Connection cn = DriverManager.getConnection(Seleccion.BD, Seleccion.Usuario, Seleccion.Contraseña);
                PreparedStatement pst = cn.prepareStatement("insert into CONCEPTOS values (?,?,?,?,?,?,?)");

                pst.setString(1, txtId.getText().trim());
                pst.setString(2, txtNombre.getText().trim());
               /* pst.setString(3, txtAplicacion.getText().trim());
                pst.setString(4, txtValor.getText().trim());
                pst.setString(5, txtTipo.getText().trim());
                pst.setString(6, txtValorMax.getText().trim());
                pst.setString(7, txtValorMin.getText().trim());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Exitoso.");
                txtId.setText("");
                txtNombre.setText("");
               /* txtAplicacion.setText("");
                txtValor.setText("");
                txtTipo.setText("");
                txtValorMax.setText("");
                txtValorMin.setText("");

            }catch(Exception e){

            }
        }*/
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //Codigo que permite borrar registros en la base de datos

        try {
             Connection cn = DriverManager.getConnection(Seleccion.BD, Seleccion.Usuario, Seleccion.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from CONCEPTOS where Id_Concepto = ?");

            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();

            txtId.setText("");
                txtNombre.setText("");
                /*txtAplicacion.setText("");
                txtValor.setText("");
                txtTipo.setText("");
                txtValorMax.setText("");
                txtValorMin.setText("");*/
                
                JOptionPane.showMessageDialog(null, "Registro Eliminado.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtValorConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConceptoActionPerformed

    private void cbxAfectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAfectaActionPerformed
        // TODO add your handling code here:
        
        if (cbxAfecta.getSelectedIndex() == 1) {
            
        }
        else if(cbxAfecta.getSelectedIndex() == 2){
            
        }
        else{
        
        }
    }//GEN-LAST:event_cbxAfectaActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
        if (cbxTipo.getSelectedIndex() == 1) {
            btnTipo.setVisible(true);
            lblValor.setVisible(false);
         txtValorConcepto.setVisible(false);
        }
        else if(cbxTipo.getSelectedIndex() == 2){
            jLabel4.setVisible(false);
        cbxUsoDeTabla.setVisible(false);
        btnNecesidadTabla.setVisible(false);
         btnTipo.setVisible(false);
         lblValor.setVisible(true);
         txtValorConcepto.setVisible(true);
        }
        else{
        
        }
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoActionPerformed
        // TODO add your handling code here:
         jLabel4.setVisible(true);
        cbxUsoDeTabla.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnTipoActionPerformed

    private void cbxUsoDeTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUsoDeTablaActionPerformed
        // TODO add your handling code here:
        if (cbxUsoDeTabla.getSelectedIndex() == 1) {
            btnNecesidadTabla.setVisible(true);
            lblValor.setVisible(false);
         txtValorConcepto.setVisible(false);
        }
        else if(cbxUsoDeTabla.getSelectedIndex() == 2){
            btnNecesidadTabla.setVisible(false);
            lblValor.setVisible(true);
         txtValorConcepto.setVisible(true);
        }
        else{
        
        }
    }//GEN-LAST:event_cbxUsoDeTablaActionPerformed

    private void cbxAplicaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAplicaAActionPerformed

        
if (cbxAplicaA.getSelectedIndex() == 1) {
             btnAplicaA.setVisible(false);
        }
        else if(cbxAplicaA.getSelectedIndex() == 2){
            btnAplicaA.setVisible(true);
        }
        else{
        
        }






// TODO add your handling code here:
    }//GEN-LAST:event_cbxAplicaAActionPerformed

    private void btnAplicaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicaAActionPerformed
NombreConcepto = txtNombre.getText();
       
        
AplicacionExcepciones ventana = new AplicacionExcepciones ();
//ventana.setVisible(true);


IngresoAdmin.jDesktopPane1.add(ventana);
ventana.toFront();
ventana.setVisible(true);
   Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();






// TODO add your handling code here:
    }//GEN-LAST:event_btnAplicaAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicaA;
    private javax.swing.JLabel btnAplicacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNecesidadTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTipo;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JComboBox cbxAfecta;
    private javax.swing.JComboBox cbxAplicaA;
    private javax.swing.JComboBox cbxTipo;
    private javax.swing.JComboBox cbxUsoDeTabla;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValorConcepto;
    // End of variables declaration//GEN-END:variables
}
