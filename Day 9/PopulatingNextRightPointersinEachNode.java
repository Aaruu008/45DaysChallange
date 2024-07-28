class Node {
    int data;
    Node left;
    Node right;
    Node next;
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
public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root){
        Node temp=root;
        while(temp!=null && temp.left!=null){
            Node dummy=new Node();
            for(Node need=dummy;temp!=null;temp=temp.next){
                need.next=temp.left;
                need=need.next;
                need.next=need.right;
                need=need.next;

            }
            temp=dummy.next;
        }
        return root;
    }
    
}
