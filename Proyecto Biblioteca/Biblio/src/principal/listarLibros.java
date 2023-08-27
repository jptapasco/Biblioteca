package principal;

import clases.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        String buscar = campo_buscar_id.getText();

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
                    
                    if (!buscar.isEmpty()){
                        for (Object temp1 : temp) {
                            if (temp[0].equals(buscar)){
                                modelo.addRow(temp);
                            }
                            break;
                        }
                    }else{                  
                        modelo.addRow(temp);
                    }
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
        btn_editar_libro = new javax.swing.JButton();
        campo_buscar_id = new javax.swing.JTextField();
        etq_buscar_id = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(615, 482));

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

        btn_editar_libro.setBackground(new java.awt.Color(102, 204, 255));
        btn_editar_libro.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar_libro.setText("Editar Libro");
        btn_editar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_libroActionPerformed(evt);
            }
        });

        campo_buscar_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campo_buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_buscar_idActionPerformed(evt);
            }
        });

        etq_buscar_id.setText("Buscar Libro By iD");

        javax.swing.GroupLayout panel_contenedor3Layout = new javax.swing.GroupLayout(panel_contenedor3);
        panel_contenedor3.setLayout(panel_contenedor3Layout);
        panel_contenedor3Layout.setHorizontalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenedor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_buscar_id)
                .addGap(66, 66, 66)
                .addComponent(campo_buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btn_editar_libro)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        panel_contenedor3Layout.setVerticalGroup(
            panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor3Layout.createSequentialGroup()
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_buscar_id, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(campo_buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_libro))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenedor3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_librosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabla_librosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_librosAncestorAdded

    
    private void btn_editar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_libroActionPerformed
        String id = campo_buscar_id.getText();
        
        if (!id.isEmpty()){
            panel_contenedor3.removeAll();

            editarLibro contentTemporal = new editarLibro(basedatos, id);
            contentTemporal.cargarDatos();      
            contentTemporal.setSize(panel_contenedor3.getSize() );
            panel_contenedor3.add( contentTemporal );

            repaint();
            revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Ingresa el ID del libro que deseas editar.");
        }
    }//GEN-LAST:event_btn_editar_libroActionPerformed
    
    private void campo_buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_buscar_idActionPerformed
         campo_buscar_id.getDocument().addDocumentListener(new DocumentListener() {
            @Override
        	public void insertUpdate(DocumentEvent e) {
                    cargarListaLibros();
                }
			@Override
        	public void removeUpdate(DocumentEvent e) {
                    cargarListaLibros();
                }
            @Override
        	public void changedUpdate(DocumentEvent e) {
                // Este método se usa principalmente para componentes que admiten estilos de documento
                // y no es relevante para JTextField en este caso
            }
	});
    }//GEN-LAST:event_campo_buscar_idActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar_libro;
    private javax.swing.JTextField campo_buscar_id;
    private javax.swing.JLabel etq_buscar_id;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor3;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}
