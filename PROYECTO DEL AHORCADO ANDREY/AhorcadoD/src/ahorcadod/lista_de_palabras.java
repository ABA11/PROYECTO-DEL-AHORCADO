/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadod;

/**
 *
 * @author Andrey B
 * date 06-06-2016
 */
public class lista_de_palabras {     
//VARIABLES QUE SE UTILIZARAN DURANTE EL PROGRESO DEL PROGRAMA
   private String [] lpalabras;//ESTA VARIABLE DE TIPO ARREGLO, TENDRA LAS PALABRAS ASIGNADAS POR EL PROGRAMADOR SON LAS DEL CASO 1 ESTA CONTIENE LOS COLORES 
   private String [] ñpalabras;//ESTA VARIABLE DE TIPO ARREGLO, TENDRA LAS PALABRAS ASIGNADAS POR EL PROGRAMADOR SON LAS DEL CASO 2 ESTA CONTIENE LOS PAISES
   private String [] kpalabras;//ESTA VARIABLE DE TIPO ARREGLO, TENDRA LAS PALABRAS ASIGNADAS POR EL PROGRAMADOR SON LAS DEL CASO 3 ESTA CONTIENE LAS FRUTAS
   private String palabraal;//ESTA VARIABLE SERA LA QUE ALMECENE LA PALBRA QUE EL PROGRAMA ELEGIRA ALEATORIAMENTE CON LA FUNCION RANDOM
   private String [] palabraac;//ESTA VARIABLE DE TIPO ARREGLO, SERA LLENADO CON "-" PARA PERMITIR QUE EL USUARIO VEA EL TAMAÑO DE LA PALBRA A ADIVINAR
   private char caracter;//ESTA VARIABLE ALMACENARA EL CARACTER QUE EL USUARIO INGRESARA PARA ADIVINAR LA PALABRA 
 
   //CONSTRUCTOR DE LA CLASE LISTA_DE_PALABRAS

    public lista_de_palabras(String[] lpalabras, String palabraal, String[] palabraac, char caracter) {
        this.lpalabras = lpalabras;
        this.palabraal = palabraal;
        this.palabraac = palabraac;
        this.caracter = caracter;
    //FIN DE CONSTRUCTOR    
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

    /**
     *MÉTODO GET PARA LA VARIABLE Palabraal
     * @return palabraal
     */
    public String getPalabraal() {
        return palabraal;
    }

    /**
     *MÉTODO SET PARA LA VARIABLE Palabraal
     * @param palabraal
     */
    public void setPalabraal(String palabraal) {
        this.palabraal = palabraal;
    }

    /**
     *MÉTODO GET PARA LA VARIABLE Palabrac
     * @return Palabrac
     */
    public String[] getPalabrac() {
        return palabraac;
    }

    /**
     *MÉTODO SET PARA LA VARIABLE Palabrac
     * @param palabrac
     */
    public void setPalabrac(String[] palabrac) {
        this.palabraac = palabrac;
    }

    /**
     *MÉTODO GET PARA LA VARIABLE Caracter
     * @return caracter
     */
    public char getCaracter() {
        return caracter;
    }

    /**
     *MÉTODO SET PARA LA VARIABLE caracter
     * @param caracter
     */
    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    //METODOS ESPECIFICOS QUE LO QUE REALIZARAN SON LOS PROCEDIMIENTOS PARA QUE EL PROGRAMA SE EJEECUTE
    
    /**
     *MÉTODO QUE ME ESCOGE UNA PALABRA AL AZAR
     * @param lpalabras
     * @return lpalabras[azar]
     */
    public String palabraAzar(String lpalabras[]){//MÉTODO QUE FUNCIONA PARA QUE EL PROGRAMA ELIGA UNA PALABRA DE LAS CUALES HEMOS INGRESADO EN EL MAIN
       int azar = (int) (Math.random()*4);//DAMOS UN VALOR RANDOM A LA VARIABLE int azar 
               return lpalabras[azar];//POR MEDIO DE LA VARIABLE azar NOS DA UNA POSICION ALEATORIO DE LA VARIABLE TIPO ARREGLO lpalbras
   }
    
    /**
     *MÉTODO QUE SE LLENA CON EL CARACTER "-", ESTO PARA REVELAR LA LONGITUD DE LA PALABRA A ADIVINAR
     * @param palabraac
     */
    public void espaciosPalabra(String palabraac[]){//ESTE METODO REVELARA LA LONGITUD DE LA PALABRA QUE FUE ELEGIDA POR EL METODO QUE ESCOGE LA PALBRA AL AZAR
       for(int i=0;i<palabraac.length;i++){//LA VARIABLE i VALDRA CERO, ESTA LINEA LO QUE REALIZARA ES DAR LOS ESPACIOS DE LA PALABRA CUANDO TERMINA DE MEDIR LA PALBRA SALDRA DEL CICLO  
           palabraac[i] = "-"; //MIENTRAS i VAYA AUMENTANDO (ESO DEPENDE DE LA PALBRA QUE ESCOGIO EL PROGRAMA AL ALZAR) EJEMPLO SI LA PALABRA ES DE CUATRO i LLEGARA A VALER 4 ENTONCES ESTE ME TIRARA 4 ESPACIOS DE ESTOS "_"
       }
       
   }
    public String compararPalabra(char caracter,String palabraal, String palabraac[]){
       String aux = "";
       String palabran = "";
       int contador = 0;
       
       while(contador < palabraal.length()){//MIENTRAS EL CONTADOR SEA MENOR QUE EL TAMAÑO DE LA PALABRAAL SE EJECUTARA LO SIGUIENTE
           if((caracter == palabraal.charAt(contador)) && (palabraac[contador].equals("-")))//TOMAMOS LA LETRA INGRESADA Y LA COMPARAMOS POR CADA CARACTER DE LA PALABRAAL Y PALABRAAC
           {
               aux+= caracter;//IGUALAMOS AUX CON LA LETRA INGRESADA
               palabraac[contador]=aux;//IGUALAMOS CADA ESPACIO DE LA PALABRAAC CONSECUTIVAMENTE CON EL CONTENIDO DE AUX
               contador++;//LE SUMAMOS AL CONTADOR 
               aux = "";//VACIAMOS LA VARIABLE AUX , PARA PODER UTILIZARLA NUEVAMENTE EN EL SICLO
           } 
           else{
           
             contador++;//LE SUMAMOS AL CONTADOR
           }
                     
        }
       for(int i = 0; i<palabraac.length;i++){
           palabran += palabraac[i];//DECIMOS QUE PALABRAN SERA IGUALADA A CADA ESPACIO DENTRO DE PALABRAAC POR MEDIO DE CONTADOR I
       }
       return palabran;//RETORNAMOS LA VARIABLE STRING PALABRAN
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "lp{" + "lpalabras=" + lpalabras + ", palabraal=" + palabraal + ", palabraac=" + palabraac + ", caracter=" + caracter + '}';
    }
    
}

    
