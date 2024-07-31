

import java.util.HashSet;
import java.util.Set;
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


public class BinaryTreeCameras {
    
    int ans;
    Set<Node> coverd;
    public int Camera(Node root){
        ans=0;
        coverd=new HashSet<>();
        coverd.add(null);
        dfs(root,null);
        return ans;
    }
    public void dfs(Node node,Node par){
        if(node!=null){
            dfs(node.left,node);
            dfs(node.right, node);

        }
        if(par==null || !coverd.contains(node) || !coverd.contains(node.left) || !coverd.contains(node.right)){
            ans++;
            coverd.add(node);
            coverd.add(par);
            coverd.add(node.left);
            coverd.add(node.right);
        }
    }
}
