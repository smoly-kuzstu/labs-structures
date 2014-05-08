/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphs.common;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class PathInfo<Vtype> {
    protected LinkedList<Vtype> pathList;
    protected int length = 0;
    protected boolean inversedPath;
    
    public PathInfo(boolean inversedPath){
        this.inversedPath = inversedPath;
        this.pathList = new LinkedList<>();
    }
    
       
    public LinkedList<Vtype> getPath(){
        if (!inversedPath) return pathList;
        else {
            LinkedList<Vtype> res = new LinkedList<>();
            Vtype vertex = pathList.pollLast();
            while(vertex != null){
                res.add(vertex);
                vertex = pathList.pollLast();
            }
            return res;
        }
    }
    
    public void addVertex(Vtype vertex){
        pathList.add(vertex);
        length++;
    }
     
    public void setLength(int pathLength){
        length = pathLength;
    }
    
    public int getLength(){
        return length;
    }
    
     @Override
    public String toString(){
        String outStr = "";
        LinkedList<Vtype> res = getPath();
        
        for(Vtype vertex : res){
            outStr += vertex + ",";
        }
        
        return outStr;
    }
   
}
