/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadod;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrey B
 */
public class Ahorcado{
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES USADAS PARA EL PROGRAMA
        String palabraal = "";
        String palabraac [] = null;
        String aux = "";
        char caracter = 0;
        int contador = 10;
        int x = 0;
        int aciertos = 0;
        int menu1;
        int menu2;
        //MENÚ NUMERO 1, ESTE ES PARA ELEGIR SI QUIERE JUGAR O SALIR DEL JUEGO
        menu1 = Integer.parseInt(JOptionPane.showInputDialog("Elija su opción\n1. Jugar \n2. Salir del Juego" ));
        switch(menu1){
            case 1:{
                  //ESTE MENÚ FUNCIONA PARA ELEGIR LA CATEGORIA QUE EL USUARIO DESEA JUGAR     
        menu2 = Integer.parseInt(JOptionPane.showInputDialog("Menú de categorias\n1. colores\n2. paises \n3. frutas" ));
        switch(menu2){
            case 1:{//LA OPCIÓN N.1 ES LA DE COLORES 
        String lpalabras[] = {"blanco","negro","azul","rojo"};//LAS PALABRAS QUE ESTARAN EN EL CASO NUMERO 1
        lista_de_palabras pl = new lista_de_palabras(lpalabras,palabraal,palabraac,caracter);
        palabraal = pl.palabraAzar(lpalabras);
        palabraac = new String[palabraal.length()];
        pl.espaciosPalabra(palabraac);
        
        //ESTE PASO SIRVE PARA IMPRIMIR LA LONGITUD DE LA PALABRA A ADIVINAR
        JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = red>" + pl.compararPalabra(caracter, palabraal, palabraac));
        System.out.println(pl.compararPalabra(caracter, palabraal, palabraac));
        //CICLO PARA VALIDAR SI LAS LETRAS INGRESADAS SON LAS MISMAS QUE LA PALABRA A ADIVINAR
        while(contador>1){
            aux = JOptionPane.showInputDialog(null,"<html><font size = 20>" + "<html><font color = green>Ingrese la letra</font></font></html></html>");//ESTA LÍNEA FUNCIONA PARA QUE EL USUARIO INGRESE LA LETRA Y SI ES VERDADERA SE COLOCARA EN EL ESPACIO, DE LO CONTRARIO LA MISMA SERVIRA PARA INGRESAR NUEVAMENTE OTRA LETRA,ESTA FUNCIONARA HASTA QUE GANE O PIERDA 
            caracter = aux.charAt(0);//EL JOPTIONPANE GUARDA EL CARACTER COMO STRING ENTONCES AQUI SE CONVIERTE EN CARACTER
            int contadorn = 0;//VARIABLE QUE FUNCIONA SOLO EN ESTE CICLO
            //CILCO QUE COMPRUEBA SI LA LETRA ESTA EN LA PALABRA A ADIVINAR ENTONCE EL LO SUSTITUIRA EL SIMBOLO - POR EL CARACTER QUE VA EN LA PALABRA
            while(contadorn < palabraal.length()){
                if((caracter == palabraal.charAt(contadorn)) && (palabraac[contadorn].equals("-"))){
                    contadorn++;
                    aciertos++;
                }else//SI EL CARACTER ES VERDADERO EL CICLO SIGUE DE LO CONTARIO SE DEVOLVERA A PEDIR OTRA LETRA
                contadorn++;
            }
            System.out.println(pl.compararPalabra(caracter, palabraal, palabraac));//ACA IMPRIMIRE EL CARACTER INGRESADO E INDICARA CUALES FALTAN
            contador = contador - 1;//ESTE SIRVE PARA QUITAR UNA OPORTUNIDAD
            //ESTE CICLO SIRVE PARA QUE CUANDO COMPLETE LA PALABRA NO  SIGA SOLICITANDO MAS CARACCTERES
            if(aciertos==palabraal.length()){
                contador = contador - 11;
            }
        }
         if(aciertos==palabraal.length()){//AQUI INDICA QUE SI TODOS LOS CARACTERES PUESTOS SON IGUALES QUE LA PALBRA A ADIVINAR IMPRIMA QUE GANO O PERDIO
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has ganado felicidades!</font></font></html></html>");//ESTA LINEA INFORMA SI GANAS
         }else
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has perdido!</font></font></html></html>");//ESTA LINEA INFORMA SI PIERDES
       
            }break;//ACA TERMINA EL CICLO Y CASO 1 DEL MENU1
                
        case 2:{//LA OPCIÓN N.2 ES LA DE LOS PAISES 
        String ñpalabras[] = {"alemania","polonia","portugal","brasil"};//LAS PALABRAS QUE ESTARAN EN EL CASO NUMERO 2
        lista_de_palabras ll = new lista_de_palabras(ñpalabras,palabraal,palabraac,caracter);
        palabraal = ll.palabraAzar(ñpalabras);
        palabraac = new String[palabraal.length()];
        ll.espaciosPalabra(palabraac);
        
        //ESTE PASO SIRVE PARA IMPRIMIR LA LONGITUD DE LA PALABRA A ADIVINAR
        JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = red>" + ll.compararPalabra(caracter, palabraal, palabraac));
        System.out.println(ll.compararPalabra(caracter, palabraal, palabraac));
        
       
        //CICLO PARA VALIDAR SI LAS LETRAS INGRESADAS SON LAS MISMAS QUE LA PALABRA A ADIVINAR   
        while(contador>1){
            aux = JOptionPane.showInputDialog(null,"<html><font size = 20>" + "<html><font color = green>Ingrese la letra</font></font></html></html>");//ESTA LÍNEA FUNCIONA PARA QUE EL USUARIO INGRESE LA LETRA Y SI ES VERDADERA SE COLOCARA EN EL ESPACIO, DE LO CONTRARIO LA MISMA SERVIRA PARA INGRESAR NUEVAMENTE OTRA LETRA,ESTA FUNCIONARA HASTA QUE GANE O PIERDA 
            caracter = aux.charAt(0);//EL JOPTIONPANE GUARDA EL CARACTER COMO STRING ENTONCES AQUI SE CONVIERTE EN CARACTER
            int contadorn = 0;//VARIABLE QUE FUNCIONA SOLO EN ESTE CICLO
            //CILCO QUE COMPRUEBA SI LA LETRA ESTA EN LA PALABRA A ADIVINAR ENTONCE EL LO SUSTITUIRA EL SIMBOLO - POR EL CARACTER QUE VA EN LA PALABRA
            while(contadorn < palabraal.length()){
                if((caracter == palabraal.charAt(contadorn)) && (palabraac[contadorn].equals("-"))){
                    contadorn++;
                    aciertos++;
                }else//SI EL CARACTER ES VERDADERO EL CICLO SIGUE DE LO CONTARIO SE DEVOLVERA A PEDIR OTRA LETRA
                contadorn++;
            }
            System.out.println(ll.compararPalabra(caracter, palabraal, palabraac));//ACA IMPRIMIRE EL CARACTER INGRESADO E INDICARA CUALES FALTAN
            contador = contador - 1;//ESTE SIRVE PARA QUITAR UNA OPORTUNIDAD
            //ESTE CICLO SIRVE PARA QUE CUANDO COMPLETE LA PALABRA NO  SIGA SOLICITANDO MAS CARACCTERES
            if(aciertos==palabraal.length()){
                contador = contador - 11;
            }
        }
         if(aciertos==palabraal.length()){//AQUI INDICA QUE SI TODOS LOS CARACTERES PUESTOS SON IGUALES QUE LA PALBRA A ADIVINAR IMPRIMA QUE GANO O PERDIO
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has ganado felicidades!</font></font></html></html>");//ESTA LINEA INFORMA SI GANAS
         }else
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has perdido!</font></font></html></html>");//ESTA LINEA INFORMA SI PIERDES
    
        }break;//ACA TERMINA EL CICLO Y CASO 2 DEL MENU2

    case 3:{//LA OPCIÓN N.3 ES LA DE LAS FRUTAS 
        String kpalabras[] = {"uva","sandia","fresa","mango"};//LAS PALABRAS QUE ESTARAN EN EL CASO NUMERO 3
        lista_de_palabras lo = new lista_de_palabras(kpalabras,palabraal,palabraac,caracter);
        palabraal = lo.palabraAzar(kpalabras);
        palabraac = new String[palabraal.length()];
        lo.espaciosPalabra(palabraac);
        
        //ESTE PASO SIRVE PARA IMPRIMIR LA LONGITUD DE LA PALABRA A ADIVINAR
        JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = red>" + lo.compararPalabra(caracter, palabraal, palabraac));
        System.out.println(lo.compararPalabra(caracter, palabraal, palabraac));
        //CICLO PARA VALIDAR SI LAS LETRAS INGRESADAS SON LAS MISMAS QUE LA PALABRA A ADIVINAR
        while(contador>1){
            aux = JOptionPane.showInputDialog(null,"<html><font size = 20>" + "<html><font color = green>Ingrese la letra</font></font></html></html>");//ESTA LÍNEA FUNCIONA PARA QUE EL USUARIO INGRESE LA LETRA Y SI ES VERDADERA SE COLOCARA EN EL ESPACIO, DE LO CONTRARIO LA MISMA SERVIRA PARA INGRESAR NUEVAMENTE OTRA LETRA,ESTA FUNCIONARA HASTA QUE GANE O PIERDA 
            caracter = aux.charAt(0);//EL JOPTIONPANE GUARDA EL CARACTER COMO STRING ENTONCES AQUI SE CONVIERTE EN CARACTER
            int contadorn = 0;//VARIABLE QUE FUNCIONA SOLO EN ESTE CICLO
            //CILCO QUE COMPRUEBA SI LA LETRA ESTA EN LA PALABRA A ADIVINAR ENTONCE EL LO SUSTITUIRA EL SIMBOLO - POR EL CARACTER QUE VA EN LA PALABRA
            while(contadorn < palabraal.length()){
                if((caracter == palabraal.charAt(contadorn)) && (palabraac[contadorn].equals("-"))){
                    contadorn++;
                    aciertos++;
                }else//SI EL CARACTER ES VERDADERO EL CICLO SIGUE DE LO CONTARIO SE DEVOLVERA A PEDIR OTRA LETRA
                contadorn++;
            }
            System.out.println(lo.compararPalabra(caracter, palabraal, palabraac));//ACA IMPRIMIRE EL CARACTER INGRESADO E INDICARA CUALES FALTAN
            contador = contador - 1;//ESTE SIRVE PARA QUITAR UNA OPORTUNIDAD
            //ESTE CICLO SIRVE PARA QUE CUANDO COMPLETE LA PALABRA NO  SIGA SOLICITANDO MAS CARACCTERES
            if(aciertos==palabraal.length()){
                contador = contador - 11;
            }
        }
         if(aciertos==palabraal.length()){//AQUI INDICA QUE SI TODOS LOS CARACTERES PUESTOS SON IGUALES QUE LA PALBRA A ADIVINAR IMPRIMA QUE GANO O PERDIO
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has ganado felicidades!</font></font></html></html>");//ESTA LINEA INFORMA SI GANAS
         }else
             JOptionPane.showMessageDialog(null,"<html><font size = 20>" + "<html><font color = blue> ¡Has perdido!</font></font></html></html>");//ESTA LINEA INFORMA SI PIERDES
    }break;//ACA TERMINA EL CICLO Y CASO 3 DEL MENÚ2
        
    
    
        }
     } 
      case 2:{
             JOptionPane.showMessageDialog(null,"Has terminado el juego");
                }break;      
    }
            }
            

    
    }