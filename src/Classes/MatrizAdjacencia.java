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
    private int tipo; //verifica se é grafo ou digrafo

    public MatrizAdjacencia() {
    }

    public MatrizAdjacencia(int[][] Matriz, int tipo) {
        this.matriz = Matriz;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] Matriz) {
        this.matriz = Matriz;
    }
    
    
    public void LerMatrizAdjacencia(Scanner sc){
        this.tipo = sc.nextInt();
        int n;
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = Integer.MAX_VALUE;
            }
        }
        if(this.tipo == 0){//é um grafo, marcar ida e volta
            while(sc.hasNext()){
                int x,y;
                x = sc.nextInt();
                y = sc.nextInt();
                n = sc.nextInt();
                matriz[x][y] = n;
                matriz[y][x] = n;         
            }
 
        }else if(this.tipo == 1){//é um digrafo, possui orientação, marcar só ida
                while(sc.hasNext()){
                    int x,y;
                    x = sc.nextInt();
                    y = sc.nextInt();
                    n = sc.nextInt();
                    matriz[x][y] = n;
                }        
        }//end if
        this.matriz = matriz;
    }
    
    public void ExibirMatrizAdjacencia(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void BuscaProfundidade(int[][] matriz,int raiz){
        int[] cor = new int[matriz.length];
        int[] d = new int[matriz.length];
        int[] f = new int[matriz.length];
        for(int i=0;i<matriz.length;i++){
            cor[i] = 0; //0 = branco
        }
        int tempo = 0;
        for(int i=raiz;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]!=0){
                    if(cor[i]==0){
                      cor[i] = 1;//1 = cinza
                      tempo++;
                      
                    }
                    
                }
            }
        }
       
    }
    

    
    
    
    
}
