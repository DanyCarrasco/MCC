/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

import Util.TecladoIn;

/**
 *
 * @author casa
 */
public class Biseccion {

    public static double f(double x) {
        //Ingresar la funcion a evaluar
        return 80 * Math.exp(-2 * x) + 20 * Math.exp(-0.5 * x) - 7;
    }

    public static void main(String[] args) {
        double a, b, E, r = 0;
        System.out.println("Ingrese el valor de a: ");
        a = TecladoIn.readLineDouble();
        System.out.println("Ingrese el valor de b: ");
        b = TecladoIn.readLineDouble();
        System.out.println("ingrese el calor del error E: ");
        E = TecladoIn.readLineDouble();
        System.out.println();
        if ((f(a) * f(b)) < 0) {
            do {
                r = (a + b) / 2;
                System.out.println(r);
                if ((f(a) * f(r)) < 0) {
                    b = r;
                } else {
                    a = r;
                }
            } while (Math.abs(f(r)) <= E);
            System.out.println("Raiz aproximada: " + r);
        } else {
            System.out.println("No se cumple la condicion inicial f(a)*f(b)<0");
        }
    }
}
