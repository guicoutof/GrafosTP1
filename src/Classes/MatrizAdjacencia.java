/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author AlphaLegends
 */
public class MatrizAdjacencia {
    private int[][] matriz;
    private int tipoAresta; //verifica se é grafo ou digrafo

    public MatrizAdjacencia() {
    }

    public MatrizAdjacencia(int[][] Matriz, int tipo) {
        this.matriz = Matriz;
        this.tipoAresta = tipo;
    }

    public int getTipo() {
        return tipoAresta;
    }

    public void setTipo(int tipo) {
        this.tipoAresta = tipo;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] Matriz) {
        this.matriz = Matriz;
    }
    
    
    public void LerMatrizAdjacencia(Scanner sc){
        this.tipoAresta = sc.nextInt();
        int nVertices;
        nVertices = sc.nextInt();
        int[][] matriz = new int[nVertices][nVertices];
        for(int i=0;i<nVertices;i++){
            for(int j=0;j<nVertices;j++){
                matriz[i][j] = Integer.MAX_VALUE;
            }
        }
        if(this.tipoAresta == 0){//é um grafo, marcar ida e volta
            while(sc.hasNext()){
                int vertice1,vertice2,peso;
                vertice1 = sc.nextInt();
                vertice2 = sc.nextInt();
                peso = sc.nextInt();
                matriz[vertice1][vertice2] = peso;
                matriz[vertice2][vertice1] = peso;         
            }
 
        }else if(this.tipoAresta == 1){//é um digrafo, possui orientação, marcar só ida
                while(sc.hasNext()){
                    int vertice1,vertice2,peso;
                    vertice1 = sc.nextInt();
                    vertice2 = sc.nextInt();
                    peso = sc.nextInt();
                    matriz[vertice1][vertice2] = peso;
                }        
        }//end if
        this.matriz = matriz;
    }
    
    public void ExibirMatrizAdjacencia(int[][] matriz){
        System.out.print("    ");
        for(int i=0;i<matriz.length;i++){
            System.out.print(i+"     ");
        }
        System.out.println();
        for(int i=0;i<matriz.length;i++){
            System.out.print(i+" ");
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
}
