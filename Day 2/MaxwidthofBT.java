import java.util.LinkedList;
import java.util.Queue;

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

public class MaxwidthofBT {
    public int widthOfBinaryTree(Node root) {
        if(root==null) return 0;
        int ans=0;
       Queue<Pair<Node, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int first=0;
            int last=0;
            int mini=q.peek().getValue();
            for(int i=0;i<size;i++){
                int curindex=q.peek().getValue() - mini;
                Node node=q.peek().getKey();
                q.poll();
                if(i==0){
                    first=curindex;
                }
                if(i==size-1){
                    last=curindex;
                }
                if(node.left !=null){
                    q.add(new Pair<>(node.left,curindex*2 +1));
                }
                if(node.right !=null){
                    q.add(new Pair<>(node.right,curindex*2 +2));
                }
            }
            ans=Math.max(ans,(last-first) + 1);
        }
        return ans;
        
    }
}
