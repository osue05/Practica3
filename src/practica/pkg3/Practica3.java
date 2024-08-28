/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author Byron
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un nuevo objeto Funcionario para probar el inicio de sesión
        Funcionario funcionario = new Funcionario("usuarioEjemplo", "contraseñaEjemplo");

        // Intentar iniciar sesión
        if (funcionario.iniciarSesion()) {
            System.out.println("Inicio de sesión exitoso.");
            // Aquí puedes mostrar la siguiente vista, como la interfaz para crear órdenes
        } else {
            System.out.println("Usuario o contrasena incorrectos.");
        }
    }
}

 
