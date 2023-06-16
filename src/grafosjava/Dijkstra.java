/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosjava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
/**
 *
 * @author Takeshi
 */
public class Dijkstra {
    public void processaCaminho(Vertice origem)
    {
		origem.distanciaMinima = 0.;
        PriorityQueue<Vertice> filaVertice = new PriorityQueue<Vertice>();
        filaVertice.add(origem);
	
		while (!filaVertice.isEmpty()) {
			Vertice verticeAux = filaVertice.poll();
	
            // Visita se existir aresta ligada ao vertice
            for (Aresta e : verticeAux.arestaSaida)
            {
                Vertice v = e.getFim();
                double custo = e.getPeso();
                double distanciaMinima = verticeAux.distanciaMinima + custo;
				if (distanciaMinima < v.distanciaMinima) {
					filaVertice.remove(v);
		
				    v.distanciaMinima = distanciaMinima ;
				    v.anterior = verticeAux;
				    filaVertice.add(v);
				}
            }
        }
    }

    public ArrayList<Vertice> getMenorCaminho(Vertice destino)
    {
    	ArrayList<Vertice> listVertice = new ArrayList<Vertice>();
        for (Vertice vertice = destino; vertice != null; vertice = vertice.anterior)
        	listVertice.add(vertice);

        Collections.reverse(listVertice);
        return listVertice;
    }
}
