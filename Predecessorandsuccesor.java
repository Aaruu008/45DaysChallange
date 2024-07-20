/**
 * Predecessorandsuccesor
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
public class Predecessorandsuccesor {

    public Node inordersuc(Node root, Node p ){
        Node succ=null;
        while(root!=null){
            if(p.data>=root.data){
                root=root.right;
            }
            else{
                succ=root;
                root=root.left;
            }
        }
        return succ;
    }

    public Node predecesor(Node root, Node p){
        Node pre=null;
        while(root!=null){
            if(p.data>=root.data){
                pre=root;
                root=root.right;
            }
            else {
                root=root.left;
            }
        }
        return pre;
    }
}