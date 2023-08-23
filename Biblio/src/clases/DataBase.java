package clases;

import java.sql.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.Menu;
import principal.MenuUsuarios;

public class DataBase {
    Connection conexion;
    Statement manipularDB;
    DataBase basedatos;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String user_name = "root";
        String password = "";
        String database_name = "biblioteca";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
            
        try {
            this.conexion = DriverManager.getConnection(url, user_name, password);
            this.manipularDB = this.conexion.createStatement();
            System.out.println("Conexion a DataBase Exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a base de dato: "+ex.getMessage());
        }
    }
   
    
    //INGRESAR AL SISTEMA (AMBOS)
    public ResultSet ingresarSistema(String p_cedula, String p_rol, String p_nombre){
        ResultSet busqueda = null;
        try {
            String buscar = "SELECT cedula, rol, nombre FROM usuarios WHERE cedula = '"+p_cedula+"' AND rol = '"+p_rol+"' AND nombre = '"+p_nombre+"' ";
            busqueda = this.manipularDB.executeQuery(buscar);
            busqueda.next();
            
            if(busqueda.getRow() == 1){
                System.out.println("EXISTE");
                return busqueda;
            } else{
                System.out.println("NO EXISTE");
                return null;
            }   
        } catch (SQLException ex) {
            System.out.println("Error al buscar un usuario"+ex.getMessage());
        }
        return busqueda;
    }

    
    //INSERTAR LIBROS (BIBLIOTECARIO)
    public boolean insertarLibro(String titulo, String autor, String descripcion, String genero, String cantidad_disponible, String valor_prestamo){
        boolean respuesta = false;
        
            try {
                String consulta = "INSERT INTO libros (titulo, autor, descripcion, genero, cantidad_disponible, valor_prestamo) VALUES ('"+titulo+"','"+autor+"','"+descripcion+"','"+genero+"','"+cantidad_disponible+"','"+valor_prestamo+"')";
                int resultado = this.manipularDB.executeUpdate(consulta);
                if (resultado==1) {
                    respuesta = true;        // TODO add your handling code here:ue;
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar: "+ex.getMessage());
            }
        return respuesta;  
    }
    
    //AGREGAR USUARIOS (BIBLIOTECARIO)
    public boolean agregarUsuario(String cedula, String rol,String nombre ,String apellido, String telefono, String direccion){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO usuarios (cedula, rol, nombre, apellido, telefono, direccion) VALUES ('"+cedula+"','"+rol+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: "+ex.getMessage());
        }
        return respuesta;
    }
     
    
    //LISTA DE USUARIOS (BIBLIOTECARIO)
    public ResultSet listaUsuarios(){
        ResultSet lista = null;
        
        try {
            String consulta = "SELECT * FROM usuarios";
            lista = this.manipularDB.executeQuery(consulta);
            lista.next();
            
            if (lista.getRow()==1) {
                return lista;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error en SELECT: "+ex.getMessage());
        }
        return lista;
    }
    
    //LISTA DE LIBROS (AMBOS)
    public ResultSet listaLibros(){
        ResultSet lista = null;
        
        try {
            String consulta = "SELECT * FROM vista_libros";
            lista = this.manipularDB.executeQuery(consulta);
            lista.next();
            
            if (lista.getRow()==1) {
                return lista;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error en SELECT: "+ex.getMessage());
        }
        return lista;
    }
    
    //SOLICITAR PRESTAMO (CLIENTE)
    public boolean solicitarPrestamo(String cedula_cliente, String nombre_libro, Date fecha_devolucion, int cantidad_llevada, String estado) {
        boolean resultado_c = false;
        try {
            Statement statement = conexion.createStatement();

            // BUSCAR CLIENTE
            String cliente = "SELECT nombre FROM usuarios WHERE cedula = '" + cedula_cliente + "'";
            ResultSet resultSetCliente = statement.executeQuery(cliente);
            if (resultSetCliente.next()) {
                String nombreCliente = resultSetCliente.getString("nombre");

                String buscar_l = "SELECT titulo FROM libros WHERE titulo = '" + nombre_libro + "'";
                ResultSet resultSetLibro = statement.executeQuery(buscar_l);
                if (resultSetLibro.next()) {
                    String nombreLibro = resultSetLibro.getString("titulo");
                    
                    //FECHA ACTUAL
                    Date fecha_actual = new Date();
                    java.sql.Date fechaActual = new java.sql.Date(fecha_actual.getTime());

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String fechaFormateada = dateFormat.format(fecha_devolucion);

                    String solicitar = "INSERT INTO prestamo (usuario, libro, fecha_prestamo , fecha_devolucion, cantidad_llevada, estado) VALUES ('" + nombreCliente + "','" + nombreLibro + "','"+fechaActual+"','" + fechaFormateada+ "','" + cantidad_llevada + "','" + estado + "')";
                    int resultado = this.manipularDB.executeUpdate(solicitar);
                    if (resultado == 1) {
                        System.out.println("Se insertó");
                        resultado_c = true;
                        JOptionPane.showMessageDialog(null, "Solicitud enviada");
                    }
                } else {
                    System.out.println("Libro no encontrado");
                }
            } else {
                System.out.println("Cliente no encontrado");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR AL SOLICITAR" + ex.getMessage());
        }
        return resultado_c;
    }
    
    
    //BUSCAR CLIENTE
    public ResultSet buscarCliente(String cedula){
        ResultSet lista = null;
        try {
            String consulta = "SELECT * FROM usuarios WHERE cedula = '"+cedula+"'";
            lista = this.manipularDB.executeQuery(consulta);
            lista.next();
            if (lista.getRow()==1) {
                return lista;
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            System.out.println("Cedula no encontrada"+ex.getMessage());
        }
        return lista;
    }

    public boolean updateClientes(String cedula, String nombre, String apellido, String telefono, String direccion){
        boolean resultado = false;
        try {
            Statement statement = conexion.createStatement();
            
            String buscar_c = "SELECT id_usuario FROM usuarios WHERE cedula = '"+cedula+"' ";
            ResultSet resultSetBuscarC = statement.executeQuery(buscar_c);
            if(resultSetBuscarC.next()){
                String id_user = resultSetBuscarC.getString("id_usuario");
                String update = "UPDATE usuarios SET cedula = '"+cedula+"', nombre = '"+nombre+"', apellido = '"+apellido+"', telefono = '"+telefono+"' , direccion = '"+direccion+"' WHERE id_usuario = '"+id_user+"' ";
                int respuesta = this.manipularDB.executeUpdate(update);

                if(respuesta == 1){
                    resultado = true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Papi no se pudo actualizar"+ex.getMessage());
        }
        return resultado;
    }
    

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
