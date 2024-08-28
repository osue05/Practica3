/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends Jframe {
    private final JButton botonVerProductos;
    private final JButton botonRealizarOrdenes;
    private final JButton botonHistorialCompras;
    private final JButton botonCerrarSesion;

    public MainView() {
        // Configuración del JFrame
        setTitle("Vista Principal - Panadería");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usamos un layout nulo para posicionar manualmente

        // Botón de ver productos
        botonVerProductos = new JButton("Ver Productos");
        botonVerProductos.setBounds(100, 30, 200, 25);
        panel.add(botonVerProductos);

        // Botón de realizar órdenes
        botonRealizarOrdenes = new JButton("Realizar Órdenes");
        botonRealizarOrdenes.setBounds(100, 70, 200, 25);
        panel.add(botonRealizarOrdenes);

        // Botón de historial de compras
        botonHistorialCompras = new JButton("Historial de Compras");
        botonHistorialCompras.setBounds(100, 110, 200, 25);
        panel.add(botonHistorialCompras);

        // Botón de cerrar sesión
        botonCerrarSesion = new JButton("Cerrar Sesión");
        botonCerrarSesion.setBounds(100, 150, 200, 25);
        panel.add(botonCerrarSesion);

        // Agregar el panel al JFrame
        this.add(panel);

        // Acción de los botones
        botonVerProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la vista de productos
                JOptionPane.showMessageDialog(null, "Ver Productos clickeado.");
            }
        });

        botonRealizarOrdenes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la vista para realizar órdenes
                JOptionPane.showMessageDialog(null, "Realizar Órdenes clickeado.");
            }
        });

        botonHistorialCompras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la vista del historial de compras
                JOptionPane.showMessageDialog(null, "Historial de Compras clickeado.");
            }
        });

        botonCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la vista actual y mostrar la vista de inicio de sesión
                new LoginView().setVisible(true);
                dispose(); // Cierra la ventana actual
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    private void setTitle(String vista_Principal__Panadería) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
