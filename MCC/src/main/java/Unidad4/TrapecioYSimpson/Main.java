/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad4.TrapecioYSimpson;

/**
 *
 * @author casa
 */
public class Main {

    public static void main(String[] args) {
        Funcion f = new Funcion();
        MatrizValores matriz = new MatrizValores(0, 0.5, 0, 0.5, 4, 4, f);
        Trapecio trapecio = new Trapecio(matriz);
        Simpson simpson = new Simpson (matriz);
        matriz.mostrarMatriz();
        System.out.println("");
        System.out.println(trapecio.calcularMatriz());
        if (simpson.puedeResolverse()) {
            System.out.println(simpson.calcularMatriz());
        }
    }
}
