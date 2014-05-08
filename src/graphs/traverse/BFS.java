/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.traverse;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Andrey
 */
public class BFS {
    protected LinkedList<Integer>[] vertexes;
    protected boolean[] visited;
    protected Queue<Integer> quque;
    
    public BFS(LinkedList<Integer>[] vertexes){
        this.vertexes = vertexes;
        this.visited = new boolean[vertexes.length];
        quque = new LinkedList<>();
    }
    
    public void bfs(int startVertex){
        
        
        visited[startVertex] = true;
        quque.add(startVertex);
        while(!quque.isEmpty()){
            int vertexNum = quque.poll();
            
            System.out.println(vertexNum);
            
            if (vertexes[vertexNum] == null) continue;
            for(int child : vertexes[vertexNum]){
                if (!visited[child]){
                    quque.add(child);
                    visited[child] = true;
                }
            }
        }
    }
}
