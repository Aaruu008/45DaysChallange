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

public class binaryTreePaths {
     static List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(Node root) {
        if(root==null) return ans;
        buildpath(root,String.valueOf(root.data));
        return ans;

        
    }
    public static void buildpath(Node root,String list){
        if(root.left ==null && root.right==null){
            ans.add(list);
            return;
        }
        if(root.left !=null) buildpath(root.left,list + "->" + String.valueOf(root.left.data));
        if(root.right !=null) buildpath(root.right,list + "->" + String.valueOf(root.right.data));
    }
    
}
