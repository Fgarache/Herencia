package main;
import operaciones.Clasehija_resta;
import operaciones.Clasehija_Suma;
public class Claseprincipal {
    public static void main(String[] args) {
        Clasehija_Suma mensajesuma = new Clasehija_Suma();
        mensajesuma.perdirdatos();
        mensajesuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajesuma.mostrarresultado();

        Clasehija_resta mensajeresta = new Clasehija_resta();
        mensajeresta.perdirdatos();
        mensajeresta.Restar();
        System.out.print("La resta es: ");
        mensajeresta.mostrarresultado();



    }

}
