/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.traverse;

import graphs.builders.AdjacencyListBuilder;
import graphs.common.GraphLoader;


/**
 *
 * @author Andrey
 */
public class TraverseDemo {
    public TraverseDemo(){
           AdjacencyListBuilder graphBuilder = new AdjacencyListBuilder();
           GraphLoader grLoader = new GraphLoader(graphBuilder);
           
           try {
               grLoader.load("/assests/graphs/common/input.txt");
           } catch(Exception e){
               System.err.println(e.getMessage());
           }
           
           DFS dfsTraversal = new DFS(graphBuilder.getGraph());
           dfsTraversal.dfs(1);
           
           System.out.println("BFS Traverse");
           BFS bfsTraversal = new BFS(graphBuilder.getGraph());
           bfsTraversal.bfs(1);
           
    }
}
