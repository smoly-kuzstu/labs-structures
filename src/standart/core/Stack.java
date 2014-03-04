/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.core;

/**
 *
 * @author Andrey
 */
public class Stack {
    protected int size;
    protected int maxElements;
    protected double[] elements;
    
    public Stack(int maxElements){
        this.maxElements = maxElements;
        this.size = 0;
        elements = new double[maxElements];
    }
    
    void   push(double element){
        elements[++size] = element;
    }
    
    double  pop() {
        return elements[size--];
    }
    
    double  peek() {
        return elements[size];
    }
    
    boolean empty(){
        return size == 0;
    }
}

