/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.core;

import standart.linkedlist.ValueObject;

/**
 *
 * @author Andrey
 */
public interface IStack {
    /**
     * Добавляет э-т в стэк
     */
    public void   push(int value);
    /**
     * Извлекает верхний э-т из стэка
     */
    public int  pop();
    /**
     * Извлекает верхний э-т из стека без его удаления
     */
    public int  peek();
    /**
     * Является ли стэк пустым
     */
    public boolean empty();
    
    public int getSize();
    
}
