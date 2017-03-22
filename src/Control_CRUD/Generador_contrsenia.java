/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_CRUD;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jefferson
 */
public class Generador_contrsenia {

    
    public static String Contrasenia() {
        //char que almacenará una letra aleatoria.
        char letra;       
        //pass es el String que almacenará la contraseña final.
        String pass = "", texto = "";       
        //'num' y 'aleatorio' almacenarán números aleatorios.
        //'repet' es la cantidad de veces que se repetirá el bucle de la contraseña.
        int num, repet, aleatorio;       
        //Método que permitirá crear un número aleatorio.
        Random r = new Random();       
        //Pedimos la cantidad de caracteres.
        texto ="7";
        //Le asignamos dicha cifra a la variable 'repet'
        repet = Integer.parseInt(texto);       
        //Comenzamos el bucle para crear la contraseña.
        for(int i = 1; i <= repet; i++)
        {  
            //Creamos un número aleatorio del 1 al 3
            aleatorio = r.nextInt(3)+1;           
            //Si el número es 1 crearemos un número aleatorio
            if(aleatorio == 1)
            {
                //Hacemos llamado al método 'randomNum' y le asignamos el valor que devolverá a la variable 'num'.
                num = randomNum();
                //Concatenamos el número que recibimos con el resto de la cadena que llevamos.
                pass += String.valueOf(num);
            }           
            //Si el número es 2 crearemos una letra minúscula aleatoria
            if(aleatorio == 2)
            {
                //Hacemos llamado al método 'randomLetraMinus' y le asignamos el char que devolverá a la variable 'letra'.
                letra = randomLetraMinus();
                //Concatenamos el char que recibimos con el resto de la cadena que llevamos.
                pass += String.valueOf(letra);
            }           
            //Si el número es 3 crearemos una letra mayúscula aleatoria
            if(aleatorio == 3)
            {
                //Hacemos llamado al método 'randomLetraMayus' y le asignamos el char que devolverá a la variable 'letra'.
                letra = randomLetraMayus();
                //Concatenamos el char que recibimos con el resto de la cadena que llevamos.
                pass += String.valueOf(letra);
            }          
        }       
        //Imprimimos en pantalla la contraseña.
        //JOptionPane.showMessageDialog(null, "La contraseña es: "+pass);
       return pass;
    }

    private static int randomNum() {
        Random r = new Random();
        int aleatorio = r.nextInt(9)+1;
        return aleatorio;     
    }

    private static char randomLetraMinus() {
        char a;
       
        Random r = new Random();
        double aleatorio = Math.floor(Math.random()*(122-97+1)+97);
       
        a = (char)aleatorio;
       
        return a;
    }

    private static char randomLetraMayus() {
        char a;
       
        Random r = new Random();
        double aleatorio = Math.floor(Math.random()*(90-65+1)+65);
       
        a = (char)aleatorio;
       
        return a;
    }
   
}