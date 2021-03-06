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
public class selectPUCPanelCosto extends javax.swing.JPanel {

    /**
     * Creates new form selectPUCPanel
     */
    vistaPrincipal frame; // instancia frame del frame principal
    DefaultTableModel modelo;
    private Puc puc;
    private PucLogica pucLogica;
    private List<Puc> listaPuc;
    private List<Puc> listaPucAux;
    
    public selectPUCPanelCosto(vistaPrincipal frame) {
        this.frame = frame; // la instancia del frame principal la paso a una instancia en esta clase para poder usar los metodos del frame principal
        listaPuc = new ArrayList<Puc>();
        listaPucAux = new ArrayList<Puc>();
        puc = new Puc(); 
        PucLogica pucLogica = new PucLogica();
        initComponents();
        setBackground(Color.white);
        listaPuc = pucLogica.listarPuc();
     
        for(int i=0;i<= listaPuc.size()-1;i++){
            if(listaPuc.get(i).getCodigo().startsWith("6")){              
                if(listaPuc.get(i).getCodigo().toCharArray().length>=6){
                    listaPucAux.add(listaPuc.get(i));
                }
            }
        }
        llenarTablaIngresos(listaPucAux);
    }
    
    public void llenarTablaIngresos(List<Puc> puc){
        
        List<Puc> lista;
        lista = puc;
        setTabla(lista);
    }
    
    public void setTabla(List<Puc> pucLista){
        modelo =  (DefaultTableModel) tablePUC.getModel();
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePUC = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una cuenta PUC");

        tablePUC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePUC);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Para seleccionar una cuenta da \"Clic\" en una de las cuentas que aparece en la tabla y luego \"Clic\" en el boton seleccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSeleccionar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSeleccionar)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        listaPuc = new ArrayList<Puc>();
        listaPucAux = new ArrayList<Puc>();
        puc = new Puc(); 
        PucLogica pucLogica = new PucLogica();
        listaPuc = pucLogica.listarPuc();
        for(int i=0;i<= listaPuc.size()-1;i++){
            if(listaPuc.get(i).getCodigo().startsWith("6")){              
                if(listaPuc.get(i).getCodigo().toCharArray().length>=6){
                    listaPucAux.add(listaPuc.get(i));
                }
            }
        }
        
        int filaSelect = 0; 
        filaSelect =  tablePUC.getSelectedRow();
        String codigoSelect = "";
        codigoSelect = listaPucAux.get(filaSelect).getCodigo();
        //System.out.println("Codigo seleccionado: "+codigoSelect);
        puc = pucLogica.buscarPucxcodigo(codigoSelect);
        //System.out.println("Objeto seleccionado: "+puc.getCodigo()+" - "+puc.getNombre());
        frame.setPucSelectCostos(puc);
        frame.swap(2); // hace el llamado al panel de registro de costos
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePUC;
    // End of variables declaration//GEN-END:variables
}
