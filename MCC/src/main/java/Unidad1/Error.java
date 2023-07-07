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
public class Error {

    public Error() {
    }

    public static void main(String[] args) {
        double valorReal, valorObtenido;
        System.out.println("Ingrese el valor real:");
        valorReal = TecladoIn.readLineDouble();
        System.out.println("Ingrese el valor obtenido:");
        valorObtenido = TecladoIn.readLineDouble();
        System.out.println("");
        System.out.println("El error absoluto es: "+ calcularAbsolutoLocal(valorReal, valorObtenido));
        System.out.println("El error relativo es: "+ calcularRelativoLocal(valorReal, valorObtenido));
        System.out.println("El error relatico porcentual es: " + calcularRelaticoPorcentualLocal(valorReal, valorObtenido));
    }

    public double calcularAbsoluto(double valorR, double valorObtenido){
        return Math.abs(valorR - valorObtenido);
    }
    
    public double calcularRelativo(double valorR, double valorObtenido){
        return (Math.abs(valorR - valorObtenido) / valorR);
    }
    
    public double calcularRelativoPorcentual(double valorR, double valorObtenido) {
        return ((Math.abs(valorR - valorObtenido) / valorR) * 100);
    }
    
    public static double calcularAbsolutoLocal(double valorR, double valorObtenido){
        return Math.abs(valorR - valorObtenido);
    }
    
    public static double calcularRelativoLocal(double valorR, double valorObtenido){
        return Math.abs(valorR - valorObtenido) / valorR;
    }
    
    public static double calcularRelaticoPorcentualLocal(double valorR, double valorObtenido) {
        return ((Math.abs(valorR - valorObtenido) / valorR) * 100);
    }
}
