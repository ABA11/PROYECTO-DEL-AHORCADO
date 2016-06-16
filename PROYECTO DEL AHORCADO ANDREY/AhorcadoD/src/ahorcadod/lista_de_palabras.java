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
public class lista_de_palabras {     
    //VARIABLES QUE SE UTILIZARAN DURANTE EL PROGRESO DEL PROGRAMA
    String lpalabras[];//ESTA VARIABLE DE TIPO ARREGLO, TENDRA LAS PALABRAS ASIGNADAS POR EL PROGRAMADOR

    //CONSTRUCTOR DE LA CLASE LISTA_DE_PALABRAS

    public lista_de_palabras(String[] lpalabras) {
        this.lpalabras = lpalabras;
       
    }
    //SET`S & GET`S
    
    /**
     *MÉTODO GET PARA LA VARIABLE Lpalabras
     * @return lpalabras
     */
    public String[] getLpalabras() {
        return lpalabras;
    }

    /**
     *MÉTODO SET PARA LA VARIABLE Lpalabras
     * @param lpalabras
     */
    public void setLpalabras(String[] lpalabras) {
        this.lpalabras = lpalabras;
    }

   
    //METODOS ESPECIFICOS QUE LO QUE REALIZARAN SON LOS PROCEDIMIENTOS PARA QUE EL PROGRAMA SE EJEECUTE
    
    /**
     *MÉTODO QUE ME ESCOGE UNA PALABRA AL AZAR
     * @param lpalabras
     * @return lpalabras[azar]
     */
    public String palabraAzar(String lpalabras[]){//MÉTODO QUE FUNCIONA PARA QUE EL PROGRAMA ELIGA UNA PALABRA DE LAS CUALES HEMOS INGRESADO EN EL MAIN
       int azar = (int) (Math.random()*7);//DAMOS UN VALOR RANDOM A LA VARIABLE int azar 
               return lpalabras[azar];//POR MEDIO DE LA VARIABLE azar NOS DA UNA POSICION ALEATORIO DE LA VARIABLE TIPO ARREGLO lpalbras
    
   }
    
}