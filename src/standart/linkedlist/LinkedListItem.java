/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.linkedlist;

/**
 *
 * @author Andrey
 */
public class LinkedListItem {
    protected LinkedListItem next;
    protected LinkedListItem prev;
    protected ValueObject value;
    protected String key;
  
    public ValueObject getValue() {
        return value;
    }

    public void setValue(ValueObject value) {
        this.value = value;
    }
    
    /**
     * Указатель на следующий элемент списка
     */
    public LinkedListItem getNext() {
        return next;
    }

    public void setNext(LinkedListItem next) {
        this.next = next;
    }
    
    /**
     * Указатель на предыдущий элемент списка
     */
    public LinkedListItem getPrev() {
        return prev;
    }

    public void setPrev(LinkedListItem prev) {
        this.prev = prev;
    }

}
