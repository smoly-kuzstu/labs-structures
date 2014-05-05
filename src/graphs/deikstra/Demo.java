/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.deikstra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sun.misc.IOUtils;

/**
 *
 * @author Andrey
 */
public class Demo {
    public Demo(){
        readFile();
    }
    
    protected void readFile(){
        
        try(BufferedReader buffer = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream ("/assests/graphs/deikstra/input.txt")))){
           String[] lineArgs = buffer.readLine().split(" ");
           
           int gSize  = Integer.parseInt(lineArgs[0]);
           int sourceVertex  = Integer.parseInt(lineArgs[1]);
           
           int w[][] = new int[gSize + 1][gSize + 1];
           
           for (int i = 1; i <= gSize; i++){
               for (int j = 1; j <= gSize; j++){
                   //Если нет ребра, то расстояние бесконечность, либо -1 ?
                   w[i][j] = SearchPath.INF;
               }
           }
           
           String line = buffer.readLine();
           while (line  != null) {
               lineArgs = line.split(" ");
           
               int i  = Integer.parseInt(lineArgs[0]);
               int j  = Integer.parseInt(lineArgs[1]);
               int weight  = Integer.parseInt(lineArgs[2]);
               
               w[i][j] = weight;
               
               line = buffer.readLine();
           }
           
           SearchPath deikstaraPath = new SearchPath(gSize, w);
           int d[] = deikstaraPath.getPaths(sourceVertex);
           
           for (int i = 1; i <= gSize ; i++){
              System.out.printf("Distance to %d is %d \n", i, d[i]);
           }
           
        } catch (IOException e){
            System.err.println("Error while reading file" + e.getMessage());
        }

        // Read each line and hand it off to a worker thread for processing.
       
    }
}
