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
    private String palabras[];

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public String getPalabraE() {
        return palabraE;
    }

    public void setPalabraE(String palabraE) {
        this.palabraE = palabraE;
    }

    public String[] getPalabraF() {
        return palabraF;
    }

    public void setPalabraF(String[] palabraF) {
        this.palabraF = palabraF;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    private String palabraE;
    private String palabraF[];
    private char letra;
    
public String escogerpalabra(String palabra[]){
       int aleatoria = (int) (Math.random()*4);
               return palabra[aleatoria];
               
   }
}
