/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.deikstra;

import graphs.builders.AdjacencyMatrixBuilder;
import graphs.common.GraphLoader;
import graphs.common.PathInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sun.misc.IOUtils;

/**
 *
 * @author Andrey
 */
public class DemoDeijkstra {
    public DemoDeijkstra(){
        readFile();
    }
    
    protected void readFile(){
        
           AdjacencyMatrixBuilder graphBuilder = new AdjacencyMatrixBuilder();
           GraphLoader grLoader = new GraphLoader(graphBuilder);
           
           try {
               grLoader.load("/assests/graphs/deikstra/input.txt");
           } catch(Exception e){
               System.err.println(e.getMessage());
           }
           
           int sourceVertex = Integer.parseInt(graphBuilder.getGraphParams()[1]);
           int gSize = graphBuilder.getVertexCount();
           SearchPath deikstaraPath = new SearchPath(gSize, graphBuilder.getGraph());
           
           int d[] = deikstaraPath.calculateDistances(sourceVertex);
           for (int i = 1; i <= gSize ; i++){
              System.out.printf("Distance to %d is %d \n", i, d[i]);
           }
           
           PathInfo<Integer> paths[] = deikstaraPath.getPaths(sourceVertex);
           for (int i = 1; i <= gSize ; i++){
              System.out.printf("Way to %d is %s \n", i, paths[i].toString());
           }
       
    }
}
