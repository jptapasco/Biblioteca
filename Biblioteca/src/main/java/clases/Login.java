package clases;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setTitle("Iniciar sesion");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/usuario.png"));
        imagen_login.setIcon(new ImageIcon(img.getScaledInstance(imagen_login.getWidth(), imagen_login.getHeight(), Image.SCALE_SMOOTH)));
        this.setIconImage(img);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen_login = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JTextField();
        Campo_contraseña = new javax.swing.JLabel();
        texto_contraseña = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagen_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        campo_nombre.setText("Nombre:");

        texto_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombreActionPerformed(evt);
            }
        });

        Campo_contraseña.setText("Contraseña:");

        texto_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_contraseñaActionPerformed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");

        btn_salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_contraseña)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(campo_nombre)
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(texto_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(texto_nombre)))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen_login, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imagen_login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre)
                    .addComponent(texto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_contraseña)
                    .addComponent(texto_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nombreActionPerformed

    private void texto_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_contraseñaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Campo_contraseña;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel campo_nombre;
    private javax.swing.JLabel imagen_login;
    private javax.swing.JPasswordField texto_contraseña;
    private javax.swing.JTextField texto_nombre;
    // End of variables declaration//GEN-END:variables
}
