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
public class registroCostoPanel extends javax.swing.JPanel {

    /**
     * Creates new form registroCostoPanel
     */
    vistaPrincipal frame; // instancia frame del frame principal 
    public registroCostoPanel(vistaPrincipal frame) {
        this.frame = frame; // la instancia del frame principal la paso a una instancia en esta clase para poder usar los metodos del frame principal
        initComponents();
        setBackground(Color.white);
        ComboBoxMes.removeAllItems();
        ComboBoxMes.addItem("ENERO");
        ComboBoxMes.addItem("FEBRERO");
        ComboBoxMes.addItem("MARZO");
        ComboBoxMes.addItem("ABRIL");
        ComboBoxMes.addItem("MAYO");
        ComboBoxMes.addItem("JUNIO");
        ComboBoxMes.addItem("JULIO");
        ComboBoxMes.addItem("AGOSTO");
        ComboBoxMes.addItem("SEPTIEMBRE");
        ComboBoxMes.addItem("OCTUBRE");
        ComboBoxMes.addItem("NOVIEMBRE");
        ComboBoxMes.addItem("DICIEMBRE");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        btnVolverRegistroCosto = new javax.swing.JButton();
        labelFechaRegistro = new javax.swing.JLabel();
        labelDiaRegistro = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        labelMesRegistro = new javax.swing.JLabel();
        ComboBoxMes = new javax.swing.JComboBox<>();
        labelRegistroAnio = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        labelCentroCosto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnConsultaCentroCosto = new javax.swing.JButton();
        labelCuentaPUC = new javax.swing.JLabel();
        txtCuentaPUC = new javax.swing.JTextField();
        btnConsultarPUC = new javax.swing.JButton();
        labelCodigoKardex = new javax.swing.JLabel();
        txtCodigoKardex = new javax.swing.JTextField();

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTitulo.setText("REGISTRO DE COSTOS");

        btnVolverRegistroCosto.setText("Volver");
        btnVolverRegistroCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRegistroCostoActionPerformed(evt);
            }
        });

        labelFechaRegistro.setText("Fecha de Registro:");

        labelDiaRegistro.setText("Dia:");

        labelMesRegistro.setText("Mes:");

        ComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelRegistroAnio.setText("Año:");

        labelCentroCosto.setText("Centro de Costo:");

        btnConsultaCentroCosto.setText("Consultar Centro Costo");

        labelCuentaPUC.setText("Cuenta PUC:");

        btnConsultarPUC.setText("Consultar PUC");

        labelCodigoKardex.setText("Codigo Kardex:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverRegistroCosto)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCentroCosto)
                            .addComponent(labelFechaRegistro)
                            .addComponent(labelCodigoKardex))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDiaRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelMesRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelRegistroAnio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultaCentroCosto)
                                .addGap(18, 18, 18)
                                .addComponent(labelCuentaPUC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuentaPUC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarPUC))
                            .addComponent(txtCodigoKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaRegistro)
                    .addComponent(labelDiaRegistro)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMesRegistro)
                    .addComponent(ComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRegistroAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCentroCosto)
                    .addComponent(btnConsultaCentroCosto)
                    .addComponent(labelCuentaPUC)
                    .addComponent(txtCuentaPUC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarPUC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoKardex)
                    .addComponent(txtCodigoKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(btnVolverRegistroCosto)
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverRegistroCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistroCostoActionPerformed
        // TODO add your handling code here:
        frame.swap(0); // hace el llamado al panel de opciones
    }//GEN-LAST:event_btnVolverRegistroCostoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMes;
    private javax.swing.JButton btnConsultaCentroCosto;
    private javax.swing.JButton btnConsultarPUC;
    private javax.swing.JButton btnVolverRegistroCosto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCentroCosto;
    private javax.swing.JLabel labelCodigoKardex;
    private javax.swing.JLabel labelCuentaPUC;
    private javax.swing.JLabel labelDiaRegistro;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelMesRegistro;
    private javax.swing.JLabel labelRegistroAnio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCodigoKardex;
    private javax.swing.JTextField txtCuentaPUC;
    private javax.swing.JTextField txtDia;
    // End of variables declaration//GEN-END:variables
}
