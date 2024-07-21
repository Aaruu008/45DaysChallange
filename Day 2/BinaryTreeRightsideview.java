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

import java.util.*;

public class BinaryTreeRightsideview {
    public List<Integer> rightSideView(Node root) {
        List<Integer> res=new ArrayList<>();
        recurseright(root,0,res);
        return res;
        
    }
    public static void recurseright(Node root,int level,List<Integer> res){
        if(root==null) return;
        if(level==res.size()) res.add(root.data);
        recurseright(root.right,level+1,res);
        recurseright(root.left,level+1,res);

    }
    
}
