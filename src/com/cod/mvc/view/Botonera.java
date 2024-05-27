package com.cod.mvc.view;

import com.cod.mvc.controller.Controller;

import javax.swing.*;

public class Botonera {

    public JPanel panel;
    private JTextField text_matricula;
    private JLabel label_matricula;
    private JLabel label_cambiar;
    private JTextField text_cambiar;
    private JButton button_cambiar;


    public Botonera() {

        button_cambiar.addActionListener(e -> {

            Controller.cambiarVelocidad(text_matricula.getText(), Integer.valueOf(text_cambiar.getText()));
        });
    }



    public static JPanel crearBotonera() {
        return new Botonera().panel;
    }


}