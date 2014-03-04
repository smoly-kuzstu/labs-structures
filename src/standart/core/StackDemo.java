/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.core;

/**
 *
 * @author Andrey
 */
public class StackDemo {
    Stack stack;
    public StackDemo(){
        stack = new Stack();
        demo();
    }
    
    public void demo(){
        for (int i = 0; i <= 9; i++){
            stack.push(i);
        }
        
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
