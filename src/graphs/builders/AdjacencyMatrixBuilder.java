/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.builders;

import graphs.deikstra.SearchPath;
import static graphs.common.Metrics.*;
/**
 *
 * @author Andrey
 */
public class AdjacencyMatrixBuilder extends GraphBuilder{
    protected int w[][];
    
    @Override
    public void setVertexCount(int vertexCount){
        super.setVertexCount(vertexCount);
        
        w = new int[vertexCount + 1][vertexCount + 1];
        
        for (int i = 1; i <= vertexCount; i++){
               for (int j = 1; j <= vertexCount; j++){
                   w[i][j] = INF;
               }
        }
    }
    
    @Override
    public void addEdge(int from, int to, int weight){
        w[from][to] = weight;
    }
    
    public int[][] getGraph(){
        return w;
    }

   
}
