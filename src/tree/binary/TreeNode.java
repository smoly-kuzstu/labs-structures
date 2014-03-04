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
public class TreeNode {
    protected TreeNode left;
    protected TreeNode right;
    protected TreeNode parent;
    protected ValueObject<Integer, String> value;
    /**
     * @return the left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * @return the parent
     */
    public TreeNode getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(TreeNode parent) {
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
