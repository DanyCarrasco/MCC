/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad4.TrapecioYSimpson;

/**
 *
 * @author casa
 */
public class MatrizValores {

    private double hX;
    private double kY;
    
    private double[][] matrix;

    public MatrizValores(double limInferiorX, double limSuperiorX, double limInferiorY, double limSuperiorY, double intervalosX, double intervalosY, Funcion f) {

        this.hX = (limSuperiorX - limInferiorX) / intervalosX;                  //Diferencia entre los intervalosX
        this.kY = (limSuperiorY - limInferiorY) / intervalosY;                  //Diferencia entre los intervalosY
        
        int cantFilas = filas(limInferiorX, limSuperiorX, this.hX) + 1;         //Se suma 1 porque se cuenta la fila 0
        int cantColumnas = columnas(limInferiorY, limSuperiorY, this.kY) + 1;   //Se suma 1 porque se cuenta la columna 0
        
        this.matrix = new double[cantFilas][cantColumnas];
        crearMatrix(f, limInferiorX, limInferiorY);
    }
    
    private int filas(double inferiorX, double superiorX, double difX){
        //Devuelve la cantidad de filas necesarias de una matriz
        int cantFilas = 0;
        double auxX = inferiorX;
        while (auxX != superiorX) {
            cantFilas++;
            auxX = auxX + difX;
        }
        return cantFilas;
    }
    
    private int columnas(double inferiorY, double superiorY, double difY){
        //Devuelve la cantidad de columnas necesarias de una matriz
        int cantColumnas = 0;
        double auxX = inferiorY;
        while (auxX != superiorY) {
            cantColumnas++;
            auxX = auxX + difY;
        }
        return cantColumnas;
    }
    
    private void crearMatrix(Funcion f, double inferiorX, double inferiorY){
        //Crea y llena una matriz con los resultados de cada punto
        double auxX = inferiorX, auxY = inferiorY;
        for (int i = 0; i < this.matrix.length; i++) {
            //Para movernos de fila en fila
            for (int j = 0; j < this.matrix[i].length; j++) {
                //Para movernos de columna en columna
                this.matrix[i][j] = f.calcular(auxX, auxY);
                //Incremento X
                auxX = auxX + this.hX;
            }
            //Inicio auxX para comenzar desde el inicio de nuevo
            auxX = inferiorX;
            //Incremento Y
            auxY = auxY + this.kY;
        }
    }
    
    public void mostrarMatriz(){
        //Muestra la matriz con los resultados de cada punto
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public double encontrarValor(int numFila, int numColumna){
        //Retorna el valor ubicado en la matriz
        return this.matrix[numFila][numColumna];
    }
    
    public double getHX(){
        //Retorna la diferencia de hX
        return this.hX;
    }
    
    public double getKY(){
        //Retorna la diferencia de kY
        return this.kY;
    }
    
    public void setHX(double h){
        //Cambia la diferencia hX
        this.hX = h;
    }
    
    public void setKY(double k){
        //Cambia la diferencia kY
        this.kY = k;
    }
    
    public int getCantFilas(){
        //Retorna la cantidad de filas en la matriz
        return this.matrix.length;
    }
    
    public int getCantColumnasEnFila(int fila){
        //Retorna la cantidad de columnas en una fila indicada como parametro
        return this.matrix[fila].length;
    }
}
