package principal;

import clases.DataBase;
import javax.swing.JLabel;
import javax.swing.JTextField;
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

        panel_contenedor = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        etq_libros = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        etq_usuarios = new javax.swing.JLabel();
        btn_registrar_usuarios = new javax.swing.JButton();
        btn_lista_clientes = new javax.swing.JButton();
        panel_contenedor2 = new javax.swing.JPanel();
        panel_resumen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        label_titulo.setBackground(new java.awt.Color(0, 153, 204));
        label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(0, 0, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Menú");
        label_titulo.setOpaque(true);

        buscador.setText("buscar");
        buscador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

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

        btn_registrar_usuarios.setBackground(new java.awt.Color(102, 204, 255));
        btn_registrar_usuarios.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar_usuarios.setText("Registrar Usuario");
        btn_registrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_usuariosActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Bibliotecas JP.CK");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("En este espacio en línea, las páginas toman la forma de píxeles");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("y los mundos de la imaginación se despliegan en la pantalla. ");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Nuestra Biblioteca Virtual es un oasis digital de conocimiento");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("donde las fronteras entre las palabras y los clics se difuminan ");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("para crear una experiencia de lectura y aprendizaje única.  ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_parrafos.jpg"))); // NOI18N

        javax.swing.GroupLayout panel_resumenLayout = new javax.swing.GroupLayout(panel_resumen);
        panel_resumen.setLayout(panel_resumenLayout);
        panel_resumenLayout.setHorizontalGroup(
            panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resumenLayout.createSequentialGroup()
                .addGroup(panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_resumenLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel2))
                    .addGroup(panel_resumenLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_resumenLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_resumenLayout.setVerticalGroup(
            panel_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_contenedor2Layout = new javax.swing.GroupLayout(panel_contenedor2);
        panel_contenedor2.setLayout(panel_contenedor2Layout);
        panel_contenedor2Layout.setHorizontalGroup(
            panel_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_contenedor2Layout.setVerticalGroup(
            panel_contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor2Layout.createSequentialGroup()
                .addComponent(panel_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_salir.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_contenedorLayout = new javax.swing.GroupLayout(panel_contenedor);
        panel_contenedor.setLayout(panel_contenedorLayout);
        panel_contenedorLayout.setHorizontalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etq_libros)
                            .addComponent(etq_usuarios)
                            .addComponent(buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btn_salir)
                            .addComponent(btn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lista_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_contenedorLayout.setVerticalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_libros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_listar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_registrar)
                        .addGap(19, 19, 19)
                        .addComponent(etq_usuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_registrar_usuarios)
                        .addGap(18, 18, 18)
                        .addComponent(btn_lista_clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(16, 16, 16))))
        );

        buscador.getAccessibleContext().setAccessibleName("");
        buscador.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed

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

    private void btn_registrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_usuariosActionPerformed
        
    }//GEN-LAST:event_btn_registrar_usuariosActionPerformed

    private void btn_lista_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lista_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lista_clientesActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose(); 
    }//GEN-LAST:event_btn_salirActionPerformed
    
    
    private void initComponentsAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lista_clientes;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar_usuarios;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField buscador;
    private javax.swing.JLabel etq_libros;
    private javax.swing.JLabel etq_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_contenedor2;
    private javax.swing.JPanel panel_resumen;
    // End of variables declaration//GEN-END:variables

}
