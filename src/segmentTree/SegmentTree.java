/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package segmentTree;
import static java.lang.Math.*;
/**
 *
 * @author Andrey
 */
public class SegmentTree {
    protected int maxN;
    protected int[] t;
    protected int[] a;
    
    public SegmentTree(int[] a){
        this.maxN = a.length;
        this.a = a;
        t = new int[4 * maxN];
    }
    
    protected void buildTree(){
        
    }
    /**
     * @param v  current vertex
     * @param tl left bound
     * @param tr right bound
    */
    protected void build(int v, int tl, int tr){
        if (tl == tr){
            t[v] = a[tl];
        } else {
            int mid = (tl + tr) / 2;
            build(v * 2, tl, mid);
            build(v * 2 + 1, mid + 1, tr);
            t[v] = t[v * 2] + t[v * 2 + 1];
        }
    }
    
    /** Initial values should be
     * @param v current vertex
     * @param tl left bound
     * @param tr right bound
     * @param l current left bound of query
     * @param r current right bound of query
    */
    public int sum(int v, int tl, int tr, int l, int r){
        if (l > r) return 0;
        if (l == r) return t[v];
        
        int mid = (tl + tr) / 2;
        return  sum(v * 2, tl, mid, l, min(r, mid)) +
                sum(v * 2 + 1, mid + 1, tr, max(l,mid+1), r);
    }
    
}
