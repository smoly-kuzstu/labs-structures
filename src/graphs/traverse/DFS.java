/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.traverse;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class DFS {
    protected LinkedList<Integer>[] vertexes;
    protected int[] visited;
    
    public DFS(LinkedList<Integer>[] vertexes){
        this.vertexes = vertexes;
        this.visited = new int[vertexes.length];
    }
    
    public void dfs(int vertexNum){
        
        System.out.println(vertexNum);
        visited[vertexNum] = 1;
        if (vertexes[vertexNum] == null) return;
        
        for(int child : vertexes[vertexNum]){
            if (visited[child] == 0){
                dfs(child);
            }
        }
    }
}
