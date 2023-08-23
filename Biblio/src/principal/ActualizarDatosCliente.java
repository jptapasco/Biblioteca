
package principal;
import java.sql.ResultSet;
import clases.DataBase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActualizarDatosCliente extends javax.swing.JPanel {
    
    DataBase basedatos;

    public ActualizarDatosCliente(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }

    /**
     *
     * @param evt
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        etq_actualizar = new javax.swing.JLabel();
        etq_buscar_cedula = new javax.swing.JLabel();
        campo_buscar_cedula = new javax.swing.JTextField();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_apellido = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_apellido = new javax.swing.JTextField();
        separador_1 = new javax.swing.JSeparator();
        btn_actualizar = new javax.swing.JButton();
        Separador2 = new javax.swing.JSeparator();
        imagen = new javax.swing.JLabel();
        etq_p1 = new javax.swing.JLabel();
        etq_p2 = new javax.swing.JLabel();
        etq_p3 = new javax.swing.JLabel();
        etq_p4 = new javax.swing.JLabel();
        bnt_buscar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        etq_actualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        etq_actualizar.setText("Actualizar Datos");

        etq_buscar_cedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_buscar_cedula.setText("Digita tu cedula");

        campo_buscar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_buscar_cedulaActionPerformed(evt);
            }
        });

        etq_cedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_cedula.setText("Cedula");

        etq_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_nombre.setText("Nombre");

        etq_apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_apellido.setText("Apellido");

        campo_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_direccionActionPerformed(evt);
            }
        });

        etq_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_telefono.setText("Telefono");

        etq_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_direccion.setText("Direccion (barrio, calle, ciudad)");

        campo_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_apellidoActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N

        etq_p1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_p1.setText("Entre paginas vuela el alma,");

        etq_p2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_p2.setText("palabras tejen sueños con calma,");

        etq_p3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_p3.setText("Lectura, puerta a la fantasia,");

        etq_p4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_p4.setText("donde el corazón halla su vía.");

        bnt_buscar.setText("BUSCAR");
        bnt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador_1)
            .addComponent(Separador2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_actualizar)
                .addGap(272, 272, 272))
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_p1)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_p2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_p4)
                                    .addComponent(etq_p3))
                                .addGap(9, 9, 9)))
                        .addGap(120, 120, 120))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etq_direccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etq_cedula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etq_apellido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campo_apellido)))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etq_nombre)
                                .addComponent(etq_telefono))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(campo_telefono))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_buscar_cedula)
                        .addGap(34, 34, 34)
                        .addComponent(campo_buscar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(bnt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etq_actualizar)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_buscar_cedula)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_buscar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellido)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etq_p1)
                        .addGap(18, 18, 18)
                        .addComponent(etq_p2)
                        .addGap(18, 18, 18)
                        .addComponent(etq_p3)
                        .addGap(18, 18, 18)
                        .addComponent(etq_p4)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_buscar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_buscar_cedulaActionPerformed
        
    }//GEN-LAST:event_campo_buscar_cedulaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void campo_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_direccionActionPerformed

    }//GEN-LAST:event_campo_direccionActionPerformed

    private void campo_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_apellidoActionPerformed

    }//GEN-LAST:event_campo_apellidoActionPerformed

    private void bnt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_buscarActionPerformed
        System.out.println("si");
        String buscar_cedula = campo_buscar_cedula.getText();
            
        ResultSet lista = this.basedatos.buscarCliente(buscar_cedula);
        
        if(lista != null){
            try {    
                String cedula = lista.getString("cedula"); 
                String nombre = lista.getString("nombre");
                String apellido = lista.getString("apellido");
                String telefono = lista.getString("telefono");
                String direccion = lista.getString("direccion");
                campo_cedula.setText(cedula);
                campo_nombre.setText(nombre);
                campo_apellido.setText(apellido);
                campo_telefono.setText(telefono);
                campo_direccion.setText(direccion);
                
            } catch (SQLException ex) {
                System.out.println("No mano"+ex.getMessage());
            }
        } else{
            System.out.println("lista vacia");
        } 
    }//GEN-LAST:event_bnt_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String cedula = campo_cedula.getText();
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String telefono = campo_telefono.getText();
        String direccion = campo_direccion.getText();
        
        boolean resultado = this.basedatos.updateClientes(cedula, nombre, apellido, telefono, direccion);
        if(resultado){
            JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            campo_cedula.setText("");
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_telefono.setText("");
            campo_direccion.setText("");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador2;
    private javax.swing.JButton bnt_buscar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_buscar_cedula;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_actualizar;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_buscar_cedula;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_p1;
    private javax.swing.JLabel etq_p2;
    private javax.swing.JLabel etq_p3;
    private javax.swing.JLabel etq_p4;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSeparator separador_1;
    // End of variables declaration//GEN-END:variables
}
