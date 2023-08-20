package principal;

import clases.DataBase;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    DataBase basedatos;
    public Login() {
        this.basedatos = new DataBase();
        initComponents();
        initComponentsAltern();
    }
    
    private void initComponentsAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        
        Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_login.png"));
        img_candado = img_candado.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(img_candado));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_imagen = new javax.swing.JLabel();
        etq_usuario = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        etq_contraseña = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        campo_contraseña = new javax.swing.JPasswordField();
        tipo_user = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_usuario.setText("Usuario");

        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });

        etq_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_contraseña.setText("Contraseña");

        btn_ingresar.setBackground(new java.awt.Color(0, 153, 204));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        etq_titulo.setBackground(new java.awt.Color(0, 153, 204));
        etq_titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("INICIAR SESION");
        etq_titulo.setOpaque(true);

        campo_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_contraseñaActionPerformed(evt);
            }
        });

        tipo_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bibliotecario", "Cliente" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_usuario)
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ingresar)
                .addGap(208, 208, 208))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_contraseña)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_contraseña)
                        .addGap(50, 50, 50))
                    .addComponent(campo_usuario)
                    .addComponent(tipo_user, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_ingresar)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String usuario = campo_usuario.getText();
        String contraseña = campo_contraseña.getText();
        String tipo_usuario = (String) tipo_user.getSelectedItem();
        
        ResultSet listado = this.basedatos.ingresarSistema(contraseña, tipo_usuario, usuario);
        if(listado != null){
            try {
                String rol_a = listado.getString("rol");
                String bibliote = "Bibliotecario";
                String clien = "Cliente";

                if(rol_a.equalsIgnoreCase(bibliote)){
                    Menu menu_bibliotecario = new Menu(basedatos);
                    dispose();
                } else if(rol_a.equalsIgnoreCase(clien)){
                    MenuUsuarios menu_usuario = new MenuUsuarios(basedatos);
                    dispose();
                }
            } catch (SQLException ex) {
                System.out.println("No existes mai: "+ex.getMessage());
            }
        } else{
            System.out.println("Mano no hay nada en esa lista");
        }

        

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void campo_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_contraseñaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField campo_contraseña;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel etq_contraseña;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_usuario;
    private javax.swing.JComboBox<String> tipo_user;
    // End of variables declaration//GEN-END:variables
}
