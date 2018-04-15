/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author AlphaLegends
 */
public class Vertice extends ListaAdjacencia{
    private int vertice;
    private int valor;

    public Vertice() {
    }

    public Vertice(int vertice, int valor) {
        this.vertice = vertice;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int getVertice() {
        return vertice;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }
    
    public String exibir(){
        String msg = "aresta " + vertice + " valor " + valor+" ";
        return msg;
    }
    
}
