package principal;

import clases.DataBase;

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
        campo_genero = new javax.swing.JTextField();
        etq_genero_libro = new javax.swing.JLabel();
        campo_anio = new javax.swing.JTextField();
        etq_año_libro = new javax.swing.JLabel();
        etq_titulo_libro4 = new javax.swing.JLabel();
        campo_isbn = new javax.swing.JTextField();
        btn_agregar_libro = new javax.swing.JButton();

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

        campo_genero.setBackground(new java.awt.Color(255, 255, 255));
        campo_genero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_generoActionPerformed(evt);
            }
        });

        etq_genero_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_genero_libro.setText("Genero");

        campo_anio.setBackground(new java.awt.Color(255, 255, 255));
        campo_anio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_anioActionPerformed(evt);
            }
        });

        etq_año_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_año_libro.setText("Año Publicacion"); // NOI18N

        etq_titulo_libro4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_titulo_libro4.setText("Isbn");

        campo_isbn.setBackground(new java.awt.Color(255, 255, 255));
        campo_isbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_isbnActionPerformed(evt);
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

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_autor_libro)
                    .addComponent(etq_genero_libro)
                    .addComponent(campo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_año_libro)
                    .addComponent(etq_titulo_libro)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_titulo_libro4)
                            .addComponent(campo_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(campo_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btn_agregar_libro)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_genero_libro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(etq_año_libro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_titulo_libro4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_agregar_libro)
                .addContainerGap(150, Short.MAX_VALUE))
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

    private void campo_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_generoActionPerformed

    private void campo_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_anioActionPerformed

    private void campo_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_isbnActionPerformed
       
    }//GEN-LAST:event_campo_isbnActionPerformed

    private void btn_agregar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_libroActionPerformed
        String titulo = campo_titulo.getText();
        String autor = campo_autor.getText();
        String genero = campo_genero.getText();
        String anio = campo_anio.getText();
        String isbn = campo_isbn.getText();
        
        boolean respuesta = this.basedatos.insertarLibro(titulo, autor, genero, anio, isbn);
        if (respuesta) {
            campo_titulo.setText("");
            campo_autor.setText("");
            campo_genero.setText("");
            campo_anio.setText("");
            campo_isbn.setText("");

        }
    }//GEN-LAST:event_btn_agregar_libroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_libro;
    private javax.swing.JTextField campo_anio;
    private javax.swing.JTextField campo_autor;
    private javax.swing.JTextField campo_genero;
    private javax.swing.JTextField campo_isbn;
    private javax.swing.JTextField campo_titulo;
    private javax.swing.JPanel crear_contenedor;
    private javax.swing.JLabel etq_autor_libro;
    private javax.swing.JLabel etq_año_libro;
    private javax.swing.JLabel etq_genero_libro;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_titulo_libro;
    private javax.swing.JLabel etq_titulo_libro4;
    private javax.swing.JPanel formulario;
    // End of variables declaration//GEN-END:variables
}
