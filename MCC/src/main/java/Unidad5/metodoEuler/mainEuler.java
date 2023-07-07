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
public class mainEuler {

    public static void main(String[] args) {
        EcuacionDiferencial eD = new EcuacionDiferencial();
        Ecuacion ecuacion = new Ecuacion();
        Error error = new Error();
        metodoEulerModificado metodo = new metodoEulerModificado(eD, ecuacion, error);
        metodo.calcular(0, -3, 0.2, 0, 1);
    }
}
