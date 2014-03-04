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
public class BinaryTree {
    protected BinaryTree left;
    protected BinaryTree right;
    protected BinaryTree parent;
    protected ValueObject<Integer, String> value;
    protected int searchIterations;
    
    public void add(ValueObject<Integer, String> value){
        int key = value.getKey();
        BinaryTree currentNode = this;
        BinaryTree newNode = new BinaryTree();
        newNode.setValue(value);
                
        while(currentNode != null){
            BinaryTree selectedNode;
            int nodeKey = currentNode.getValue().getKey();
            if (key > nodeKey){
                selectedNode = currentNode.getRight();
                if (selectedNode == null){
                    currentNode.setRight(newNode);
                    return;
                }
            } else {
                selectedNode = currentNode.getLeft();
                if (selectedNode == null){
                    currentNode.setLeft(newNode);
                    return;
                }
            }
            
            currentNode = selectedNode;
            
        }
    }
    
        
    public ValueObject<Integer, String> find(int key){
        searchIterations = 0;
        ValueObject<Integer, String> res;
        
        BinaryTree currentNode = this;
        while(currentNode != null){
            searchIterations++;
            int nodeKey = currentNode.getValue().getKey();
            
            if (key == nodeKey){
                return currentNode.getValue();
            }
            
            if (key > nodeKey){
                currentNode = currentNode.getRight();
            } else {
                currentNode = currentNode.getLeft();
            }
        }

        return null;
    }
    
    public void traverse(ITreeVisitor visitor){
        if (this.left != null){
            this.left.traverse(visitor);
        }
        
        visitor.visit(this);
        
        if (this.right != null){
            this.right.traverse(visitor);
        }
    }
    /**
     * @return the left
     */
    public BinaryTree getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryTree getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryTree right) {
        this.right = right;
    }

    /**
     * @return the parent
     */
    public BinaryTree getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(BinaryTree parent) {
        this.parent = parent;
    }

    /**
     * @return the value
     */
    public ValueObject<Integer, String> getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(ValueObject<Integer, String> value) {
        this.value = value;
    }
}
