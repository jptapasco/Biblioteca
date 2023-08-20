package clases;

import java.sql.*;
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
                    respuesta = true;
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
    

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
