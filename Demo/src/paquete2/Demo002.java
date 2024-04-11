/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;
/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { /* Inicializar la Variable CADENA1
        con el paquete anteriormente importado*/
        
        Scanner leer = new Scanner(System.in);
        
        int habitantes = Informacion.obtenerHabitantes(); /* Mediante la variable 
        Habitantes, se llama al Metodo ObtenerHabitantes */
        
        int opcion;
        
        String cadena1 = Mensaje.obtenerMensaje(); /* La Variable Cadena1 llama
        al metodo obtener Habitantes */
        
        String cadenaFin = String.format("%s con %d", cadena1,
                habitantes); /* Variable utilizada a llamar un String Format 
        el msj en pantalla */
        
        System.out.println(" Ingresar un Numero entre 1 y 5 para presentar"
        + "para presentar Mensaje");
        opcion = leer.nextInt();
        
        if (opcion >= 1 && opcion <= 5) {   
        System.out.printf("%s\n", cadenaFin);
        } else {
            System.out.printf("%s\n", cadenaFin.toUpperCase());
            // Utilizando la Funcion String para letras Mayusculas
        }
    }      
}
