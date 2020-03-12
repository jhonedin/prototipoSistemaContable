/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.ReporteERLogica;

/**
 *
 * @author Jhon
 */
public class consultaReporteEstadoResultados extends javax.swing.JPanel {

    /**
     * Creates new form consultaReporteEstadoResultados
     */
    vistaPrincipal frame; // instancia frame del frame principal
    public consultaReporteEstadoResultados(vistaPrincipal frame) {
        this.frame = frame; // la instancia del frame principal la paso a una instancia en esta clase para poder usar los metodos del frame principal
        initComponents();
        setBackground(Color.white);
        ComboBoxMesInicial.removeAllItems();
        ComboBoxMesInicial.addItem("ENERO");
        ComboBoxMesInicial.addItem("FEBRERO");
        ComboBoxMesInicial.addItem("MARZO");
        ComboBoxMesInicial.addItem("ABRIL");
        ComboBoxMesInicial.addItem("MAYO");
        ComboBoxMesInicial.addItem("JUNIO");
        ComboBoxMesInicial.addItem("JULIO");
        ComboBoxMesInicial.addItem("AGOSTO");
        ComboBoxMesInicial.addItem("SEPTIEMBRE");
        ComboBoxMesInicial.addItem("OCTUBRE");
        ComboBoxMesInicial.addItem("NOVIEMBRE");
        ComboBoxMesInicial.addItem("DICIEMBRE");
        
        ComboBoxMesFinal.removeAllItems();
        ComboBoxMesFinal.addItem("ENERO");
        ComboBoxMesFinal.addItem("FEBRERO");
        ComboBoxMesFinal.addItem("MARZO");
        ComboBoxMesFinal.addItem("ABRIL");
        ComboBoxMesFinal.addItem("MAYO");
        ComboBoxMesFinal.addItem("JUNIO");
        ComboBoxMesFinal.addItem("JULIO");
        ComboBoxMesFinal.addItem("AGOSTO");
        ComboBoxMesFinal.addItem("SEPTIEMBRE");
        ComboBoxMesFinal.addItem("OCTUBRE");
        ComboBoxMesFinal.addItem("NOVIEMBRE");
        ComboBoxMesFinal.addItem("DICIEMBRE");
    }
    
    public int convertirMestoNumero(String mes){
        int mesNum = 0;
        switch(mes) {
        case "ENERO":
            mesNum = 1;
            break;
        case "FEBRERO":
            mesNum = 2;
            break;
        case "MARZO":
            mesNum = 3;
            break;
        case "ABRIL":
            mesNum = 4;
            break;
        case "MAYO":
            mesNum = 5;
            break;
        case "JUNIO":
            mesNum = 6;
            break;
        case "JULIO":
            mesNum = 7;
            break;    
        case "AGOSTO":
            mesNum = 8;
            break;  
        case "SEPTIEMBRE":
            mesNum = 9;
            break;  
        case "OCTUBRE":
            mesNum = 10;
            break;   
        case "NOVIEMBRE":
            mesNum = 11;
            break;    
        case "DICIEMBRE":
            mesNum = 12;
            break;
        default:
            mesNum = 0;
        }
        return mesNum;       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiaFechaInicial = new javax.swing.JTextField();
        ComboBoxMesInicial = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAnioFechaInicial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDiaFechaFinal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ComboBoxMesFinal = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtAnioFechaFinal = new javax.swing.JTextField();
        btnGenerarEstadoResultado = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTitulo.setText("REPORTE ESTADO DE RESULTADOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EME INTIMO");

        jLabel2.setText("Carlos H. Franco Cruz");

        jLabel3.setText("Nit 94.309.509-7");

        jLabel4.setText("Estado de Resultados");

        jLabel5.setText("Fecha de Consultas:");

        jLabel6.setText("Inicial:");

        jLabel7.setText("Final:");

        jLabel8.setText("Dia:");

        ComboBoxMesInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Mes:");

        jLabel10.setText("Año:");

        jLabel11.setText("Dia:");

        jLabel12.setText("Mes:");

        ComboBoxMesFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Año:");

        btnGenerarEstadoResultado.setText("Generar Reporte");
        btnGenerarEstadoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarEstadoResultadoActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerarEstadoResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnioFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnioFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelTitulo)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiaFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ComboBoxMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDiaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addComponent(btnGenerarEstadoResultado)
                .addGap(36, 36, 36)
                .addComponent(btnVolver)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        frame.swap(5); // hace el llamado al panel de consultas de donde desprende este panel
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarEstadoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarEstadoResultadoActionPerformed
        // TODO add your handling code here:
        try {
        ReporteERLogica reporteERLogica = new ReporteERLogica(); 
        int IngresoPorVenta = 0;
        
        int dI = Integer.valueOf(txtDiaFechaInicial.getText());
        int mI = convertirMestoNumero(ComboBoxMesInicial.getSelectedItem().toString());
        int aI = Integer.valueOf(txtAnioFechaInicial.getText());
        int dF = Integer.valueOf(txtDiaFechaFinal.getText());
        int mF = convertirMestoNumero(ComboBoxMesFinal.getSelectedItem().toString());
        int aF = Integer.valueOf(txtAnioFechaFinal.getText());
        int ingresoPV = reporteERLogica.ingresosPorVenta(dI,mI,aI,dF,mF,aF);
        int cvCostoProduccion = reporteERLogica.calculoCVCostosProduccion(dI, mI, aI, dF, mF, aF); 
        System.out.println("Ingreso por venta fue:"+ingresoPV);
        System.out.println("El costo de produccion fue:"+cvCostoProduccion);
        frame.swap(9); // hace el llamado al panel donde se muestra el estado de resultados calculado
        }catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error, no pueden existir campos vacios");
            //nfe.printStackTrace();
        }
        
    }//GEN-LAST:event_btnGenerarEstadoResultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMesFinal;
    private javax.swing.JComboBox<String> ComboBoxMesInicial;
    private javax.swing.JButton btnGenerarEstadoResultado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtAnioFechaFinal;
    private javax.swing.JTextField txtAnioFechaInicial;
    private javax.swing.JTextField txtDiaFechaFinal;
    private javax.swing.JTextField txtDiaFechaInicial;
    // End of variables declaration//GEN-END:variables
}
