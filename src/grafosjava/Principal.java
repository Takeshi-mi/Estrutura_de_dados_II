package grafosjava;

import java.util.ArrayList;

/**
 *
 * @author Afranio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Grafos grafo = new Grafos();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");
        
        grafo.adicionarAresta(43, "A", "B");
        grafo.adicionarAresta(15, "A", "C");
        grafo.adicionarAresta(3, "B", "D");
        grafo.adicionarAresta(-2, "C", "B");
        grafo.adicionarAresta(12, "C", "D");
        grafo.adicionarAresta(4, "C", "E");
        grafo.adicionarAresta(-5, "D", "E");
        grafo.adicionarAresta(7, "D", "F");
        grafo.adicionarAresta(8, "E", "F");
        
//        System.out.println("Busca em Largura: ");
//        grafo.buscaEmLargura();
//        System.out.println("=================");
//        System.out.println("Matriz em Adjacencia");
//        grafo.gerarMatrizAdjacencia();
//        System.out.println("=================");
//        
//        System.out.println("Dijkstra:");
//        Dijkstra dij = new Dijkstra();
//        dij.processaCaminho(grafo.getVertice("A")); // chamando
        
//        ArrayList<Vertice> caminho = dij.getMenorCaminho(grafo.getVertice("F"));
       
//        for(int i=0; i<caminho.size();i++){
//            System.out.println(caminho.get(i).getDados());
//        }
//        System.out.println("=================");
        
        
//        System.out.println("DijkstraMatriz");
//        DijkstraMatriz djMat = new DijkstraMatriz();
//        djMat.menorCaminho(grafo.gerarMatrizAdjacencia());

          System.out.println("Bellman Ford");
          BellmanFord bf = new BellmanFord(grafo.vertices,grafo.arestas);
          bf.menorCaminho(grafo.getVertice("A"), grafo.getVertice("F"));
          
    }   
    
}
