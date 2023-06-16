
package grafosjava;

/**
 *
 * @author Takeshi
 */
public class Aresta{
    
    int peso;
    Vertice inicio;
    Vertice fim;

    public Aresta(int peso, Vertice inicio, Vertice fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }

    public Vertice getFim() {
        return fim;
    }

    public void setFim(Vertice fim) {
        this.fim = fim;
    }

 
    
    
    
    
    
}
