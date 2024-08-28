/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Funcionario;

public class LoginView extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private final JButton botonIniciarSesion;
    private final JLabel etiquetaUsuario;
    private final JLabel etiquetaContraseña;

    public LoginView() {
        // Configuración del JFrame
        setTitle("Inicio de Sesión - Panadería");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usamos un layout nulo para posicionar manualmente

        // Etiquetas y campos de texto
        etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(10, 20, 80, 25);
        panel.add(etiquetaUsuario);

        campoUsuario = new JTextField(20);
        campoUsuario.setBounds(100, 20, 165, 25);
        panel.add(campoUsuario);

        etiquetaContraseña = new JLabel("Contraseña:");
        etiquetaContraseña.setBounds(10, 50, 80, 25);
        panel.add(etiquetaContraseña);

        campoContraseña = new JPasswordField(20);
        campoContraseña.setBounds(100, 50, 165, 25);
        panel.add(campoContraseña);

        // Botón de inicio de sesión
        botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.setBounds(100, 90, 150, 25);
        panel.add(botonIniciarSesion);

        // Agregar el panel al JFrame
        this.add(panel);

        // Acción del botón
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contraseña = new String(campoContraseña.getPassword());

                // Validar el inicio de sesión usando la clase Funcionario
                Funcionario funcionario = new Funcionario(usuario, contraseña);
                if (funcionario.iniciarSesion()) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                    // Abre la vista principal y cierra la vista de inicio de sesión
                    new MainView().setVisible(true);
                    dispose(); // Cierra la ventana de inicio de sesión
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });

    }

    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
}
   
