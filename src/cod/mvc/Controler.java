package cod.mvc;

public class Controler {

   public static void logicaPrograma(){

       Model.crearCoche("1234-UH", "Seat", 140);
       Coche miCoche = Model.getMisCoches().get(0);


       System.out.println(View.muestraVelocidad(miCoche.getMatricula(), miCoche.getVelocidad()));

   }


}
