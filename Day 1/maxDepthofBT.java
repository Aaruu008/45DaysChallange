import java.util.LinkedList;
import java.util.Queue;


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

public class maxDepthofBT {
     public int maxDepth(Node root) {
       Queue<Node> q = new LinkedList<>();
       int cnt=0;
       if(root==null) return 0;
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
            Node node=q.poll();
            if(node.left !=null){
                q.add(node.left);
            }
            if(node.right !=null){
                q.add(node.right);
            }
        }
        cnt++;
       }
        
        return cnt;
    }
    
}
