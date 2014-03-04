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
public class BinaryTreeDemo {
    BinaryTree binarySearchTree;
    public BinaryTreeDemo(){
        binarySearchTree = new BinaryTree();
        demo();
    }
    
    protected void createElement(int key, String value){
        ValueObject<Integer, String> valObject = new ValueObject<>();
        
        valObject.setKey(key);
        valObject.setKey(key);
        
        binarySearchTree.add(valObject);
    }
    
    public void demo(){
        this.createElement(8, "Иванов");
        this.createElement(4, "Петров");
        this.createElement(13, "Глебов");
        this.createElement(6, "Сидоров");
        this.createElement(9, "Некто");
        this.createElement(20, "Кто");
        
        ValueObject<Integer, String> res =  binarySearchTree.find(13);
        
        if (res != null){
            System.out.println("Find key is " + res.getValue());
        } else {
            System.out.println("Key not found");
        }
    }
}
