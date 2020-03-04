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
public class registroGastoPanel extends javax.swing.JPanel {

    /**
     * Creates new form registroGastoPanel
     */
    vistaPrincipal frame; // instancia frame del frame principal 
    public registroGastoPanel(vistaPrincipal frame) {
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

        labelTitulo = new javax.swing.JLabel();
        btnVolverRegistroGasto = new javax.swing.JButton();
        labelFechaRegistro = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTitulo.setText("REGISTROS DE GASTOS");

        btnVolverRegistroGasto.setText("Volver");
        btnVolverRegistroGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRegistroGastoActionPerformed(evt);
            }
        });

        labelFechaRegistro.setText("Fecha de Registro: ");

        labelDia.setText("Dia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnVolverRegistroGasto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFechaRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDia))
                            .addComponent(labelTitulo))))
                .addContainerGap(605, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaRegistro)
                    .addComponent(labelDia))
                .addGap(163, 163, 163)
                .addComponent(btnVolverRegistroGasto)
                .addContainerGap(364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverRegistroGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistroGastoActionPerformed
        // TODO add your handling code here:
        frame.swap(0); // hace el llamado al panel de opciones
    }//GEN-LAST:event_btnVolverRegistroGastoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverRegistroGasto;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
