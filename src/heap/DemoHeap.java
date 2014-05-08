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
        int[] A = {5, 2, 1, 4, 11, 16, 10, 6, 9, 8}; 
        BinaryHeap heap = new BinaryHeap(A);
       
        int[] res = heap.getHeap();
        System.out.println(Arrays.toString(res));
        heap.heapSort();
        System.out.println(Arrays.toString(res));
        int m = heap.extractMax();
        System.out.printf("Max of heap is %d", m);
         m = heap.extractMax();
        System.out.printf("Max of heap is %d", m);
    }
}
