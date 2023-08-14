package clases;

import java.sql.*;

public class DataBase {
    Connection conexion;
    Statement manipularDB;
    
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
    
       public boolean agregarUsuario(String tipo_usuario, String nombre,String apellido, String cedula, String telefono, String direccion){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO usuarios (rol, nombre, apellido, cedula, telefono, direccion) VALUES ('"+tipo_usuario+"','"+nombre+"','"+apellido+"','"+cedula+"','"+telefono+"','"+direccion+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: "+ex.getMessage());
        }
        return respuesta;
    }
    
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
    
    
}
