/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad4.TrapecioYSimpson;

/**
 *
 * @author casa
 */
public class Trapecio {

    private MatrizValores matriz;

    public Trapecio(MatrizValores m) {
        this.matriz = m;
    }

    public double calcularMatriz() {
        int filas = this.matriz.getCantFilas();
        double num = 0, resultado;
        for (int i = 1; i <= (filas - 2); i++) {
            //Suma los numeros que esta entre el fila inicial(0) y la fila final(filas-1)
            num = num + calcularFila(i);
        }
        //Formula de Trapecio
        resultado = (this.matriz.getKY() / 2) * (calcularFila(0) + calcularFila(filas - 1) + 2 * num);
        return resultado;
    }

    private double calcularFila(int numFila) {
        //Calcula la fila ingresada como parametro
        int columnas = this.matriz.getCantColumnasEnFila(numFila);
        double num = 0, resultado;
        for (int i = 1; i <= (columnas - 2); i++) {
            //Suma los numeros que esta entre el valor inicial de la fila(0) y el valor final de la fila(columna-1)
            num = num + this.matriz.encontrarValor(numFila, i);
        }
        //Formula de Trapecio
        resultado = (this.matriz.getHX() / 2) * (this.matriz.encontrarValor(numFila, 0) + this.matriz.encontrarValor(numFila, (columnas - 1)) + 2 * num);
        return resultado;
    }
}
