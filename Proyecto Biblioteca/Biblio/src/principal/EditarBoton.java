package principal;

import clases.DataBase;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
    
class EditarBoton extends DefaultCellEditor {
    
        DataBase basedatos;
        private JButton button;
        private String label;
        private boolean clicked;

        public EditarBoton(DataBase basedatos) {
            super(new JTextField());
            this.basedatos = basedatos;
            button = new JButton();
            button.setOpaque(true);

            // Capturar el clic del botón
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }  
        
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            PrestamosSolicitados conex = new PrestamosSolicitados(basedatos);
            label = (value == null) ? "" : value.toString();
            button.setText("aceptado");
            clicked = true;
            final int clickedRow = row;
            Object valueAtRow = conex.modelo.getValueAt(clickedRow, 5);
            button.setEnabled(valueAtRow != null && !(Boolean) valueAtRow);
 
            String usuario = conex.tabla_prestamos.getValueAt(clickedRow, 1).toString();
            String libro = conex.tabla_prestamos.getValueAt(clickedRow, 2).toString();
            String fecha = conex.tabla_prestamos.getValueAt(clickedRow, 3).toString();
            System.out.println("Aceptado->");
            System.out.println("--> usuario_: " + usuario);
            System.out.println("--> libro_: " + libro);
            System.out.println("--> fecha_: " + fecha);
            if (clicked){
                boolean respuesta = this.basedatos.aceptarPrestamo(usuario, libro, fecha);
            }else{
                System.out.println("-Falta algo... ");
            }
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (clicked) {
              
            }
            clicked = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
}
