/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlphaLegends
 */
public class ListaAdjacencia {
     ArrayList<Vertice> lista;
     private int vertice;
    
    public ListaAdjacencia() {
    
    }

    public ListaAdjacencia(int vertice) {
        this.lista = new ArrayList<Vertice>();
        this.vertice = vertice;
    }

    public ArrayList<Vertice> getLista() {
        return lista;
    }

    public int getVertice() {
        return vertice;
    }

    public void setLista(ArrayList<Vertice> lista) {
        this.lista = lista;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }
   
    public void AdicionarVertice(int vertice,int valor){
        Vertice v = new Vertice(vertice, valor);
        this.lista.add(v);
        
    };
    
    public Vertice BuscarVertice(int vertice){
        for(int i=0;i<lista.size();i++ ){
            if(lista.get(i).getVertice() == vertice) return lista.get(i);
        }
        
        return null;
    }
    
    public void RemoverVertice(Vertice v){
        this.lista.remove(v);
    }
    
}
