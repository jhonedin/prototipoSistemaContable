/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.PucLogica;
import modelo.Puc;

/**
 *
 * @author Jhon
 */
public class consultaCuentasPUCPanel extends javax.swing.JPanel {

    /**
     * Creates new form consultaCuentasPUCPanel
     */
    vistaPrincipal frame; // instancia frame del frame principal
    DefaultTableModel modelo;
    private Puc puc;
    private PucLogica pucLogica;
    private List<Puc> listaPuc;
    private List<Puc> listaPucAux;
    public consultaCuentasPUCPanel(vistaPrincipal frame) {
        this.frame = frame; // la instancia del frame principal la paso a una instancia en esta clase para poder usar los metodos del frame principal
        listaPuc = new ArrayList<Puc>();
        puc = new Puc(); 
        PucLogica pucLogica = new PucLogica();
        initComponents();
        setBackground(Color.white);
        listaPuc = pucLogica.listarPuc();
        llenarTablaIngresos(listaPuc);
    }
    
    public void llenarTablaIngresos(List<Puc> puc){
        
        List<Puc> lista;
        lista = puc;
        setTabla(lista);
    }
    
    public void setTabla(List<Puc> pucLista){
        modelo =  (DefaultTableModel) tablePucCompleto.getModel();
        
        int size = modelo.getRowCount();
        for(int i=0; i < size; i++){
            modelo.removeRow(0);
        }
        String aux[];
        for(int j=0;j< pucLista.size();j++){
            aux = new String[2];
            aux[0] = pucLista.get(j).getCodigo();
            aux[1] = pucLista.get(j).getNombre();
            modelo.addRow(aux);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePucCompleto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        labeltitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labeltitulo.setText("Cuentas PUC");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tablePucCompleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePucCompleto);

        jLabel1.setText("Buscar cuentas que comiencen por:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labeltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVolver)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labeltitulo)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        frame.swap(5); // hace el llamado al panel de consultas de donde desprende este panel
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        listaPuc = new ArrayList<Puc>();
        listaPucAux = new ArrayList<Puc>();
        puc = new Puc(); 
        PucLogica pucLogica = new PucLogica();
        listaPuc = pucLogica.listarPuc();
        if(txtFiltro.getText()==""){
          listaPucAux = listaPuc;
        }
        else{
            for(int i=0;i<=listaPuc.size()-1;i++){
                puc = listaPuc.get(i);
                if(puc.getCodigo().startsWith(txtFiltro.getText())){
                    listaPucAux.add(puc);
                }
            }
        }
        llenarTablaIngresos(listaPucAux);
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTable tablePucCompleto;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
