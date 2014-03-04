/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.core;


import standart.linkedlist.LinkedList;
import standart.linkedlist.ValueObject;

/**
 *
 * @author Andrey
 */
public class Stack {
    protected int size;
    protected LinkedList linkedList;
    
    public Stack(){
        linkedList = new LinkedList();
    }
        
    public void   push(int value){
        ValueObject<String, Integer> valObj = new ValueObject<>();
        valObj.setValue(value);
        
        linkedList.add(valObj);
        size++;
    }
    
    public int  pop() {
        ValueObject<String, Integer> valObj = linkedList.removeLast();
        size--;
        return valObj.getValue(); 
    }
    
    public double  peek() {
        ValueObject<String, Integer> valObj = linkedList.getCurrent();
        return valObj.getValue();
    }
    
    public int getSize(){
      return size;
    }
    
    public boolean empty(){
        return size == 0;
    }
}

