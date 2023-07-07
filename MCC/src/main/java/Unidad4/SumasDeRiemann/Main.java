/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad4.SumasDeRiemann;

import Util.TecladoIn;

/**
 *
 * @author casa
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("El resultado es:");
        System.out.println(sumRiemann(0, 2, 0, 1, 4, 4));
    }

    public static double sumRiemann(double x1, double x2, double y1, double y2, int m, int n) {
        /*Modulo que realiza la sumatoria de Riemann para areas rectangulares.
          Parametros de entrada:
          x1: primer extremo del intervalo en el eje x
          x2: segundo extremo del intervalo en el eje x
          y1: primer extremo del intervalo en el eje y
          y2: segundo extremo del intervalo en el eje x
          m: cantidad de divisiones en x
          n: cantidad de divisiones en y           */

        double variacion_x, variacion_y, area, resultado = 0, i, j;
        variacion_x = (x2 - x1) / m;
        variacion_y = (y2 - y1) / n;
        area = variacion_x * variacion_y;
        if (x1 == 0) {
            i = x1 + variacion_x;
        } else {
            i = x1;
        }
        if (y1 == 0) {
            j = y1 + variacion_y;
        } else {
            j = y1;
        }

        while (i <= x2) {
            while (j <= y2) {
                resultado += funcion(i, j) * area;
                j += variacion_y;
            }
            i += variacion_x;
            j = variacion_y;
        }
        return resultado;
    }

    public static double funcion(double x, double y) {
        return Math.pow(x,2) +4*Math.pow(y,2);
    }
}
