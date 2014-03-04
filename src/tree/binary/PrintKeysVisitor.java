/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.binary;

import standart.linkedlist.ValueObject;

/**
 *
 * @author Andrey
 */
public class PrintKeysVisitor implements ITreeVisitor{

    @Override
    public void visit(BinaryTree node) {
        ValueObject<Integer, String> valueObj = node.getValue();
        System.out.print(valueObj.getKey() + " ");
    }
    
}
