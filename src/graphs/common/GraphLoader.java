/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.common;

import graphs.builders.GraphBuilder;
import graphs.deikstra.SearchPath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Andrey
 */
public class GraphLoader {
    GraphBuilder builder;
    String fileName;
    
    public GraphLoader(GraphBuilder builder){
        this.builder = builder;
    }
    
    public void load(String fileName) throws Exception{
       InputStream stream = getClass().getResourceAsStream (fileName);
       try(BufferedReader buffer = new BufferedReader(new InputStreamReader(stream))){
           String[] lineArgs = buffer.readLine().split(" ");
           
           int vertexCount  = Integer.parseInt(lineArgs[0]);
           
           builder.setVertexCount(vertexCount);
           builder.setGraphParams(lineArgs);
           
           String line = buffer.readLine();
           while (line  != null) {
               lineArgs = line.split(" ");
           
               int from  = Integer.parseInt(lineArgs[0]);
               int to  = Integer.parseInt(lineArgs[1]);
               int weight  = Integer.parseInt(lineArgs[2]);
               
               builder.addEdge(from, to, weight);
               
               line = buffer.readLine();
           }
        } catch (IOException e){
            throw new Exception(String.format("Error: %s while reading file %s",  e.getMessage(), fileName)); 
        }
    }
}
