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

public class lowestCommonAncestor {
     public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null) return null;
        int cur=root.data;
        if(cur<p.data && cur<q.data){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(cur>p.data && cur>q.data){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
        
    }
    
}
