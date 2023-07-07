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
public class NR {
    public static double f(double x){
        return x;
    }
    
    public static double df(double x){
        return x;
    }
    
    public static void Newton_Rapson(){
        double x0, x1, E;
        System.out.println("Ingrese x0");
        x0 = TecladoIn.readLineDouble();
        x1 = x0;
        System.out.println("Ingrese el valor de E: ");
        E = TecladoIn.readLineDouble();
        while (Math.abs(f(x1)) > E) {
            System.out.println("x0= "+ x0);
            System.out.println("f(x0)= "+ f(x0));
            System.out.println("df(x0)= "+ df(x0));
            x1 = x0-f(x0)/df(x0);
            System.out.println("x1= "+ x1);
            x0 = x1;
        }
        System.out.println("Raiz aproximada: "+ x1); 
    }
}
