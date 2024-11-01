package principal;

import clases.DataBase;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class editarLibro extends javax.swing.JPanel {

    DataBase basedatos;
    String id_libro;
    public editarLibro(DataBase basedatos, String id) {
        this.basedatos = basedatos;  
        this.id_libro = id;
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
        btn_editar_libro = new javax.swing.JButton();
        etq_titulo_libro5 = new javax.swing.JLabel();
        campo_cantidad_disponible = new javax.swing.JTextField();
        genero_select = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(615, 482));

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("EDITAR LIBRO");
        etq_titulo.setOpaque(true);

        formulario.setBackground(new java.awt.Color(204, 204, 204));

        etq_titulo_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro.setText("Nuevo Titulo");

        campo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        campo_titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_titulo.setToolTipText("");
        campo_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tituloActionPerformed(evt);
            }
        });

        etq_autor_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_autor_libro.setText("Nuevo Autor");

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
        etq_genero_libro.setText("Nueva Descripcion");

        Genero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Genero.setText("Nuevo Genero"); // NOI18N

        etq_titulo_libro4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro4.setText("Nuevo Valor prestamo");

        campo_valor_prestamo.setBackground(new java.awt.Color(255, 255, 255));
        campo_valor_prestamo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_valor_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_valor_prestamoActionPerformed(evt);
            }
        });

        btn_editar_libro.setBackground(new java.awt.Color(102, 204, 255));
        btn_editar_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_editar_libro.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar_libro.setText("EDITAR");
        btn_editar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_libroActionPerformed(evt);
            }
        });

        etq_titulo_libro5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro5.setText("Nueva Cantidad disponible");

        campo_cantidad_disponible.setBackground(new java.awt.Color(255, 255, 255));
        campo_cantidad_disponible.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_cantidad_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidad_disponibleActionPerformed(evt);
            }
        });

        genero_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ficción", "Ciencia Ficción", "Poesia", "Aventura", "Fantasía" }));
        genero_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero_selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_autor_libro)
                    .addComponent(etq_genero_libro)
                    .addComponent(etq_titulo_libro)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_titulo_libro4)
                            .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_titulo_libro5)
                            .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(campo_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editar_libro))
                    .addComponent(campo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioLayout.createSequentialGroup()
                            .addComponent(Genero)
                            .addGap(68, 68, 68)
                            .addComponent(genero_select, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(180, 180, 180))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_genero_libro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero)
                    .addComponent(genero_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etq_titulo_libro5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo_libro4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar_libro)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout crear_contenedorLayout = new javax.swing.GroupLayout(crear_contenedor);
        crear_contenedor.setLayout(crear_contenedorLayout);
        crear_contenedorLayout.setHorizontalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addComponent(formulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        crear_contenedorLayout.setVerticalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 437, Short.MAX_VALUE))
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

    }//GEN-LAST:event_campo_tituloActionPerformed

    private void campo_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_autorActionPerformed

    private void campo_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_descripcionActionPerformed

    private void campo_valor_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_valor_prestamoActionPerformed

    }//GEN-LAST:event_campo_valor_prestamoActionPerformed

    public void cargarDatos(){
        ResultSet listado = this.basedatos.consultarDatosById(id_libro);
        if (listado!=null) {
            try {
                String id_libro = listado.getString("id_libro");
                String titulo = listado.getString("titulo");
                String autor = listado.getString("autor");
                String descripcion = listado.getString("descripcion");
                String genero = listado.getString("genero");
                String cantidad = listado.getString("cantidad_disponible");
                String valor = listado.getString("valor_prestamo");
                String estado = listado.getString("estado_calculado");

                campo_titulo.setText(titulo);
                campo_autor.setText(autor);
                campo_descripcion.setText(descripcion);
                genero_select.addItem(genero);
                campo_cantidad_disponible.setText(cantidad);
                campo_valor_prestamo.setText(valor);
                
            } catch (SQLException ex) {
                System.out.println("Error al extraer datos: "+ex.getMessage());
            }
        }else{
            System.out.println("LISTA VACIA");
        }
        
    }
    
    private void btn_editar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_libroActionPerformed

        String titulo = campo_titulo.getText();
        String autor = campo_autor.getText();
        String descripcion = campo_descripcion.getText();
        String genero = (String) genero_select.getSelectedItem();
        String cantidad_disponible = campo_cantidad_disponible.getText();
        String valor_prestamo = campo_valor_prestamo.getText();

        if (!titulo.isEmpty()){
            boolean respuesta = this.basedatos.actualizarLibro(id_libro, titulo, autor, descripcion, genero, cantidad_disponible, valor_prestamo);
            if (respuesta) {
                campo_titulo.setText("");
                campo_autor.setText("");
                campo_descripcion.setText("");
                campo_cantidad_disponible.setText("");
                campo_valor_prestamo.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Faltan campos por llenar");
        }
    }//GEN-LAST:event_btn_editar_libroActionPerformed

    private void campo_cantidad_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidad_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidad_disponibleActionPerformed

    private void genero_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero_selectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genero;
    private javax.swing.JButton btn_editar_libro;
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
    private javax.swing.JComboBox<String> genero_select;
    // End of variables declaration//GEN-END:variables
}
