

class Node {
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
};
public class Balancedbinarytree {
    public boolean isBalanced(Node root) {
        return heigh(root)!=-1;
        
    }
    public static int heigh(Node root){
        if(root==null) return 0;
        int left=heigh(root.left);
        if(left ==-1) return -1;
        int right=heigh(root.right);
        if(right==-1) return -1;
        if(Math.abs(left -right)>1) return -1;

        return Math.max(left,right) + 1;
    }

    
}
