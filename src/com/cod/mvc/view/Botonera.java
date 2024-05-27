
package com.cod.mvc.view;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

import javax.swing.*;

public class Botonera {

    public JPanel panel;
    private JTextField text_matricula;
    private JLabel label_matricula;
    private JLabel label_cambiar;
    private JTextField text_cambiar;
    private JButton button_cambiar;

    /**
     * Constructor de la clase Botonera
     * tendrá los listener de la interfaz gráfica
     */
    public Botonera() {


        button_cambiar.addActionListener(e -> {
            Controller miController = new Controller(new Model());
            miController.cambiarVelocidad(text_matricula.getText(), Integer.valueOf(text_cambiar.getText()));
            Dialog.mostrarMensaje("Velocidad cambiada: " + text_cambiar.getText() + "km/h");
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
