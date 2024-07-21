
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
public class FlattenBTtoLINkedLst {
    public void flatten(Node root) {
        Node cur=root;
        while(cur!=null){
            if(cur.left!=null){
                Node prev=cur.left;
                while(prev.right!=null){
                    prev=prev.right;
                }
                prev.right=cur.right;
            cur.right=cur.left;
            cur.left=null;
            }
             cur=cur.right;
        }
       
        
    }
    
}
