package principal;

import clases.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class listarLibros extends javax.swing.JPanel {

    DataBase basedatos;
    DefaultTableModel modelo;
    
    public listarLibros(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initModeloComponents();
        cargarListaPersonas();
    }

    public void initModeloComponents(){
        modelo = (DefaultTableModel) tabla_libros.getModel();
    }
    
    public void cargarListaPersonas(){
        ResultSet listado = this.basedatos.listarLibros();
        
        if (listado!=null) {
            try {
                modelo.setRowCount(0);
                do{
                    String id_libro = listado.getString("id_libro");
                    String titulo = listado.getString("titulo");
                    String autor = listado.getString("autor");
                    String descripcion = listado.getString("descripcion");
                    String genero = listado.getString("genero");
                    String cantidad_disponible = listado.getString("cantidad_disponible");
                    String valor_prestamo = listado.getString("valor_prestamo");
                    String estado = listado.getString("estado");
                    
                    int intValue = Integer.parseInt(cantidad_disponible);
                    if (intValue < 1) {
                        estado = "Agotado";
                        System.out.println("Agotado");
                    }
                    
                    Object[] temp = new Object[]{id_libro, titulo, autor,descripcion, genero ,cantidad_disponible,valor_prestamo,estado};
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

        panel_contenedor3 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();

        panel_contenedor3.setPreferredSize(new java.awt.Dimension(430, 0));

        etq_titulo.setBackground(new java.awt.Color(204, 204, 204));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("LISTA DE LIBROS");
        etq_titulo.setOpaque(true);

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Descripcion", "Genero", "Cantidad disponible", "Valor prestamo", "Estado"
            }
        ));
        tabla_libros.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabla_librosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabla_libros);

        javax.swing.GroupLayout panel_contenedor3Layout = new javax.swing.GroupLayout(panel_contenedor3);
        panel_contenedor3.setLayout(panel_contenedor3Layout);
        panel_contenedor3Layout.setHorizontalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor3Layout.createSequentialGroup()
                .addGroup(panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_contenedor3Layout.setVerticalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor3Layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_librosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabla_librosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_librosAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor3;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}
