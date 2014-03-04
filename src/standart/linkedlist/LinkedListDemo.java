/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.linkedlist;

/**
 *
 * @author Andrey
 */
public class LinkedListDemo {
    LinkedList list;
    public LinkedListDemo(){
        list = new LinkedList();
        this.demo();
    }
    
    public void demo(){
        double v = 2;
        for (int i = 1; i < 10 ; i++){
            
            ValueObject<String, Double> valObj = new ValueObject<>();
            valObj.setValue(v);
            
            list.add(valObj);
            v *=2;
        } 
        
        list.rewind();
        this.printList();
    }
    
    public void printList(){
        System.out.print("List is ");
        while(!list.empty()){
            ValueObject<String, Double> valueObj = list.getCurrent();
            System.out.print(Double.toString(valueObj.getValue()) + " ");
            list.next();
        } 
    }
    
    
}
