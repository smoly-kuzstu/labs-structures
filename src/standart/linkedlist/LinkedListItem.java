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
    /**
     * @return the next
     */
    public LinkedListItem getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkedListItem next) {
        this.next = next;
    }

    /**
     * @return the value
     */
    public ValueObject getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(ValueObject value) {
        this.value = value;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the prev
     */
    public LinkedListItem getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(LinkedListItem prev) {
        this.prev = prev;
    }

}
