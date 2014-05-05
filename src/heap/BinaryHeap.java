/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heap;

/**
 *
 * @author Andrey
 */
public class BinaryHeap {
   protected int size;
   protected int heapSize;

   protected int[] A;
   
   
   public BinaryHeap(int[] A){
       heapSize = A.length;
       this.A = A;
       for (int i = heapSize / 2 ; i > 0; i--){
           heapify(i);
       }
   } 
   
   protected void swap(int i, int j){
       int tmp = A[i];
       A[i] = A[j];
       A[j] = tmp;
   }
   
   public void heapify(int i){
       int left = 2 * i;
       int right = 2 * i + 1;
       int largest = i;
       
       if (left <= heapSize && A[left] > A[i]){
           largest = left;
       }
       
       if (right <= heapSize && A[right] > A[i]){
           largest = right;
       }
       
       if (largest != i){
           swap(largest, i);
           heapify(largest);
       }
   }
   
   public int[] getHeap(){
       return A;
   }
   
   public void insert(int element){
       
   }
}
