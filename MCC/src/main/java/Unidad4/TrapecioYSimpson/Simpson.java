/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad4.TrapecioYSimpson;

/**
 *
 * @author casa
 */
public class Simpson {

    private MatrizValores matriz;
    private boolean sePuede;

    public Simpson(MatrizValores m) {
        this.matriz = m;
        this.sePuede = false;
    }
    
    public boolean puedeResolverse(){
        //Retorna si se puede resolver con Simpson
        if ((this.matriz.getCantFilas()%2 != 0) && (this.matriz.getCantColumnasEnFila(0)%2 != 2)) {
            //Si cumple con la condicion; cantFilas y cantColumnas son impares
            this.sePuede = true;
        }
        return this.sePuede;
    }

    public double calcularMatriz() {
        int filas = this.matriz.getCantFilas();
        double numPar = 0, numImpar = 0, resultado;
        for (int i = 1; i <= (filas - 2); i++) {
            //Suma los numeros que esta entre el fila inicial(0) y la fila final(filas-1)
            if (i % 2 == 0) {
                //Si la fila es par, se suma con los numPar
                numPar = numPar + calcularFila(i);
            } else {
                //Si la fila es impar, se suma con los numImpar
                numImpar = numImpar + calcularFila(i);
            }
        }
        //Formula de Simpson 1/3
        resultado = (this.matriz.getKY() / 3) * (calcularFila(0) + calcularFila(filas - 1) + 4 * numImpar + 2 * numPar);
        return resultado;
    }

    private double calcularFila(int numFila) {
        int columnas = this.matriz.getCantColumnasEnFila(numFila);
        double numPar = 0, numImpar = 0, resultado;
        for (int i = 1; i <= (columnas - 2); i++) {
            //Suma los numeros que esta entre el valor inicial de la fila(0) y el valor final de la fila(columna-1)
            if (i % 2 == 0) {
                //Si la columna es par, se suma con los numPar
                numPar = numPar + this.matriz.encontrarValor(numFila, i);
            } else {
                //Si la columna es impar, se suma con los numImpar
                numImpar = numPar + this.matriz.encontrarValor(numFila, i);
            }
        }
        //Formula de Simpson 1/3
        resultado = (this.matriz.getHX() / 3) * (this.matriz.encontrarValor(numFila, 0) + this.matriz.encontrarValor(numFila, (columnas - 1)) + 4 * numImpar + 2 * numPar);
        return resultado;
    }

}
