import javax.swing.tree.TreeNode;

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

public class SymetricTree {
    public boolean isSymmetric(Node root) {
        if(root==null) return true;
        return sym(root.left,root.right);

    }
    public static boolean sym(Node n1,Node n2){
        if(n1==null ||n2==null) return n1==n2;

        return(n1.data==n2.data) && sym(n1.left,n2.right) && sym(n1.right,n2.left);
    }

    
}
