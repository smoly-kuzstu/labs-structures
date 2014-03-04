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
            System.out.println(v);
            list.add(v);
            v *=2;
        } 
        
        list.rewind();
        this.printList();
    }
    
    public void printList(){
        System.out.print("List is ");
        while(list.hasCurrent()){
            double curItem = list.getCurrent();
            System.out.print(Double.toString(curItem) + " ");
            list.next();
        } 
    }
    
    
}
