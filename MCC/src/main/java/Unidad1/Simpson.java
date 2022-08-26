/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

import Util.TecladoIn;

/**
 *
 * @author casa
 */
public class Simpson {

    public static double f(double x) {
        return Math.tan(x);
    }

    public static void main(String[] args) {
        double a, b, h, n, num, impar = 0, par = 0, cantPuntos = 0;
        System.out.println("Ingrese el valor de a: ");
        a = TecladoIn.readLineDouble();
        System.out.println("Ingrese el valor de b: ");
        b = TecladoIn.readLineDouble();
        System.out.println("Ingrese la cantidad de n intervalos: ");
        n = TecladoIn.readLineDouble();
        h = (b - a) / n;
        for (double i = a; i <= b; i = i + h) {
            cantPuntos++;
        }
        if (((n % 2) == 0) && (cantPuntos % 2 != 0)) {
            for (double i = 1; i <= (n - 1); i++) {
                if ((i % 3) == 0) {
                    impar = impar + f(a + i);
                }
            }
            for (double j = 2; j <= (n - 2); j++) {
                if ((j % 2) == 0) {
                    par = par + f(a + j);
                }
            }
            num = (h / 3) * (f(a) + f(b) + (4 * impar) + (2 * par));
            System.out.println("La integral aproximada de la funcion es: ");
            System.out.println(num);
        } else {
            System.out.println("No se cumple la condicion inicial cantidad de puntos deben ser impares >= 3 y n debe ser par >= 2");
        }
    }
}
