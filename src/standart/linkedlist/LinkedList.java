/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.linkedlist;

/**
 *
 * @author Andrey
 */
public class LinkedList {
    protected LinkedListItem currentItem;
    protected LinkedListItem headItem;
    protected LinkedListItem tailItem;
    protected int size;
    
    public void add(ValueObject value){
        LinkedListItem item = new LinkedListItem();
        item.setValue(value);

        if (currentItem == null){
           currentItem = item;
           tailItem = headItem = currentItem;
        } else {
           currentItem.setNext(item);
           item.setPrev(currentItem);
           currentItem = item;
           tailItem = item;
        }
        size++;
    }
    
    public void next(){
         LinkedListItem item = currentItem.getNext();
         currentItem = item;    
    }
    
    public void prev(){
         LinkedListItem item = currentItem.getPrev();
         currentItem = item;    
    }
    
    public ValueObject getCurrent(){
        if (currentItem != null){
            return currentItem.getValue();
        } else {
            return null;
        }
    }
    
    public LinkedListItem getCurrentItem(){
        return currentItem;
    }
    
    public boolean empty(){
        return (currentItem == null);
    }
    
    public void removeFirst(){
        if (headItem != null){
            
            LinkedListItem cItem = headItem.getNext();
            cItem.setPrev(null);
            
            headItem = cItem;
            size--;
        } 
    }
    
    public ValueObject removeLast(){
        if (tailItem != null){
            ValueObject value = tailItem.getValue();
            currentItem = tailItem.getPrev();
            if (currentItem != null){
                currentItem.setNext(null);
            }
            tailItem = currentItem;
            size--;
            return value;
        } 
        return null;
    }
    
    public void rewind(){
        currentItem = headItem;
    }
    
}
