/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funcionario {
    
    private int idFuncionario;
    private String nombre;
    private final String usuario;
    private final String contraseña;

    public Funcionario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion() {
        Connection conexion = null;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        try {
            // Conexión a la base de datos MySQL
            conexion = DriverManager.getConnection("jdbc:mysql://localinstance:3306/Panaderia", "root", "Byron2005**");
            String sql = "SELECT * FROM Funcionario WHERE usuario = ? AND contrasena = ?";
            declaracion = conexion.prepareStatement(sql);
            declaracion.setString(1, usuario);
            declaracion.setString(2, contraseña);
            resultado = declaracion.executeQuery();
            return resultado.next();  // Devuelve true si el usuario existe
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (declaracion != null) declaracion.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
            }
        }
    }
}
   
