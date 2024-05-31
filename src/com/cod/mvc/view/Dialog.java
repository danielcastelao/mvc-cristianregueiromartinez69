package com.cod.mvc.view;

import javax.swing.*;

/**
 * Clase Dialog con los mensajes cada vez que cambiemos algo
 * @author cristian
 * @version 3.0
 */
public class Dialog extends JDialog {
    /**
     * Elementos de la ventana
     */
    private JPanel contentPane;
    private JLabel mensaje;

    /**
     * Constructor de la clase Dialog
     */
    public Dialog() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setResizable(true);
    }

    /**
     * Mostramos un dialogo modal con información
     * @param msg información que queremos mostrar
     */
    public static void mostrarMensaje(String msg) {
        Dialog dialog = new Dialog();
        dialog.mensaje.setText(msg);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }


}
