/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heap;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Andrey
 */
public class DemoHeap {
    public DemoHeap(){
        int[] A = {5, 2, 1, 4, 11, 7, 10, 16, 9, 8}; 
        BinaryHeap heap = new BinaryHeap(A);
       
        int[] res = heap.getHeap();
        System.out.println(Arrays.toString(res));
        heap.heapSort();
        System.out.println(Arrays.toString(res));
        
        heap = new BinaryHeap(A);
        
        for (int i = 1; i < 10; i++){
            int m = heap.extractMax();
            System.out.printf("Max of heap is %d", m);
        }
        
        
       
    }
}
