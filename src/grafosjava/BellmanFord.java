/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosjava;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Takeshi
 */
public class BellmanFord {
    ArrayList<Vertice> vertices;
    ArrayList<Aresta> arestas;
    
    public BellmanFord(ArrayList<Vertice> vertices, ArrayList<Aresta> arestas){
        this.vertices = vertices;
        this.arestas = arestas;
    }
    
    public void menorCaminho(Vertice origem, Vertice destino){
        
        origem.distanciaMinima = 0;
        for(int i=0; i<vertices.size()-1;i++){
            for(Aresta aresta : arestas){
                if(aresta.getInicio().distanciaMinima == Double.MAX_VALUE)continue;
                Vertice x = aresta.getInicio();
                Vertice y = aresta.getFim();
                
                double novaDistancia = x.distanciaMinima + aresta.getPeso();
                
                if(novaDistancia < y.distanciaMinima){
                    y.distanciaMinima = novaDistancia;
                    y.anterior = x;
                }
            }
        }
        for(Aresta aresta: arestas)
        {
            if(aresta.getInicio().distanciaMinima != Double.MAX_VALUE)continue;
                if(temNegativo(aresta))
                {
                    System.out.println("Aresta negativa detectada");
                    return;
                }
        }
        if(destino.distanciaMinima == Double.MAX_VALUE)
        {
            System.out.println("Não existem caminhos de origem ao destino");
        }
        else
        {
            System.out.println("O menor caminho é: "+destino.distanciaMinima);
        }
        
        ArrayList<Vertice> listVertice = new ArrayList<Vertice>();
        for(Vertice vertice = destino; vertice !=null; vertice = vertice.anterior)
            listVertice.add(vertice);
        Collections.reverse(listVertice);
        for(int i=0; i<listVertice.size();i++){
            System.out.println(listVertice.get(i).getDados());
        }
    }
    
    private boolean temNegativo(Aresta aresta){
        return (aresta.getInicio().distanciaMinima + aresta.getPeso() < aresta.getFim().distanciaMinima);
    }
    
    
    
    
}
