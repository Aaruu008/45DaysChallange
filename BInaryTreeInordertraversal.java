import java.util.ArrayList;
import java.util.List;



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
