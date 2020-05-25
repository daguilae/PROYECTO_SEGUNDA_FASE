/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACCESO_USUARIOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovani
 */
public class ConsultaPuestos extends javax.swing.JInternalFrame {

    private static String db = "NOMINA_SALARIO";
    private static String user = "root";
    private static String password = "Cagada1234";
    private static String host = "localhost";
    private static String server = "jdbc:mysql://"+ host + "/" +db; 
            
          
    /**
     * Creates new form ConsultaPuestos
     */
    public ConsultaPuestos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        txtMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuestos = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAPUESTOS");
        setToolTipText("");
        setVisible(true);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        txtMostrar.setText("MOSTRAR");
        txtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarActionPerformed(evt);
            }
        });

        tblPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPuestos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarActionPerformed

         DefaultTableModel modelo = new DefaultTableModel();
        
        try{
                        
        Connection cn = DriverManager.getConnection(server, user, password);
        PreparedStatement pst2 = cn.prepareStatement("select * from PUESTO where IdPuesto= ?");
        pst2.setString(1, txtBuscar.getText().trim());
        
        ResultSet rs2 = pst2.executeQuery();
        
        ResultSetMetaData rsMd = rs2.getMetaData();
        int cantidadcol = rsMd.getColumnCount();
        
        modelo.addColumn("IdPuesto");
        modelo.addColumn("NombrePuesto");
        
        
           if( rs2.next()){
                
                Object[] filas = new Object[cantidadcol];
                
                for(int i=0; i<cantidadcol; i++){
                    
                    filas[i] = rs2.getObject(i+1);
                    
                }
                
                modelo.addRow(filas);
          
          
            tblPuestos.setModel(modelo);
         
           }else 
           {
               JOptionPane.showMessageDialog(null, "CODIGO NO REGISTRADO");
              txtBuscar.setText("");
           }
           
        }catch(Exception e){
       
            
        }



// TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPuestos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JButton txtMostrar;
    // End of variables declaration//GEN-END:variables
}
