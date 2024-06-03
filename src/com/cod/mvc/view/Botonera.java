package com.cod.mvc.view;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

import javax.swing.*;

/**
 * Clase Botonera que contiene los elementos de la botonera
 * @author Cristian
 * @version 4.0
 */
public class Botonera {

    /**
     * Elementos de la botonera
     */
    public JPanel panel;
    private JTextField text_matricula;
    private JLabel label_matricula;
    private JButton button_obtener;
    private JLabel matriculaSubirLabel;
    private JTextField matriculaSubirText;
    private JLabel VelocidadSubirLabel;
    private JButton subirVelocidadButton;
    private JTextField subirVelocidadText;
    private JTextField textMatriculaBajar;
    private JLabel velocidadBajarLabel;
    private JTextField velocidadBajarText;
    private JButton bajarVelocidadButton;
    private JLabel matriculaLabelBajar;

    Model model = Model.getInstance();

    /**
     * Constructor de la clase Botonera
     * tendrá los listener de la interfaz gráfica
     */
    public Botonera() {


        /**
         * Listener del boton cambiar
         */
        button_obtener.addActionListener(e -> {
            /**
             * Creamos un nuevo controlador
             */
            Controller miController = new Controller(Model.getInstance());
            /**
             * Cambiamos la velocidad
             */
            miController.buscarCoche(text_matricula.getText());

            /**
             * Mostramos el mensaje
             */

            Dialog.mostrarMensaje("datos del coche: " + model.getDatosCoche(text_matricula.getText()));
            /**
             * Limpiamos los campos
             */
            text_matricula.setText("");
        });

        subirVelocidadButton.addActionListener(e -> {
            /**
             * Creamos un nuevo controlador
             */
            Controller miController = new Controller(model);
            /**
             * Cambiamos la velocidad
             */
            miController.subirVelocidad(matriculaSubirText.getText(), Integer.valueOf(subirVelocidadText.getText()));

            /**
             * Mostramos el mensaje
             */
            View.mostrarVelocidad(matriculaSubirText.getText(), Integer.valueOf(subirVelocidadText.getText()));
            /**
             * Limpiamos los campos
             */
            matriculaSubirText.setText("");
        });
        bajarVelocidadButton.addActionListener(e -> {
            /**
             * Creamos un nuevo controlador
             */
            Controller miController = new Controller(model);
            /**
             * Cambiamos la velocidad
             */
            miController.bajarVelocidad(textMatriculaBajar.getText(), Integer.valueOf(velocidadBajarText.getText()));

            /**
             * Mostramos el mensaje
             */
            View.mostrarVelocidad(textMatriculaBajar.getText(), Integer.valueOf(velocidadBajarText.getText()));
            /**
             * Limpiamos los campos
             */
            textMatriculaBajar.setText("");
        });
    }

    /**
     * Inicializa Botonera para cambiar velocidad
     *
     * @return JPanel con los elementos de la botonera
     */

    public static JPanel crearBotonera() {
        return new Botonera().panel;
    }


}