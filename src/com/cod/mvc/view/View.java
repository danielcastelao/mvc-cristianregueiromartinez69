package com.cod.mvc.view;

import javax.swing.*;

/**
 * Entorno gráfico
 */
public class View {

      static JPanel botonera = Botonera.crearBotonera();

    /**
     * Inicializamos el entorno gráfico
     */
    public static void crearVentana() {
        IU.crearVentana(botonera);
    }

    /**
     * Muestra la velocidad
     * @param matricula del coche
     * @param v velocidad que queremos mostrar
     * @return true si todo bien
     */
    public static boolean mostrarVelocidad(String matricula, Integer v){
        botonera.setBorder(BorderFactory.createTitledBorder("Mostrando velocidad de " + matricula));

        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";

        Dialog.mostrarMensaje(mensaje);

        botonera.setBorder(BorderFactory.createTitledBorder("Cambiar velocidad"));
        return true;
    }

}