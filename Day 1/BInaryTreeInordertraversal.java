import java.util.ArrayList;
import java.util.List;


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

public class BInaryTreeInordertraversal {
    public static void inorder(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public List<Integer> inorderTraversal(Node  root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
        
    }
}
