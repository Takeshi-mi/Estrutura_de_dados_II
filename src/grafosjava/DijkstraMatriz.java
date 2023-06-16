/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosjava;

/**
 *
 * @author Takeshi
 */
public class DijkstraMatriz {
    public void menorCaminho(int[][] matriz)
    {
        int grafo[][] = matriz; 
        int visitado[] =  new int[6];
        int min = 999;
        int proximo = 0;
        int procedente[] = new int[6];
        int distancia[] = new int[6];
        System.out.println("Distáncia mínima da origem até o destino");
        for(int i =0;i<6;i++)
        {
              visitado[i]=0;
              procedente[i]=0;
              for(int j=0;j<6;j++)
              {
                  if(grafo[i][j]==0)
                  {
                      grafo[i][j]=999;
                  }
              }
        }
        distancia = grafo[0];
        visitado[0] = 1;
        distancia[0] = 0;
        
        for(int cont=0;cont<6;cont++)
        {
            min = 999;
            for(int i=0;i<6;i++)
            {
                if(min>distancia[i] && visitado[i]!=1)
                {
                    min=distancia[i];
                    proximo = i;
                                      
                }
            }
            visitado[proximo] = 1;
            for(int i=0;i<6;i++)
            {
                if(visitado[i]!=1)
                {
                   
                    if(min+grafo[proximo][i]<distancia[i])
                    {
                        procedente[i] =grafo[proximo][i];
                        distancia[i] = min+grafo[proximo][i];
                    }
                    
                }
            }
        }
        for(int i=0;i<6;i++)
        {
            System.out.println(i+"ª distância do vertice a partir da origem "+distancia[i]);
            System.out.println("procedente"+procedente[i]);
        }
    }
}