
package principal;

import clases.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class HistorialPrestamo extends javax.swing.JPanel {
    
    DataBase basedatos;
    DefaultTableModel modelo;
    public HistorialPrestamo(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initModeloComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_prestamo = new javax.swing.JLabel();
        etq_digitar = new javax.swing.JLabel();
        campo_digitarCedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        parrafo_1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        parrafo_2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();

        etq_prestamo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        etq_prestamo.setText("Historial de Prestamo");

        etq_digitar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_digitar.setText("Digita tu cedula");

        campo_digitarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_digitarCedulaActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        parrafo_1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        parrafo_1.setText("Digita tu cedula para ver el registo de los libros que has prestado, por favor sigue en");

        parrafo_2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        parrafo_2.setText("el maravilloso mundo de la lectura y sumergete por historias maravillosas \"amo leer\".");

        tabla_resultados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Libro", "Fecha de devolucion"
            }
        ));
        jScrollPane2.setViewportView(tabla_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addGap(590, 590, 590)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(etq_prestamo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parrafo_1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_digitar)
                                .addGap(29, 29, 29)
                                .addComponent(campo_digitarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(parrafo_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(etq_prestamo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_digitar)
                    .addComponent(campo_digitarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(parrafo_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parrafo_2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(210, 210, 210)
                .addComponent(jLabel5)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_digitarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_digitarCedulaActionPerformed

    }//GEN-LAST:event_campo_digitarCedulaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String cedula = campo_digitarCedula.getText();
    
        String nombre = this.basedatos.buscarClient(cedula);
        ResultSet listado = this.basedatos.BuscarClientePrestamos(nombre);

        if(listado != null){
            try {
                modelo.setRowCount(0);
                do{
                    String nombre_user = listado.getString("usuario");
                    String nombre_libro = listado.getString("nombre_libro");
                    String fecha_dev = listado.getString("fecha_devolucion");
                    
                    Object[] temp = new Object[]{nombre_user, nombre_libro, fecha_dev};
                    modelo.addRow(temp);
                    
                } while(listado.next());
            } catch (SQLException ex) {
                System.out.println("Nada en el historial"+ex.getMessage());
            }
        }else{
            System.out.println("error ---: " );
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void initModeloComponents(){
        modelo = (DefaultTableModel) tabla_resultados.getModel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_digitarCedula;
    private javax.swing.JLabel etq_digitar;
    private javax.swing.JLabel etq_prestamo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel parrafo_1;
    private javax.swing.JLabel parrafo_2;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
