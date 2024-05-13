package cod.mvc.model;

/**
 * Clase coche
 * @author cristian
 * @version v1.0
 */
public class Coche {

    /**
     * atributos privados de la clase coche
     */
    private String matricula;
    private String modelo;
    private int velocidad;

    /**
     * Contructor de la clase coche
     * @param matricula la mtricula del coche
     * @param modelo el modelo del coche
     * @param velocidad la velocidad del coche
     */
    public Coche(String matricula, String modelo, int velocidad){
    this.matricula = matricula;
    this.modelo = modelo;
    this.velocidad = velocidad;
}

    /**
     * getter y setter de la clase coche
     * @return los valores correspondientes
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
