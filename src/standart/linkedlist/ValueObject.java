/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.linkedlist;

/**
 *
 * @author Andrey
 */
public class ValueObject<KeyType, ValueType> {
    protected KeyType key;
    protected ValueType value;

    /**
     * @return the key
     */
    public KeyType getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(KeyType key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public ValueType getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(ValueType value) {
        this.value = value;
    }
}
