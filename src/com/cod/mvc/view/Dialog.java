package com.cod.mvc.view;

import javax.swing.*;

public class Dialog extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;

    public Dialog() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        dialog.setLocationRelativeTo(null); // Centramos el diálogo después de ajustar el tamaño
        dialog.setVisible(true);
    }
}
