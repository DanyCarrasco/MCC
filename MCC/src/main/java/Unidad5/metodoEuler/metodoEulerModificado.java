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
public class metodoEulerModificado {

    private EcuacionDiferencial eDiferencial;
    private Ecuacion ecuacion;
    private Error error;

    public metodoEulerModificado(EcuacionDiferencial ed, Ecuacion e, Error error) {
        this.eDiferencial = ed;
        this.ecuacion = e;
        this.error = error;
    }

    public void calcular(double x0, double y0, double h, double rangoInferior, double rangoSuperior) {
        double auxX = x0, auxYEuler = y0, auxYEModificado = y0, auxY, auxYReal = y0;
        double ultimoI = ultimoI(h, rangoInferior, rangoSuperior);
        for (double i = 0; i <= ultimoI; i++) {
            System.out.println("El resultado de y (Euler) " + i + "(x" + i + ") = y" + i + "(" + auxX + ") = " + auxYEuler);
            System.out.println("El resultado de y (Euler Modificado) " + i + "(x" + i + ") = y" + i + "(" + auxX + ") = " + auxYEModificado);
            auxYReal = ecuacion.calcular(auxX, auxYReal);
            System.out.println("El resultado verdadero: " + auxYReal);
            System.out.println("Error relativo porcentual (Euler): " + error.calcularRelativoPorcentual(auxYReal, auxYEuler));
            System.out.println("Error relativo porcentual (Euler Modificado): " + error.calcularRelativoPorcentual(auxYReal, auxYEModificado));
            System.out.println("");
            auxY = auxYEuler;
            auxYEuler = auxY + h * (eDiferencial.calcular(auxX, auxY));
            auxYEModificado = auxY + (h/2)*(eDiferencial.calcular(auxX, auxY) + eDiferencial.calcular(auxX, auxYEuler));
            auxX = auxX + h;
        }
    }

    private double ultimoI(double diferenciaX, double rangoInferior, double rangoSuperior) {
        return (rangoSuperior - rangoInferior) / diferenciaX;
    }
}
