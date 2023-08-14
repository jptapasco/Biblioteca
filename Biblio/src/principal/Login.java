package principal;

import clases.DataBase;
import java.awt.Image;
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
        etq_password = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        campo_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_usuario.setText("Username");

        campo_usuario.setText("erickvn");
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });

        etq_password.setText("Password");

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

        campo_password.setText("12345");
        campo_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_usuario)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_password)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ingresar)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(campo_password))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btn_ingresar)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String username = campo_usuario.getText();
        String password = campo_password.getText();
        
        if (username.equalsIgnoreCase("erick") && password.equalsIgnoreCase("12345")) {   
            MenuUsuarios usuarios = new MenuUsuarios(basedatos);
            dispose();   
            System.out.println("HAS INICIADO SESION");
        }else{
            System.out.println("DATOS INVALIDOS");
        }
        
        if (username.equalsIgnoreCase("erickvn") && password.equalsIgnoreCase("12345")) {   
            Menu admin = new Menu(basedatos);
            dispose();   
            System.out.println("HAS INICIADO SESION");
        }else{
            System.out.println("DATOS INVALIDOS");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void campo_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passwordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField campo_password;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_password;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_usuario;
    // End of variables declaration//GEN-END:variables
}
