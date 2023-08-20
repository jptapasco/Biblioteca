package principal;

import clases.DataBase;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class MenuUsuarios extends javax.swing.JFrame {
    
    DataBase basedatos;
    DefaultTableModel model;
    
    public MenuUsuarios(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu Usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarios_contenedor = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        btn_libros_disponibles = new javax.swing.JButton();
        btn_solicitar_prestamo = new javax.swing.JButton();
        btn_ver_prestamos = new javax.swing.JButton();
        btn_editar_datos = new javax.swing.JButton();
        btn_pagar_multas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel_vista1 = new javax.swing.JPanel();
        etq_principal_titulo = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        etq_imagen_biblio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        usuarios_contenedor.setBackground(new java.awt.Color(204, 204, 204));
        usuarios_contenedor.setPreferredSize(new java.awt.Dimension(840, 605));

        etq_titulo.setBackground(new java.awt.Color(0, 0, 0));
        etq_titulo.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(153, 153, 153));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("MENU USUARIOS");
        etq_titulo.setToolTipText("");
        etq_titulo.setOpaque(true);

        btn_libros_disponibles.setBackground(new java.awt.Color(0, 0, 0));
        btn_libros_disponibles.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_libros_disponibles.setForeground(new java.awt.Color(153, 153, 153));
        btn_libros_disponibles.setText("Libros Disponibles");
        btn_libros_disponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_libros_disponiblesActionPerformed(evt);
            }
        });

        btn_solicitar_prestamo.setBackground(new java.awt.Color(0, 0, 0));
        btn_solicitar_prestamo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_solicitar_prestamo.setForeground(new java.awt.Color(153, 153, 153));
        btn_solicitar_prestamo.setText("Solicitar Prestamo");
        btn_solicitar_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicitar_prestamoActionPerformed(evt);
            }
        });

        btn_ver_prestamos.setBackground(new java.awt.Color(0, 0, 0));
        btn_ver_prestamos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_ver_prestamos.setForeground(new java.awt.Color(153, 153, 153));
        btn_ver_prestamos.setText("Ver Prestamos");
        btn_ver_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_prestamosActionPerformed(evt);
            }
        });

        btn_editar_datos.setBackground(new java.awt.Color(0, 0, 0));
        btn_editar_datos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_editar_datos.setForeground(new java.awt.Color(153, 153, 153));
        btn_editar_datos.setText("Editar Datos");
        btn_editar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_datosActionPerformed(evt);
            }
        });

        btn_pagar_multas.setBackground(new java.awt.Color(0, 0, 0));
        btn_pagar_multas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_pagar_multas.setForeground(new java.awt.Color(153, 153, 153));
        btn_pagar_multas.setText("Pagar Multas");
        btn_pagar_multas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagar_multasActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setForeground(new java.awt.Color(255, 255, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido");

        panel_vista1.setBackground(new java.awt.Color(255, 255, 255));
        panel_vista1.setForeground(new java.awt.Color(255, 255, 255));

        etq_principal_titulo.setBackground(new java.awt.Color(0, 0, 0));
        etq_principal_titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_principal_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_principal_titulo.setText("BIBLIOTECAS JP-EV");

        p1.setBackground(new java.awt.Color(0, 0, 0));
        p1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 0, 0));
        p1.setText("¡Explora un mundo de conocimiento desde la comodidad de tu dispositivo! Nuestra innovadora ");

        p2.setBackground(new java.awt.Color(0, 0, 0));
        p2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p2.setForeground(new java.awt.Color(0, 0, 0));
        p2.setText("biblioteca virtual te sumerge en una experiencia de lectura única, donde cada página cobra");

        p3.setBackground(new java.awt.Color(0, 0, 0));
        p3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p3.setForeground(new java.awt.Color(0, 0, 0));
        p3.setText("vida. Descubre historias cautivadoras, adéntrate en emocionantes aventuras y sumérgete en el ");

        p4.setBackground(new java.awt.Color(0, 0, 0));
        p4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p4.setForeground(new java.awt.Color(0, 0, 0));
        p4.setText("saber de autores renombrados. Con una amplia gama de géneros y títulos, encontrarás algo ");

        p5.setBackground(new java.awt.Color(0, 0, 0));
        p5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p5.setForeground(new java.awt.Color(0, 0, 0));
        p5.setText("para cada estado de ánimo y cada interés. ");

        etq_imagen_biblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_biblio.png"))); // NOI18N

        javax.swing.GroupLayout panel_vista1Layout = new javax.swing.GroupLayout(panel_vista1);
        panel_vista1.setLayout(panel_vista1Layout);
        panel_vista1Layout.setHorizontalGroup(
            panel_vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vista1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_principal_titulo)
                .addGap(253, 253, 253))
            .addGroup(panel_vista1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_vista1Layout.createSequentialGroup()
                        .addGroup(panel_vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_imagen_biblio)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_vista1Layout.setVerticalGroup(
            panel_vista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vista1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_principal_titulo)
                .addGap(26, 26, 26)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(etq_imagen_biblio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout usuarios_contenedorLayout = new javax.swing.GroupLayout(usuarios_contenedor);
        usuarios_contenedor.setLayout(usuarios_contenedorLayout);
        usuarios_contenedorLayout.setHorizontalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_libros_disponibles)
                            .addComponent(btn_solicitar_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ver_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pagar_multas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_vista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        usuarios_contenedorLayout.setVerticalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(btn_libros_disponibles)
                        .addGap(32, 32, 32)
                        .addComponent(btn_solicitar_prestamo)
                        .addGap(29, 29, 29)
                        .addComponent(btn_ver_prestamos)
                        .addGap(28, 28, 28)
                        .addComponent(btn_editar_datos)
                        .addGap(32, 32, 32)
                        .addComponent(btn_pagar_multas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addContainerGap())
                    .addComponent(panel_vista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuarios_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuarios_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_libros_disponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_libros_disponiblesActionPerformed
        panel_vista1.removeAll();
        
        listarLibros contentTemporal = new listarLibros( basedatos );
        contentTemporal.setSize(panel_vista1.getSize());
        panel_vista1.add( contentTemporal );
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_libros_disponiblesActionPerformed

    private void btn_ver_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_prestamosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ver_prestamosActionPerformed

    private void btn_editar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editar_datosActionPerformed

    private void btn_pagar_multasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagar_multasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pagar_multasActionPerformed

    private void btn_solicitar_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitar_prestamoActionPerformed
        panel_vista1.removeAll();
        
        SolicitarPrestamo contentTemporal = new SolicitarPrestamo(basedatos);
        contentTemporal.setSize(panel_vista1.getSize());
        panel_vista1.add(contentTemporal);
        
        repaint();
        revalidate();
        
    }//GEN-LAST:event_btn_solicitar_prestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar_datos;
    private javax.swing.JButton btn_libros_disponibles;
    private javax.swing.JButton btn_pagar_multas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_solicitar_prestamo;
    private javax.swing.JButton btn_ver_prestamos;
    private javax.swing.JLabel etq_imagen_biblio;
    private javax.swing.JLabel etq_principal_titulo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JPanel panel_vista1;
    private javax.swing.JPanel usuarios_contenedor;
    // End of variables declaration//GEN-END:variables
}
