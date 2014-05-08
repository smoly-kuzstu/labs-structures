/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.builders;

/**
 *
 * @author Andrey
 */
public abstract class GraphBuilder {
    protected String[] graphParams;
    protected int vertexCount;
    
    public GraphBuilder(){
        
    }
    
    public void setVertexCount(int vertexCount){
        this.vertexCount = vertexCount;
    }
    
    public int getVertexCount(){
        return this.vertexCount;
    }
    
    public abstract void addEdge(int from, int to, int weight);

    /**
     * @return the graphParams
     */
    public String[] getGraphParams() {
        return graphParams;
    }

    /**
     * @param graphParams the graphParams to set
     */
    public void setGraphParams(String[] graphParams) {
        this.graphParams = graphParams;
    }
    
}
