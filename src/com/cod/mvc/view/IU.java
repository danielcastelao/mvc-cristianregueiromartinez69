package com.cod.mvc.view;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase IU que contiene los elementos de la interfaz gráfica
 * @author Cristian
 * @version 4.0
 */
public class IU {
    /**
     * Elementos de la interfaz gráfica
     */
    private JButton crearCoche;
    private JButton buscarCoche;
    private JButton subirVelocidad;
    private JButton bajarVelocidad;
    public JPanel panel;
    private JTextField modelo;
    private JTextField matricula;
    private JTextField velocidadCoche;

    Model model = Model.getInstance();
    /**
     * Constructor del entorno gráfico
     * tendrá los listener de la interfaz gráfica
     */
    public IU() {

        /**
         * Listener del boton crearCoche
         */
        crearCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Creamos un nuevo controlador
                 */
                Controller miController = new Controller(model);
                /**
                 * Creamos un coche
                 */
                miController.crearCoche(modelo.getText(), matricula.getText(), Integer.valueOf(velocidadCoche.getText()));
                /**
                 * Mostramos el mensaje
                 */
                Dialog.mostrarMensaje("Coche creado: " + modelo.getText() + " " + matricula.getText());
                /**
                 * Limpiamos los campos
                 */
                modelo.setText("");
                matricula.setText("");
            }
        });
        buscarCoche = new JButton("Buscar Coche");
        buscarCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Creamos un nuevo controlador
                 */
                Controller miController = new Controller(model);
                /**
                 * Buscamos un coche
                 */
                miController.buscarCoche(matricula.getText());
                /**
                 * Mostramos el mensaje
                 */
                Dialog.mostrarMensaje("Coche buscado: " + matricula.getText());
                /**
                 * Limpiamos los campos
                 */
                modelo.setText("");
                matricula.setText("");
            }
        });

        subirVelocidad = new JButton("Subir Velocidad");
        subirVelocidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Creamos un nuevo controlador
                 */
                Controller miController = new Controller(model);
                /**
                 * Subimos la velocidad
                 */
                miController.subirVelocidad(matricula.getText(), Integer.valueOf(velocidadCoche.getText()));
                /**
                 * Mostramos el mensaje
                 */
                View.mostrarVelocidad(matricula.getText(), Integer.valueOf(velocidadCoche.getText()));
                /**
                 * Limpiamos los campos
                 */
                modelo.setText("");
                matricula.setText("");
            }
        });
        bajarVelocidad = new JButton("Bajar Velocidad");
        bajarVelocidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Creamos un nuevo controlador
                 */
                Controller miController = new Controller(model);
                /**
                 * Bajamos la velocidad
                 */
                miController.bajarVelocidad(matricula.getText(), Integer.valueOf(velocidadCoche.getText()));
                /**
                 * Mostramos el mensaje
                 */
                View.mostrarVelocidad(matricula.getText(), Integer.valueOf(velocidadCoche.getText()));
                /**
                 * Limpiamos los campos
                 */
                modelo.setText("");
                matricula.setText("");
            }
        });
    }


    /**
     * Inicializa la Interfaz del Usuario
     * Lo llamaremos en el constructor de la vista
     */
    public static void crearVentana(JPanel botonera) {
        /**
         * Creamos la ventana
         */
        JFrame jframe = new JFrame("App MVC");
        JPanel mainPanel = new JPanel(new BorderLayout());
        IU iu = new IU();


        /**
         * situamos los elementos en la ventana
         */
        mainPanel.add(iu.panel, BorderLayout.NORTH);
        mainPanel.add(botonera, BorderLayout.SOUTH);

        jframe.setContentPane(mainPanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocation(500, 500);
        jframe.pack();
        jframe.setVisible(true);
    }
}


