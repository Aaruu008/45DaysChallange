
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
public class MergtwoBT {
    public Node merge(Node r1,Node r2){
        if(r1==null) return r2;
        if(r2==null) return r1;

        r1.data+=r2.data;

        r1.left=merge(r1.left, r2.left);
        r1.right=merge(r1.right,r2.right);
        return r1;
    }
    
}
