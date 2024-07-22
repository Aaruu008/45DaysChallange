public class Samesubtree {
    public boolean isidenticcal(Node root1, Node root2){
        if(root1==null && root2==null){return true;}

        if(root1!=null && root2!=null){
            return root1.data==root2.data && isidenticcal(root1.left, root2.left) 
            && isidenticcal(root1.right, root2.right);
        }
        return false;
    }
    public boolean same(Node root, Node subtree){
        if(root==null) return false;

        if(isidenticcal(root, subtree)){return true;}
        return same(root.left,subtree) || same(root.right, subtree);
    }
}
