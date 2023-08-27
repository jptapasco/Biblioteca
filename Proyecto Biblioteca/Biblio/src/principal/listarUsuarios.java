package principal;

import clases.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class listarUsuarios extends javax.swing.JPanel {
    
    DataBase basedatos;
    DefaultTableModel modelo;

    public listarUsuarios(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initModeloComponents();
        cargarListaUsuarios();
    }
    
    public void initModeloComponents(){
        modelo = (DefaultTableModel) tabla_usuarios.getModel();
    }
    
    public void cargarListaUsuarios(){
        ResultSet listado = this.basedatos.listaUsuarios();
        if (listado!=null) {
            try {
                modelo.setRowCount(0);
                do{
                    String id_usuario = listado.getString("id_usuario");
                    String cedula = listado.getString("cedula");
                    String rol = listado.getString("rol");
                    String nombre = listado.getString("nombre");
                    String apellido = listado.getString("apellido");
                    String telefono = listado.getString("telefono");
                    String direccion = listado.getString("direccion");
                    
                    Object[] temp = new Object[]{id_usuario, cedula, rol, nombre, apellido, telefono, direccion};
                    modelo.addRow(temp);
                }while( listado.next() );
            } catch (SQLException ex) {
                System.out.println("Error al extraer datos: "+ex.getMessage());
            }
        }else{
            System.out.println("LISTA VACIA");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        etq_titulo = new javax.swing.JLabel();

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cedula", "Rol", "Nombre", "Apellido", "Telefono", "Direccion"
            }
        ));
        tabla_usuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabla_usuariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("LISTA DE USUARIOS");
        etq_titulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_usuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabla_usuariosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_usuariosAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
