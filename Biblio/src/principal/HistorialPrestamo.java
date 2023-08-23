
package principal;

import clases.DataBase;

public class HistorialPrestamo extends javax.swing.JPanel {
    
    DataBase basedatos;
    public HistorialPrestamo(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_prestamo)
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parrafo_2)
                    .addComponent(jLabel4)
                    .addComponent(parrafo_1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_digitar)
                        .addGap(29, 29, 29)
                        .addComponent(campo_digitarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(etq_prestamo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_digitar)
                    .addComponent(campo_digitarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(parrafo_1)
                .addGap(9, 9, 9)
                .addComponent(parrafo_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(333, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_digitarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_digitarCedulaActionPerformed

    }//GEN-LAST:event_campo_digitarCedulaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_digitarCedula;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_digitar;
    private javax.swing.JLabel etq_historial;
    private javax.swing.JLabel etq_prestamo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel parrafo_1;
    private javax.swing.JLabel parrafo_2;
    // End of variables declaration//GEN-END:variables
}
