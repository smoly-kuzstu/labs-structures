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
    protected TreeNode rootNode;
    protected int searchIterations;
    
    public void add(ValueObject<Integer, String> value){
        int key = value.getKey();
        
        if (rootNode == null){
            rootNode = new TreeNode();
            rootNode.setValue(value);
            return;
        }
        
        TreeNode currentNode = rootNode;
        TreeNode newNode = new TreeNode();
        newNode.setValue(value);
                
        while(currentNode != null){
            TreeNode selectedNode;
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
        if (rootNode == null) return null;
        
        boolean flag = true;
        TreeNode currentNode = rootNode;
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
    public int getSearchIterations(){
        return searchIterations;
    }
    /*public int getHeight(){
    }*/
    
}
