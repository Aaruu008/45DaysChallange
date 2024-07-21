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

public class SameTree {
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q== null) {
          return true;}
      if(p==null || q==null) return false;
        
      return ((p.data==q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
      
  }
    
}
