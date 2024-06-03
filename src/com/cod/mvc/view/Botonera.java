
package com.cod.mvc.view;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

import javax.swing.*;

/**
 * Clase Botonera
 * Clase que contiene los elementos de la botonera
 * @author Cristian
 * @version 3.0
 */
public class Botonera {

    /**
     * Elementos de la botonera
     */
    public JPanel panel;
    private JTextField text_matricula;
    private JLabel label_matricula;
    private JLabel label_cambiar;
    private JTextField text_cambiar;
    private JButton button_cambiar;

    Model model = Model.getInstance();

    /**
     * Constructor de la clase Botonera
     * tendrá los listener de la interfaz gráfica
     */
    public Botonera() {


        /**
         * Listener del boton cambiar
         */
        button_cambiar.addActionListener(e -> {
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
            text_cambiar.setText("");
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
