# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC


### Diagrama de clases:
Diagrama de clases de la aplicación
```mermaid
classDiagram
    class Coche {
        String: modelo
        String: matricula
        Integer: velocidad
    }
     
      class View {
      + botonera : JPanel
      + crearVentana()
      + mostrarVelocidad(String, Integer)
      }
      
    class Botonera {
        -JPanel panel
        -JTextField text_matricula
        -JLabel label_matricula
        -JButton button_obtener
        -JLabel matriculaSubirLabel
        -JTextField matriculaSubirText
        -JLabel VelocidadSubirLabel
        -JButton subirVelocidadButton
        -JTextField subirVelocidadText
        -JTextField textMatriculaBajar
        -JLabel velocidadBajarLabel
        -JTextField velocidadBajarText
        -JButton bajarVelocidadButton
        -JLabel matriculaLabelBajar
        -Model model
        +Botonera()
        +static JPanel crearBotonera()
    }
      
    class Dialog {
        -JPanel contentPane
        -JLabel mensaje
        +Dialog()
        +static void mostrarMensaje(String)
    }
    class IU {
        -JButton crearCoche
        -JButton buscarCoche
        -JButton subirVelocidad
        -JButton bajarVelocidad
        -JPanel panel
        -JTextField modelo
        -JTextField matricula
        -JTextField velocidadCoche
        -Model model
        +IU()
        +static void crearVentana(JPanel)
    }
        
      
     
      class Model {
         ~ model Model
         +parking : ArrayList<Coche>
         +crearCoche(String, String, Integer)
         +cambiarVelocidad(String, Integer)
         + getDatosCoche(String)
         +getVelocidad(String)
         +subirVelocidad(String, Integer)
         +bajarVelocidad(String, Integer)
         +getInstance()      
      }
      class Observable{
            +addObserver(Observer)
            +removeObserver(Observer)
            +notifyObservers(Coche coche)
      }
      class Controller{
          +crearCoche(String, String)
          +cambiarVelocidad(String, Integer)
          +buscarCoche(String)
          +subirVelocidad(String, Integer)
          +bajarVelocidad(String, Integer)
      }
      class Observer{
          +update()
      }
      class ObserverBajarVelocidad{
          ~ BAJAR : Integer
          +update()
      }
     class ObserverSubirVelocidad{
            ~ SUBIR : Integer
            +update()
     }
     class ObserverVelocidad{
        +update()
     }
     class ObserverLimite{
        +update()
     }
   
    Coche "1" -- "many" Model : contains
    Model "1" -- "1" Botonera : uses
    Model "1" -- "1" IU : uses
    View "1" -- "1" IU : uses
    Dialog "1" -- "1" IU : uses
    Controller "1" -- "1" IU : uses
    Controller "1" -- "1" Model : uses
    Observable "1" -- "many" Observer : notifies
    Observer <|-- ObserverBajarVelocidad
    Observer <|-- ObserverSubirVelocidad
    Observer <|-- ObserverVelocidad
    Observer <|-- ObserverLimite
      
```

---

### Diagrama de Secuencia

Diagrama de secuencia de la creación de un coche, subir la velocidad y mostrar la velocidad en la vista.

```mermaid
sequenceDiagram
    participant IU as IU
    participant Controller as Controller
    participant Model as Model
    participant Coche as Coche
    participant View as View
    participant Dialog as Dialog
    participant Observable as Observable
    participant Observer as Observer

    IU->>Controller: crearCoche(modelo, matricula)
    Controller->>Model: crearCoche(modelo, matricula)
    Model->>Coche: new Coche(modelo, matricula)
    Model->>Observable: notifyObservers(coche)
    Observable->>Observer: update()
    IU->>Controller: subirVelocidad(matricula, velocidad)
    Controller->>Model: subirVelocidad(matricula, velocidad)
    Model->>Coche: setVelocidad(velocidad)
    Model->>Observable: notifyObservers(coche)
    Observable->>Observer: update()
    IU->>View: mostrarVelocidad(matricula, velocidad)
    IU->>Dialog: mostrarMensaje("Velocidad cambiada")
```

