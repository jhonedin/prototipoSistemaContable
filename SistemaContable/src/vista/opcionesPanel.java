/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class opcionesPanel extends javax.swing.JPanel {

    /**
     * Creates new form opcionesPanel
     */
    vistaPrincipal frame; // instancia frame del frame principal 
    public opcionesPanel(vistaPrincipal frame) {
        this.frame = frame; // la instancia del frame principal la paso a una instancia en esta clase para poder usar los metodos del frame principal
        initComponents();
        setBackground(Color.white);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistroIngreso = new javax.swing.JButton();
        btnRegistroGastos = new javax.swing.JButton();
        btnEntradaSalidaInventario = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistroCostos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 650));

        btnRegistroIngreso.setText("Registro de Ingreso");
        btnRegistroIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroIngresoActionPerformed(evt);
            }
        });

        btnRegistroGastos.setText("Registro de Gastos");
        btnRegistroGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroGastosActionPerformed(evt);
            }
        });

        btnEntradaSalidaInventario.setText("Entrada/Salida Inventario");
        btnEntradaSalidaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaSalidaInventarioActionPerformed(evt);
            }
        });

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistroCostos.setText("Registro de Costos");
        btnRegistroCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCostosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE GESTION CONTABLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(305, 305, 305))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistroCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegistroGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntradaSalidaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(btnRegistroIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnRegistroIngreso)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroGastos)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroCostos)
                .addGap(18, 18, 18)
                .addComponent(btnEntradaSalidaInventario)
                .addGap(18, 18, 18)
                .addComponent(btnConsultas)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroIngresoActionPerformed
        // TODO add your handling code here:
        frame.swap(1); // hace el llamado al panel de Registro de ingresos
        
    }//GEN-LAST:event_btnRegistroIngresoActionPerformed

    private void btnRegistroCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCostosActionPerformed
        // TODO add your handling code here:
        frame.swap(2); // hace el llamado al panel de Registro de costos
    }//GEN-LAST:event_btnRegistroCostosActionPerformed

    private void btnRegistroGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroGastosActionPerformed
        // TODO add your handling code here:
        frame.swap(3); // hace el llamado al panel de Registro de gastos
    }//GEN-LAST:event_btnRegistroGastosActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
        frame.swap(5); // hace el llamado al panel de consultas
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnEntradaSalidaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaSalidaInventarioActionPerformed
        // TODO add your handling code here:
         frame.swap(4); // hace el llamado al panel de Entrada y Salida de Inventarios
    }//GEN-LAST:event_btnEntradaSalidaInventarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0); // termnar la ejecución del programa 
    }//GEN-LAST:event_btnSalirActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnEntradaSalidaInventario;
    private javax.swing.JButton btnRegistroCostos;
    private javax.swing.JButton btnRegistroGastos;
    private javax.swing.JButton btnRegistroIngreso;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
