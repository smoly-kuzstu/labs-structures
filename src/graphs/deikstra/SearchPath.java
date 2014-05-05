/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.deikstra;

import graphs.common.Pair;

/**
 *
 * @author Andrey
 */
public class SearchPath {
    protected int[][] w;
    protected int N;
    public static final int INF = 100000000;
    
    boolean[] marked;
    int d[] ;
    /**
     * @param N vertex count
     * @param w  weight of edges
     * @param sourceVertex Initial vertex
    */
    public SearchPath(int N, int[][] w){
        this.w = w;
        this.N = N;
        // oR N + 1 ?
        d = new int[N + 1];
        marked = new boolean[N + 1];
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
    
    protected void relax(int i , int j){
        //Минимальное из старого и нового расстояния
        d[j] = Math.min(d[j], d[i] + w[i][j]) ;
    }
    
    public int[] getPaths(int sourceVertex){

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
    
}
