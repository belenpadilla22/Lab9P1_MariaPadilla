/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_mariapadilla;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;

public class Lab9P1_MariaPadilla {

    static Random ran = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Object[] opcion = {" Gusanito  ", " Salida "};
        int eleccion = JOptionPane.showOptionDialog(null, " Lab9-Q4-2023 ", " Salir ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[0]);
        String caracteres;

        int ancho, largo;

        String arreglo[];
        String tamaño = JOptionPane.showInputDialog("Ingrese las dimensiones: ");
        arreglo = tamaño.split(",");
        ancho = Integer.parseInt(arreglo[0]);
        largo = Integer.parseInt(arreglo[1]);
        if ((ancho >= ancho && largo >= largo) && (ancho >= 4 && largo <= 10)) {
            int fila = 1, columna = 1;
            char[][] matriz = new char[ancho][largo];
            Gusanito b = new Gusanito(matriz, ancho, largo);
            b.imprimir();

        }

    }
}
