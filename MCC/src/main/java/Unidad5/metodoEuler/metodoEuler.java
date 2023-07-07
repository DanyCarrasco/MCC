/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad5.metodoEuler;

import Unidad1.Error;

/**
 *
 * @author casa
 */
public class metodoEuler {

    private EcuacionDiferencial eDiferencial;
    private Ecuacion ecuacion;
    private Error error;

    public metodoEuler(EcuacionDiferencial ed, Ecuacion e, Error error) {
        this.eDiferencial = ed;
        this.ecuacion = e;
        this.error = error;
    }

    public void calcular(double x0, double y0, double h, double rangoInferior, double rangoSuperior) {
        double auxX = x0, auxYObtenido = y0, aux, auxYReal = y0;
        double ultimoI = ultimoI(h, rangoInferior, rangoSuperior);
        for (double i = 0; i <= ultimoI; i++) {
            System.out.println("El resultado de y" + i + "(x" + i + ") = y" + i + "(" + auxX + ") = " + auxYObtenido);
            auxYReal = ecuacion.calcular(auxX, auxYReal);
            System.out.println("El resultado verdadero: " + auxYReal);
            System.out.println("Error relativo porcentual: "+ error.calcularRelativoPorcentual(auxYReal, auxYObtenido));
            System.out.println("");
            auxYObtenido = auxX + h * (eDiferencial.calcular(auxX, auxYObtenido));
            auxX = auxX + h;
        }
    }

    private double ultimoI(double diferenciaX, double rangoInferior, double rangoSuperior) {
        return (rangoSuperior - rangoInferior) / diferenciaX;
    }
}
