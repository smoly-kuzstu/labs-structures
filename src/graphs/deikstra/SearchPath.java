/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.deikstra;

import graphs.common.Pair;
import graphs.common.PathInfo;
import java.util.Collections;
import java.util.LinkedList;

import static graphs.common.Metrics.*;
/**
 *
 * @author Andrey
 */
public class SearchPath {
    //Матрица смежности, если нет ребра, то зачение +INF
    protected int[][] w;
    //Матрица расстояний до каждой вершины от истока
    protected int d[] ;
    //Количество вершин
    protected int N;
    //Массив, необходимый для хранения пути
    protected int[] path;
    //Массив с состоянием помеченности вершины
    boolean[] marked;
    
    /**
     * @param N vertex count
     * @param w  weight of edges
     * @param sourceVertex Initial vertex
    */
    public SearchPath(int N, int[][] w){
        this.w = w;
        this.N = N;
        d = new int[N + 1];
        marked = new boolean[N + 1];
        path = new int[N + 1];
    }
    
    protected int  getMinVertex(){
        int minD = INF;
        int curInd = -1;
        
        for (int i = 1; i <= N; i++){
            if (!marked[i] && d[i] < minD){
                curInd = i;
                minD = d[i];
            }
        }
        
        return curInd;
    }
    
    protected void relax(int v , int to){
        //Минимальное из старого и нового расстояния
        int newPath =  d[v] + w[v][to];
        if (newPath < d[to] ){
            d[to] = newPath;
            path[to] = v;
        }
    }
    
    
    public int[] calculateDistances(int sourceVertex){
        for (int i = 1; i <= N ; i++){
            d[i] = INF;
            marked[i] = false;
        }
        
        d[sourceVertex] = 0;
        
        for (int i = 1; i <= N ; i++){
            int v = getMinVertex();              
            for (int j = 1 ; j <= N; j++){
                if (!marked[j]) relax(v, j);
            }
            marked[v] = true;
        }
        
        return d;
    }
    
    public PathInfo[] getPaths(int sourceVertex){
        
        PathInfo<Integer>[] res = new PathInfo[N + 1];
        
        this.calculateDistances(sourceVertex);
        
        for(int i = 1; i <= N; i++){
            res[i] = getPath(sourceVertex, i);
        }
        
        return res;
        
    }
    
    protected PathInfo getPath(int sourceVertex, int toVertex){
        PathInfo<Integer> pathList= new PathInfo(true);
        
        pathList.setLength(d[toVertex]);
               
        for(int v = toVertex; v != sourceVertex; v = path[v]){
            pathList.addVertex(v);
        }
        
        
                
        return pathList;
    }
    
}
