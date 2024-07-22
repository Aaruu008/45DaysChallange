/**
 * Inverttree
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
public class Inverttree {

    public void depth(Node root){
        if (root==null) {return;
            
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        depth(root.left);
        depth(root.right);
    }
    public Node invert(Node root){
        depth(root);
        return root;
    }
}