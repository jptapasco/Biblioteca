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
        
        Image img_menu = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/biblioteca_menu.png"));
        img_menu = img_menu.getScaledInstance(613, 475, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(img_menu));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarios_contenedor = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        campo_buscador = new javax.swing.JTextField();
        btn_disponibles = new javax.swing.JButton();
        btn_prestamo = new javax.swing.JButton();
        btn_ver_prestamos = new javax.swing.JButton();
        btn_editar_datos = new javax.swing.JButton();
        btn_pagar_multas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        usuarios_contenedor2 = new javax.swing.JPanel();
        etq_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setPreferredSize(new java.awt.Dimension(840, 605));

        usuarios_contenedor.setBackground(new java.awt.Color(204, 204, 204));
        usuarios_contenedor.setPreferredSize(new java.awt.Dimension(840, 605));

        etq_titulo.setBackground(new java.awt.Color(0, 0, 0));
        etq_titulo.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(153, 153, 153));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("MENU USUARIOS");
        etq_titulo.setToolTipText("");
        etq_titulo.setOpaque(true);

        campo_buscador.setBackground(new java.awt.Color(232, 228, 228));
        campo_buscador.setOpaque(true);

        btn_disponibles.setBackground(new java.awt.Color(0, 0, 0));
        btn_disponibles.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_disponibles.setForeground(new java.awt.Color(153, 153, 153));
        btn_disponibles.setText("Libros Disponibles");

        btn_prestamo.setBackground(new java.awt.Color(0, 0, 0));
        btn_prestamo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_prestamo.setForeground(new java.awt.Color(153, 153, 153));
        btn_prestamo.setText("Solicitar Prestamo");

        btn_ver_prestamos.setBackground(new java.awt.Color(0, 0, 0));
        btn_ver_prestamos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_ver_prestamos.setForeground(new java.awt.Color(153, 153, 153));
        btn_ver_prestamos.setText("Ver Prestamos");

        btn_editar_datos.setBackground(new java.awt.Color(0, 0, 0));
        btn_editar_datos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_editar_datos.setForeground(new java.awt.Color(153, 153, 153));
        btn_editar_datos.setText("Editar Datos");

        btn_pagar_multas.setBackground(new java.awt.Color(0, 0, 0));
        btn_pagar_multas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        btn_pagar_multas.setForeground(new java.awt.Color(153, 153, 153));
        btn_pagar_multas.setText("Pagar Multas");

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setForeground(new java.awt.Color(255, 255, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        usuarios_contenedor2.setBackground(new java.awt.Color(0, 204, 102));

        etq_imagen.setBackground(new java.awt.Color(0, 0, 0));
        etq_imagen.setOpaque(true);

        javax.swing.GroupLayout usuarios_contenedor2Layout = new javax.swing.GroupLayout(usuarios_contenedor2);
        usuarios_contenedor2.setLayout(usuarios_contenedor2Layout);
        usuarios_contenedor2Layout.setHorizontalGroup(
            usuarios_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        usuarios_contenedor2Layout.setVerticalGroup(
            usuarios_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout usuarios_contenedorLayout = new javax.swing.GroupLayout(usuarios_contenedor);
        usuarios_contenedor.setLayout(usuarios_contenedorLayout);
        usuarios_contenedorLayout.setHorizontalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_disponibles)
                        .addComponent(campo_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ver_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_pagar_multas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarios_contenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        usuarios_contenedorLayout.setVerticalGroup(
            usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(usuarios_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(usuarios_contenedorLayout.createSequentialGroup()
                        .addComponent(campo_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_disponibles)
                        .addGap(41, 41, 41)
                        .addComponent(btn_prestamo)
                        .addGap(37, 37, 37)
                        .addComponent(btn_ver_prestamos)
                        .addGap(45, 45, 45)
                        .addComponent(btn_editar_datos)
                        .addGap(39, 39, 39)
                        .addComponent(btn_pagar_multas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usuarios_contenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarios_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuarios_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_disponibles;
    private javax.swing.JButton btn_editar_datos;
    private javax.swing.JButton btn_pagar_multas;
    private javax.swing.JButton btn_prestamo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ver_prestamos;
    private javax.swing.JTextField campo_buscador;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel usuarios_contenedor;
    private javax.swing.JPanel usuarios_contenedor2;
    // End of variables declaration//GEN-END:variables
}
