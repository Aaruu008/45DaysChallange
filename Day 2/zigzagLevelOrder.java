import java.util.*;

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
public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean Lefttoright=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                if (Lefttoright) {
                    temp.add(node.data);
                } else {
                    temp.add(0, node.data);  // Add to the beginning of the list
                }
                if(node.left !=null) q.add(node.left);
                if(node.right !=null) q.add(node.right);
            }
            Lefttoright=!Lefttoright;
            ans.add(temp);

        }
        return ans;
        
    }
    
}
