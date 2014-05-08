/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.builders;

import static graphs.common.Metrics.INF;
import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class AdjacencyListBuilder extends GraphBuilder{
    protected LinkedList<Integer> vertexes [];
    
    @Override
    public void setVertexCount(int vertexCount){
        super.setVertexCount(vertexCount);
        vertexes = new LinkedList[vertexCount + 1];
        
    }
    
    @Override
    public void addEdge(int from, int to, int weight){
        if (vertexes[from] == null){
            vertexes[from] = new LinkedList<>();
        }
        vertexes[from].add(to);
    }
    
    public LinkedList<Integer> [] getGraph(){
        return vertexes;
    }
}
