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
        cargarListaLibros();
    }

    public void initModeloComponents(){
        modelo = (DefaultTableModel) tabla_libros.getModel();
    }
    
    public void cargarListaLibros(){
        ResultSet listado = this.basedatos.listaLibros();
        if (listado!=null) {
            try {
                modelo.setRowCount(0);
                do{
                    String id_libro = listado.getString("id_libro");
                    String titulo = listado.getString("titulo");
                    String autor = listado.getString("autor");
                    String descripcion = listado.getString("descripcion");
                    String genero = listado.getString("genero");
                    String cantidad = listado.getString("cantidad_disponible");
                    String valor = listado.getString("valor_prestamo");
                    String estado = listado.getString("estado_calculado");
                    
                    Object[] temp = new Object[]{id_libro, titulo, autor, descripcion, genero, cantidad, valor, estado};
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

        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();

        etq_titulo.setBackground(new java.awt.Color(255, 255, 255));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("LISTA DE LIBROS");
        etq_titulo.setOpaque(true);

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Descripcion", "Genero", "Cantidad Disponible", "Valor Prestamo", "Estado"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_librosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabla_librosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_librosAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}
