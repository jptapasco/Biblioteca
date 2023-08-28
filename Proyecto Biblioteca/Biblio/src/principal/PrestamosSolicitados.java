package principal;

import clases.DataBase;
import clases.RenderTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PrestamosSolicitados extends javax.swing.JPanel {

    DataBase basedatos;
    DefaultTableModel modelo;
    
    public PrestamosSolicitados(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initModeloComponents();
        cargarPrestamos();
    }
    
    public void initModeloComponents(){
        modelo = (DefaultTableModel) tabla_prestamos.getModel();
    }
    
    public void cargarPrestamos(){
        ResultSet listado = this.basedatos.listaPrestamos();
        if (listado!=null) {
            try {
                modelo.setRowCount(0);
                do{
                    String id = listado.getString("id_prestamo");
                    String usuario = listado.getString("usuario");
                    String libro = listado.getString("libro");
                    String fecha = listado.getString("fecha_prestamo");
                    String cantidad = listado.getString("cantidad_llevada");
                    Object[] temp = new Object[]{id, usuario, libro, fecha, cantidad};
                    modelo.addRow(temp);

                    tabla_prestamos.getColumnModel().getColumn(5).setCellRenderer(new RenderTable());
                    tabla_prestamos.getColumnModel().getColumn(5).setCellEditor(new EditarBoton(basedatos));
                    //System.out.println("Botón clicado en fila: " + tabla_prestamos.getRowSelectionAllowed());
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
        etq_prestamos_solicitados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_prestamos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(615, 513));

        panel_contenedor3.setBackground(new java.awt.Color(204, 204, 204));
        panel_contenedor3.setForeground(new java.awt.Color(255, 255, 255));
        panel_contenedor3.setPreferredSize(new java.awt.Dimension(615, 513));

        etq_prestamos_solicitados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_prestamos_solicitados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_prestamos_solicitados.setText("PRESTAMOS SOLICITADOS");
        etq_prestamos_solicitados.setOpaque(true);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAlignmentX(1.0F);
        jScrollPane1.setAlignmentY(1.0F);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabla_prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id prestamo", "usuario", "libro", "fecha prestamo", "cantidad", "accion"
            }
        ));
        tabla_prestamos.setToolTipText("");
        jScrollPane1.setViewportView(tabla_prestamos);

        javax.swing.GroupLayout panel_contenedor3Layout = new javax.swing.GroupLayout(panel_contenedor3);
        panel_contenedor3.setLayout(panel_contenedor3Layout);
        panel_contenedor3Layout.setHorizontalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_prestamos_solicitados, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_contenedor3Layout.setVerticalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_prestamos_solicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel etq_prestamos_solicitados;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JPanel panel_contenedor3;
    javax.swing.JTable tabla_prestamos;
    // End of variables declaration//GEN-END:variables
}
