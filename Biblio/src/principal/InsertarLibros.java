package principal;

import clases.DataBase;
import javax.swing.JOptionPane;

public class InsertarLibros extends javax.swing.JPanel {
    
    DataBase basedatos;
    
    public InsertarLibros(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_contenedor = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        formulario = new javax.swing.JPanel();
        etq_titulo_libro = new javax.swing.JLabel();
        campo_titulo = new javax.swing.JTextField();
        etq_autor_libro = new javax.swing.JLabel();
        campo_autor = new javax.swing.JTextField();
        campo_descripcion = new javax.swing.JTextField();
        etq_genero_libro = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        etq_titulo_libro4 = new javax.swing.JLabel();
        campo_valor_prestamo = new javax.swing.JTextField();
        btn_agregar_libro = new javax.swing.JButton();
        etq_titulo_libro5 = new javax.swing.JLabel();
        campo_cantidad_disponible = new javax.swing.JTextField();
        opciones_genero = new javax.swing.JComboBox<>();

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("REGISTRAR LIBRO");
        etq_titulo.setOpaque(true);

        formulario.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro.setText("Titulo");

        campo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        campo_titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tituloActionPerformed(evt);
            }
        });

        etq_autor_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_autor_libro.setText("Autor");

        campo_autor.setBackground(new java.awt.Color(255, 255, 255));
        campo_autor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_autorActionPerformed(evt);
            }
        });

        campo_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        campo_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_descripcionActionPerformed(evt);
            }
        });

        etq_genero_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_genero_libro.setText("Descripcion");

        Genero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Genero.setText("Genero"); // NOI18N

        etq_titulo_libro4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro4.setText("Valor prestamo");

        campo_valor_prestamo.setBackground(new java.awt.Color(255, 255, 255));
        campo_valor_prestamo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_valor_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_valor_prestamoActionPerformed(evt);
            }
        });

        btn_agregar_libro.setBackground(new java.awt.Color(102, 204, 255));
        btn_agregar_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_agregar_libro.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar_libro.setText("AGREGAR");
        btn_agregar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_libroActionPerformed(evt);
            }
        });

        etq_titulo_libro5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro5.setText("Cantidad disponible");

        campo_cantidad_disponible.setBackground(new java.awt.Color(255, 255, 255));
        campo_cantidad_disponible.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_cantidad_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidad_disponibleActionPerformed(evt);
            }
        });

        opciones_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Epico", "Romance", "Aventura", "Misterio", "Fantasia" }));
        opciones_genero.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                opciones_generoHierarchyChanged(evt);
            }
        });
        opciones_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opciones_generoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_autor_libro)
                    .addComponent(etq_genero_libro)
                    .addComponent(etq_titulo_libro)
                    .addComponent(etq_titulo_libro4)
                    .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(etq_titulo_libro5)
                    .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(campo_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(btn_agregar_libro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(Genero)
                    .addComponent(campo_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(opciones_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etq_titulo_libro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_autor_libro)
                .addGap(3, 3, 3)
                .addComponent(campo_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_genero_libro)
                .addGap(12, 12, 12)
                .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Genero)
                .addGap(4, 4, 4)
                .addComponent(opciones_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_titulo_libro5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo_libro4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_agregar_libro)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout crear_contenedorLayout = new javax.swing.GroupLayout(crear_contenedor);
        crear_contenedor.setLayout(crear_contenedorLayout);
        crear_contenedorLayout.setHorizontalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        crear_contenedorLayout.setVerticalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crear_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crear_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_tituloActionPerformed

    private void campo_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_autorActionPerformed

    private void campo_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_descripcionActionPerformed

    private void campo_valor_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_valor_prestamoActionPerformed
       
    }//GEN-LAST:event_campo_valor_prestamoActionPerformed

    private void btn_agregar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_libroActionPerformed
        String titulo = campo_titulo.getText();
        String autor = campo_autor.getText();
        String descripcion = campo_descripcion.getText();
        String genero = (String) opciones_genero.getSelectedItem();
        String cantidad_disponible = campo_cantidad_disponible.getText();
        String valor_prestamo = campo_valor_prestamo.getText();
        String estado = "Activo";
        
        
        boolean respuesta = this.basedatos.insertarLibro(titulo, autor, descripcion, genero, cantidad_disponible, valor_prestamo, estado);
        if (respuesta) {
            campo_titulo.setText("");
            campo_autor.setText("");
            campo_descripcion.setText("");
            campo_cantidad_disponible.setText("");
            campo_valor_prestamo.setText("");
            
            JOptionPane.showMessageDialog(null, "Libro registrado con exito!.");
        }
    }//GEN-LAST:event_btn_agregar_libroActionPerformed

    private void campo_cantidad_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidad_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidad_disponibleActionPerformed

    private void opciones_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opciones_generoActionPerformed
        String opcion_elegida = (String) opciones_genero.getSelectedItem();
        System.out.println("Opcion elegida: " + opcion_elegida);
    }//GEN-LAST:event_opciones_generoActionPerformed

    private void opciones_generoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_opciones_generoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_opciones_generoHierarchyChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genero;
    private javax.swing.JButton btn_agregar_libro;
    private javax.swing.JTextField campo_autor;
    private javax.swing.JTextField campo_cantidad_disponible;
    private javax.swing.JTextField campo_descripcion;
    private javax.swing.JTextField campo_titulo;
    private javax.swing.JTextField campo_valor_prestamo;
    private javax.swing.JPanel crear_contenedor;
    private javax.swing.JLabel etq_autor_libro;
    private javax.swing.JLabel etq_genero_libro;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo_libro;
    private javax.swing.JLabel etq_titulo_libro4;
    private javax.swing.JLabel etq_titulo_libro5;
    private javax.swing.JPanel formulario;
    private javax.swing.JComboBox<String> opciones_genero;
    // End of variables declaration//GEN-END:variables
}
