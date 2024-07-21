/**
 * ValidationofBST
 */
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
public class ValidationofBST {
    public boolean isValidBST(Node root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean valid(Node node,long min,long max ){
        if(node==null) return true;
        if(node.data>=max || node.data<=min){return false;}
        else{
            return valid(node.left,min,node.data) && valid(node.right,node.data,max);
        }
    }

    
}