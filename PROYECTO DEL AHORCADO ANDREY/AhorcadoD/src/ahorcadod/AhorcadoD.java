/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadod;

/**
 *
 * @author Andrey B
 */
public class AhorcadoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lpalabras[] = {"Belice","Costa Rica","El Salvador","Guatemala","Honduras","Nicaragua","Panamá"};
       lista_de_palabras lp = new lista_de_palabras(lpalabras);
        System.out.println(lp.palabraAzar(lpalabras));//PRUEBA PARA A VER SI SIRVE EL METODO RANDOM
    }
}