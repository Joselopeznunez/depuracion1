/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probas;

import java.util.*;
import java.lang.*;

/**
 *
 * @author josnun
 */
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pos = 0, contPosiciones = 0;

        System.out.print("Introduce una cadena: ");
        String texto = teclado.nextLine();

        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);

        do {
            pos = texto.indexOf(caracter, pos);
            if (pos != -1) {
                contPosiciones++;
                pos++;
            }
                                                         //si la encuentra, la cuenta
                                                            //pasa a la siguiente posición
        } while (pos != -1);                            //termina cuando no la encuentre más
        System.out.print("El caracter aparece " + contPosiciones + " veces");
    }
}
