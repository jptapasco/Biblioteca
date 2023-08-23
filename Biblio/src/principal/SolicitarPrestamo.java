
package principal;

import clases.DataBase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SolicitarPrestamo extends javax.swing.JPanel {

    DataBase basedatos;
    public SolicitarPrestamo(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_prestamos = new javax.swing.JLabel();
        etq_nombre_libro = new javax.swing.JLabel();
        campo_nombre_libro = new javax.swing.JTextField();
        campo_cantidad = new javax.swing.JTextField();
        campo_cedula = new javax.swing.JTextField();
        btn_solicitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etq_fecha = new javax.swing.JLabel();
        campo_fecha = new javax.swing.JTextField();

        etq_prestamos.setBackground(new java.awt.Color(255, 255, 255));
        etq_prestamos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etq_prestamos.setForeground(new java.awt.Color(0, 0, 0));
        etq_prestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_prestamos.setText("Prestamos");

        etq_nombre_libro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_nombre_libro.setText("Nombre del libro");

        campo_nombre_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombre_libroActionPerformed(evt);
            }
        });

        campo_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidadActionPerformed(evt);
            }
        });

        campo_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cedulaActionPerformed(evt);
            }
        });

        btn_solicitar.setText("Solicitar prestamo");
        btn_solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicitarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("¡Despierta tu imaginación! Alquila un ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("libro y sumérgete en aventuras");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("inolvidables mientras exploras nuevos");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("mundos y perspectivas. Tu proxima");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("gran historia te espera...");

        jLabel7.setText("Cedula");

        jLabel8.setText("Cantidad");

        etq_fecha.setText("Fecha de devolucion año-mes-dia");

        campo_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_fecha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_nombre_libro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(btn_solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(campo_fecha)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_fecha)
                    .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addComponent(btn_solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombre_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombre_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombre_libroActionPerformed

    private void campo_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidadActionPerformed

    private void campo_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cedulaActionPerformed

    private void btn_solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitarActionPerformed
        String nombre_libro = campo_nombre_libro.getText();
        String cedula_cliente = campo_cedula.getText();
        String fecha_devolucion = campo_fecha.getText(); // Asumiendo que fecha_devolucion es un String en formato "yyyy-MM-dd"
        String cantidad_llevada = campo_cantidad.getText();
        int cantidadLlevada = Integer.parseInt(cantidad_llevada);
        String estado = "Pendiente";

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha_devolucionDate = dateFormat.parse(fecha_devolucion);

            boolean respuesta = this.basedatos.solicitarPrestamo(cedula_cliente, nombre_libro, fecha_devolucionDate, cantidadLlevada, estado);
            if(respuesta){
                campo_nombre_libro.setText("");
                campo_cedula.setText("");
                campo_fecha.setText("");
                campo_cantidad.setText("");
            }
        } catch (ParseException ex) {
            System.out.println("Error al parsear la fecha: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_solicitarActionPerformed

    private void campo_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_fechaActionPerformed

    }//GEN-LAST:event_campo_fechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_solicitar;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_nombre_libro;
    private javax.swing.JLabel etq_fecha;
    private javax.swing.JLabel etq_nombre_libro;
    private javax.swing.JLabel etq_prestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
