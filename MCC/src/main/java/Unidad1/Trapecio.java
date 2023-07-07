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
public class Trapecio {
    public static double f(double x){
        return Math.sin(x);
    }
    
    public static void main(String[] args) {
        double a, b, h, n, num = 0;
        System.out.println("Ingrese el valor de a: ");
        a = TecladoIn.readLineDouble();
        System.out.println("Ingrese el valor de b: ");
        b = TecladoIn.readLineDouble();
        System.out.println("Ingrese la cantidad de n intervalos: ");
        n = TecladoIn.readLineDouble();
        h = (b-a)/n;
        for (double i = 1; i <= (n - 1); i++) {
            num = num + f(a+i);
        }
        num = (h/2)*(f(a) + f(b) + (2*num));
        System.out.println("La integral aproximada de la funcion es: ");
        System.out.println(num);
    }
}
