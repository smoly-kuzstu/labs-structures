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
    
    public void add(String key, double value){
        LinkedListItem item = new LinkedListItem();
        item.setValue(value);
        item.setKey(key);
        if (currentItem == null){
           currentItem = item;
           headItem = currentItem;
        } else {
           currentItem.setNext(item);
           currentItem = item;
        }  
    }
    
    public void add(double value){
        this.add("", value);
    }
    
    public void next(){
         LinkedListItem item = currentItem.getNext();
         currentItem = item;    
    }
    
    public double getCurrent(){
        if (currentItem != null){
            return currentItem.getValue();
        } else {
            return -1;
        }
    }
    
    public LinkedListItem getCurrentItem(){
        return currentItem;
    }
    
    public boolean hasCurrent(){
        return (currentItem != null);
    }
    
    public void rewind(){
        currentItem = headItem;
    }
    
}
