
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;


public class ModeloEmpleados {
    
    int Codigo;
    String Apellidos;
    String Nombres;
    int Telefono;
    
    Connection miConexion;
    
    public ModeloEmpleados()
    {
  
    }

    public ModeloEmpleados(int Codigo, String Apellidos, String Nombres, int Telefono) {
        this.Codigo = Codigo;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Connection getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }
    
    public void AgregarEmpleado(int Codigo, String Apellidos, String Nombre, int Telefono) throws SQLException
    {
        try{
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(Nombre, Nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values('"+this.getCodigo()+"','"+this.getApellidos()+"','"+this.getNombres()+"','"+this.getTelefono()+"')");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar registro..."+e.getMessage());
        }
    }
    
    public void EditarEmpleado(int Codigo, String Apellidos, String Nombres, int Telefono)
    {
        
    }
}
