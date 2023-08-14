package principal;

import clases.DataBase;


public class RegistrarUsuario extends javax.swing.JPanel {

    DataBase basedatos;
    
    public RegistrarUsuario(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrar_user_contenedor = new javax.swing.JPanel();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        etq_apellido = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        rol_select = new javax.swing.JComboBox<>();
        etq_tipo_user = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        btn_registrar_user = new javax.swing.JButton();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_titulo = new javax.swing.JLabel();

        registrar_user_contenedor.setBackground(new java.awt.Color(204, 204, 204));

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_apellidoActionPerformed(evt);
            }
        });

        etq_apellido.setText("Apellido");

        etq_telefono.setText("Teléfono");

        campo_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_telefonoActionPerformed(evt);
            }
        });

        campo_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_direccionActionPerformed(evt);
            }
        });

        etq_direccion.setText("Direccion");

        rol_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bibliotecario", "Cliente" }));
        rol_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rol_selectActionPerformed(evt);
            }
        });

        etq_tipo_user.setText("Tipo de Usuario");

        etq_nombre.setText("Nombre");

        btn_registrar_user.setBackground(new java.awt.Color(102, 204, 255));
        btn_registrar_user.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar_user.setText("REGISTRAR");
        btn_registrar_user.setOpaque(true);
        btn_registrar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_userActionPerformed(evt);
            }
        });

        etq_cedula.setText("Cedula");

        campo_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrar_user_contenedorLayout = new javax.swing.GroupLayout(registrar_user_contenedor);
        registrar_user_contenedor.setLayout(registrar_user_contenedorLayout);
        registrar_user_contenedorLayout.setHorizontalGroup(
            registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrar_user_contenedorLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrar_user_contenedorLayout.createSequentialGroup()
                        .addComponent(etq_tipo_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rol_select, 0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_nombre)
                            .addComponent(etq_apellido)
                            .addComponent(etq_telefono)
                            .addComponent(etq_direccion)
                            .addComponent(campo_nombre)
                            .addComponent(campo_apellido)
                            .addComponent(campo_telefono)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_cedula)
                            .addComponent(campo_cedula))
                        .addGroup(registrar_user_contenedorLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(btn_registrar_user))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        registrar_user_contenedorLayout.setVerticalGroup(
            registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrar_user_contenedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(registrar_user_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rol_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_tipo_user))
                .addGap(18, 18, 18)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_registrar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("REGISTRAR USUARIO");
        etq_titulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrar_user_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar_user_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void campo_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_apellidoActionPerformed

    private void campo_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefonoActionPerformed

    private void campo_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_direccionActionPerformed

    private void rol_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rol_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rol_selectActionPerformed

    private void btn_registrar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_userActionPerformed
        String rol = (String) rol_select.getSelectedItem();
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String cedula = campo_cedula.getText();
        String telefono = campo_telefono.getText();
        String direccion = campo_direccion.getText();
        
         boolean respuesta = this.basedatos.agregarUsuario(cedula, rol, nombre, apellido , telefono, direccion);
        if (respuesta) {
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_cedula.setText("");
            campo_telefono.setText("");
            campo_direccion.setText("");

        }
    }//GEN-LAST:event_btn_registrar_userActionPerformed

    private void campo_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar_user;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_tipo_user;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel registrar_user_contenedor;
    private javax.swing.JComboBox<String> rol_select;
    // End of variables declaration//GEN-END:variables
}
