

/**
 * RecoverBST
 */
import java.util.*;
/*class Node {
    int data;
    Node left;
    Node right;
    Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};*/
public class RecoverBST {

    private Node prev;
    private Node first;
    private Node middle;
    private Node last;
    private void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{last=root;}
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(Node root) {
        first=middle=last=null;
        prev =new Node (Integer.MIN_VALUE);
        inorder(root);
       if(first!=null && last!=null){
        int tem=first.data;
        first.data=last.data;
        last.data=tem;
       }
       else if(first!=null && middle!=null){
        int tem=first.data;
        first.data=middle.data;
        middle.data=tem;
       }
        
    }
}