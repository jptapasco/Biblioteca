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
        genero_select = new javax.swing.JComboBox<>();

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("REGISTRAR LIBRO");
        etq_titulo.setOpaque(true);

        formulario.setBackground(new java.awt.Color(204, 204, 204));

        etq_titulo_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_titulo_libro.setText("Titulo");

        campo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        campo_titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_titulo.setToolTipText("");
        campo_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tituloActionPerformed(evt);
            }
        });

        etq_autor_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        etq_genero_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_genero_libro.setText("Descripcion");

        Genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Genero.setText("Genero"); // NOI18N

        etq_titulo_libro4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        etq_titulo_libro5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_titulo_libro5.setText("Cantidad disponible");

        campo_cantidad_disponible.setBackground(new java.awt.Color(255, 255, 255));
        campo_cantidad_disponible.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_cantidad_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidad_disponibleActionPerformed(evt);
            }
        });

        genero_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ficción", "Ciencia Ficción", "Romance", "Aventura", "Fantasía" }));
        genero_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero_selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_titulo_libro)
                            .addComponent(etq_autor_libro)
                            .addComponent(etq_genero_libro)
                            .addComponent(Genero))
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_titulo)
                                    .addComponent(campo_autor)
                                    .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(etq_titulo_libro5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addComponent(genero_select, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addComponent(etq_titulo_libro4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btn_agregar_libro)))
                .addGap(69, 69, 69))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_titulo_libro))
                .addGap(27, 27, 27)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_autor_libro))
                .addGap(22, 22, 22)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_genero_libro))
                .addGap(27, 27, 27)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero)
                    .addComponent(etq_titulo_libro5))
                .addGap(9, 9, 9)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero_select, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_titulo_libro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_valor_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout crear_contenedorLayout = new javax.swing.GroupLayout(crear_contenedor);
        crear_contenedor.setLayout(crear_contenedorLayout);
        crear_contenedorLayout.setHorizontalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        crear_contenedorLayout.setVerticalGroup(
            crear_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_agregar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_libroActionPerformed
            
            String titulo = campo_titulo.getText();
            String autor = campo_autor.getText();
            String descripcion = campo_descripcion.getText();
            String genero = (String) genero_select.getSelectedItem();
            String cantidad_disponible = campo_cantidad_disponible.getText();
            String valor_prestamo = campo_valor_prestamo.getText();
            
            if (!titulo.isEmpty()){
                boolean respuesta = this.basedatos.insertarLibro(titulo, autor, descripcion, genero, cantidad_disponible, valor_prestamo);
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
    }//GEN-LAST:event_btn_agregar_libroActionPerformed

    private void campo_cantidad_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidad_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidad_disponibleActionPerformed

    private void genero_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero_selectActionPerformed


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
    private javax.swing.JComboBox<String> genero_select;
    // End of variables declaration//GEN-END:variables
}
