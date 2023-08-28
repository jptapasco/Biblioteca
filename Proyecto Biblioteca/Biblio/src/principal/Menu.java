package principal;

import clases.DataBase;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    
    DataBase basedatos;
    DefaultTableModel modelo;
    
    public Menu(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initComponentsAltern();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panel_contenedor = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        etq_libros = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        etq_usuarios = new javax.swing.JLabel();
        btn_registrar_user = new javax.swing.JButton();
        btn_lista_clientes = new javax.swing.JButton();
        panel_contenedor2 = new javax.swing.JPanel();
        etq_imagen = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_prestamo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        label_titulo.setBackground(new java.awt.Color(0, 153, 204));
        label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(0, 0, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Menú");
        label_titulo.setOpaque(true);

        etq_libros.setText("LIBROS:");

        btn_registrar.setBackground(new java.awt.Color(102, 204, 255));
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registrar Libro");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_listar.setBackground(new java.awt.Color(102, 204, 255));
        btn_listar.setForeground(new java.awt.Color(0, 0, 0));
        btn_listar.setText("Ver Lista. Libros");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        etq_usuarios.setText("USUARIOS:");

        btn_registrar_user.setBackground(new java.awt.Color(102, 204, 255));
        btn_registrar_user.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar_user.setText("Registrar Usuario");
        btn_registrar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_userActionPerformed(evt);
            }
        });

        btn_lista_clientes.setBackground(new java.awt.Color(102, 204, 255));
        btn_lista_clientes.setForeground(new java.awt.Color(0, 0, 0));
        btn_lista_clientes.setText("Ver Lista. Clientes");
        btn_lista_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lista_clientesActionPerformed(evt);
            }
        });

        panel_contenedor2.setPreferredSize(new java.awt.Dimension(430, 0));

        javax.swing.GroupLayout panel_contenedor2Layout = new javax.swing.GroupLayout(panel_contenedor2);
        panel_contenedor2.setLayout(panel_contenedor2Layout);
        panel_contenedor2Layout.setHorizontalGroup(
            panel_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
        panel_contenedor2Layout.setVerticalGroup(
            panel_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_salir.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_prestamo.setBackground(new java.awt.Color(102, 204, 255));
        btn_prestamo.setForeground(new java.awt.Color(0, 0, 0));
        btn_prestamo.setText("Solicitud Prestamo");
        btn_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_contenedorLayout = new javax.swing.GroupLayout(panel_contenedor);
        panel_contenedor.setLayout(panel_contenedorLayout);
        panel_contenedorLayout.setHorizontalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_libros)
                    .addComponent(etq_usuarios)
                    .addComponent(btn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lista_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir)
                    .addComponent(btn_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panel_contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_contenedorLayout.setVerticalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(etq_libros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_listar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_registrar)
                        .addGap(19, 19, 19)
                        .addComponent(etq_usuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_registrar_user)
                        .addGap(18, 18, 18)
                        .addComponent(btn_lista_clientes)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(16, 16, 16))
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addComponent(panel_contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        panel_contenedor2.removeAll();
        
        InsertarLibros temporal = new InsertarLibros(basedatos);
        temporal.setSize( panel_contenedor2.getSize() );
        panel_contenedor2.add( temporal );
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        panel_contenedor2.removeAll();
        
        listarLibros contentTemporal = new listarLibros( basedatos );
        contentTemporal.setSize(panel_contenedor2.getSize() );
        panel_contenedor2.add( contentTemporal );
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_registrar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_userActionPerformed
        panel_contenedor2.removeAll();
        
        RegistrarUsuario contentTemporal = new RegistrarUsuario(basedatos);
        contentTemporal.setSize(panel_contenedor2.getSize() );
        panel_contenedor2.add( contentTemporal );
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_registrar_userActionPerformed

    private void btn_lista_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lista_clientesActionPerformed
        panel_contenedor2.removeAll();
        
        listarUsuarios contentTemporal = new listarUsuarios(basedatos);
        contentTemporal.setSize(panel_contenedor2.getSize() );
        panel_contenedor2.add( contentTemporal );
        
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_lista_clientesActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_prestamos_solicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitudActionPerformed

    }//GEN-LAST:event_btn_solicitudActionPerformed

    private void btn_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamoActionPerformed
        panel_contenedor2.removeAll();

        PrestamosSolicitados contentTemporal = new PrestamosSolicitados(basedatos);
        contentTemporal.setSize(panel_contenedor2.getSize() );
        panel_contenedor2.add( contentTemporal );

        repaint();
        revalidate();
    }//GEN-LAST:event_btn_prestamoActionPerformed

    private void initComponentsAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu");
        
        Image img_menu = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/biblioteca_menu.png"));
        img_menu = img_menu.getScaledInstance(664, 533, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(img_menu));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lista_clientes;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_prestamo;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar_user;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_libros;
    private javax.swing.JLabel etq_usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_contenedor2;
    // End of variables declaration//GEN-END:variables


}