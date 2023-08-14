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
        panel_contenedor_2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout panel_contenedor_2Layout = new javax.swing.GroupLayout(panel_contenedor_2);
        panel_contenedor_2.setLayout(panel_contenedor_2Layout);
        panel_contenedor_2Layout.setHorizontalGroup(
            panel_contenedor_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        panel_contenedor_2Layout.setVerticalGroup(
            panel_contenedor_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout usuarios_contenedorLayout = new javax.swing.GroupLayout(usuarios_contenedor);
        usuarios_contenedor.setLayout(usuarios_contenedorLayout);
        usuarios_contenedorLayout.setHorizontalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_pagar_multas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_ver_prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_libros_disponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_solicitar_prestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(panel_contenedor_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usuarios_contenedorLayout.setVerticalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(btn_libros_disponibles)
                        .addGap(42, 42, 42)
                        .addComponent(btn_solicitar_prestamo)
                        .addGap(45, 45, 45)
                        .addComponent(btn_ver_prestamos)
                        .addGap(52, 52, 52)
                        .addComponent(btn_editar_datos)
                        .addGap(46, 46, 46)
                        .addComponent(btn_pagar_multas)
                        .addGap(91, 91, 91)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuarios_contenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_contenedor_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuarios_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuarios_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_libros_disponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_libros_disponiblesActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_solicitar_prestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar_datos;
    private javax.swing.JButton btn_libros_disponibles;
    private javax.swing.JButton btn_pagar_multas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_solicitar_prestamo;
    private javax.swing.JButton btn_ver_prestamos;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_contenedor_2;
    private javax.swing.JPanel usuarios_contenedor;
    // End of variables declaration//GEN-END:variables
}
