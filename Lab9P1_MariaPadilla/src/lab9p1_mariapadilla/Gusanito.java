package lab9p1_mariapadilla;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import static lab9p1_mariapadilla.Lab9P1_MariaPadilla.ran;

public class Gusanito {

    static Random ran = new Random();
    ArrayList<String> instrucciones = new ArrayList<>();//1 atributo
    char matriz[][];
    int x_manzana, y_manzana, x_gusanito, y_gusanito;

    public Gusanito(char[][] matriz, int fila, int columna) {// constructor 
        x_manzana = ran.nextInt(fila);
        y_manzana = ran.nextInt(columna);
        x_gusanito = ran.nextInt(fila);
        y_gusanito = ran.nextInt(columna);
        while (x_manzana == x_gusanito && y_manzana == y_gusanito) {
            System.out.println(" i ");
            x_manzana = ran.nextInt(fila);
            y_manzana = ran.nextInt(columna);
            x_gusanito = ran.nextInt(fila);
            y_gusanito = ran.nextInt(columna);
        }

        this.matriz = new char[fila][columna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                this.matriz[i][j] = ' ';

            }

        }
        int obstaculos = 4 + ran.nextInt(8);
        for (int i = 0; i < obstaculos; i++) {
            int x = ran.nextInt(fila);
            int y = ran.nextInt(columna);
            this.matriz[x][y] = '#';

        }

        this.matriz[x_manzana][y_manzana] = 'Ó';
        this.matriz[x_gusanito][y_gusanito] = 'G';

    }

    public void imprimir() {
        int opcion=1;
        while(opcion!=2){
        String mostrar = " ";
        String mostrar2 = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mostrar = mostrar + " [ " + matriz[i][j] + " ] ";
                mostrar += " ";
            }
            mostrar = mostrar + " \n ";

        }
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mostrar + " Matriz generada: \n " + " 1. Ingrese instruccion: \n " + " 2. Ejecutar instrucciones: "));
        if(opcion != 2) {
            instrucciones.add("nUP mueve el gusanito n elementos arriba.\n"
                    + " DN \n"
                    + " RT \n"
                    + " LT ");
             setdeinstrucciones();
             movimiento();
      
        }
        }
       
    }

    public void setdeinstrucciones() {
        String mostrar = " ";
        String mostrar2 = " ";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mostrar = mostrar + " [ " + matriz[i][j] + " ] ";
                mostrar += " ";
            }
            mostrar = mostrar + " \n ";

        }
        String movimiento = JOptionPane.showInputDialog(null, mostrar + "  Ingrese la instruccion de la forma magnitudDIRECCION ");
        instrucciones.add(movimiento);
    }

    public void movimiento() {
       
            String operacion;
            operacion = instrucciones.get(instrucciones.size()-1);
            int magnitud = Integer.parseInt(operacion.substring(0, 1));
            System.out.println(magnitud);
            String direccion=operacion.substring(1, operacion.length());
            System.out.println(direccion);
            int x=x_gusanito,y=y_gusanito;
          
            if (direccion.equals("UP")){
                if ((x-magnitud)>=0 && (x-magnitud)<=matriz.length-1){
                    matriz[x-magnitud][y]='G';
                    matriz[x][y]=' ';
                }else {
                JOptionPane.showMessageDialog(null," El rango esta afuera de la matriz ");
            }
                

        }
            if (direccion.equals("DN")){
                    if ((x+magnitud)>=0 && (x+magnitud)<=matriz.length-1){
                    matriz[x+magnitud][y]='G';
                    matriz[x][y]=' ';
                }else {
                JOptionPane.showMessageDialog(null," El rango esta afuera de la matriz ");
            }
                
        }
            if (direccion.equals("RT")){
                if ((y+magnitud)>=0 && (y+magnitud)<=matriz[0].length-1){
                    matriz[x][y+magnitud]='G';
                    matriz[x][y]=' ';
                }else {
                JOptionPane.showMessageDialog(null," El rango esta afuera de la matriz ");
            }
        }
            if (direccion.equals("LT")){
               if ((y-magnitud)>=0 && ((y-magnitud)<=matriz[0].length-1)){
                    matriz[x][y-magnitud]='G';
                    matriz[x][y]=' ';
                }else {
                JOptionPane.showMessageDialog(null," El rango esta afuera de la matriz ");
            }
        } 
            x_gusanito=x;
            y_gusanito=y;
            
            imprimir();

    }
    

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public int getX_manzana() {
        return x_manzana;
    }

    public void setX_manzana(int x_manzana) {
        this.x_manzana = x_manzana;
    }

    public int getY_manzana() {
        return y_manzana;
    }

    public void setY_manzana(int y_manzana) {
        this.y_manzana = y_manzana;
    }

    public int getX_gusanito() {
        return x_gusanito;
    }

    public void setX_gusanito(int x_gusanito) {
        this.x_gusanito = x_gusanito;
    }

    public int getY_gusanito() {
        return y_gusanito;
    }

    public void setY_gusanito(int y_gusanito) {
        this.y_gusanito = y_gusanito;
    }

}
