package com.cod.mvc.view;

import javax.swing.*;

/**
 * Clase View con el entorno gráfico
 * @author cristian
 * @version 4.0
 */
public class View {

    /**
     * Botonera con los botones
     */
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
     * @return true si va genial y false si no
     */
    public static void mostrarVelocidad(String matricula, Integer v){

        /**
         * Cambiamos el titulo de la botonera
         */
        botonera.setBorder(BorderFactory.createTitledBorder("Mostrando velocidad de " + matricula));

        /**
         * Creamos el mensaje
         */
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";

        /**
         * Mostramos el mensaje
         */
        Dialog.mostrarMensaje(mensaje);


        /**
         * volvemos a cambiar el titulo de la botonera
         */
    }

}

