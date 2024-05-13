package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * clase model con los metodos
 * @author cristian
 * @version v1.0
 */
public class Model implements Observable {

    /**
     * atributo privado ArrayList de tipo Cohe
     */
    private static ArrayList <Coche> parking = new ArrayList<>();
    /**
     * Lista para nuestros observadores
     */
    private static final List<Observer> observers = new ArrayList<>();

    /**
     * Metodo para crear un coche
     * @param auxMatricula la matricula del coche
     * @param auxModelo el model del coche
     * @param auxVelocidad la velocidad del coche
     * @return
     */
    public static ArrayList <Coche> crearCoche(String auxMatricula, String auxModelo, int auxVelocidad){

        parking.add(new Coche(auxMatricula, auxModelo, auxVelocidad));
        return parking;
    }

    /**
     * metodo que devuelve el array de coches
     * @return el array de coches
     */
    public static ArrayList<Coche> getMisCoches() {
        return parking;
    }

    /**
     * metodo para cambiar la velocidad del coche según la matrícula proporcionada
     * @param auxMatricula la matricula que ha de encontrar para encontrar la velocidad
     * @param velocidad la nueva velocidad del coche
     */
    public  void cambiarVelocidad(String auxMatricula, int velocidad){

        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                coche.setVelocidad(velocidad);
                /**
                 * notificamos a los observadores que se cambió la velocidad
                 */
                notifyObservers(coche);
            }
        }


    }

    /**
     * metodo para obtener la velocidad del coche según la matrícula proporcionada
     * @param auxMatricula la matrícula del coche que ha de encontrar
     * @return la velocidad del coche
     */
    public static int getVelocidad(String auxMatricula){
        int velocidadActual = 0;
        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                velocidadActual = coche.getVelocidad();
            }
        }
        return velocidadActual;
    }



    public static void setParking(ArrayList<Coche> parking) {
        Model.parking = parking;
    }

    /**
     * metodo implementado para añadir observadores
     * @param observer el objeto de tipo Observer
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * metodo implementado para borrar observadores
     * @param observer el objeto de tipo observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * metodo implementado para notificar de un cambio a los observadores
     * @param coche el Objeto de tipo Coche
     */
    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }
}
