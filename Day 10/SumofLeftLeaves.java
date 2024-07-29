
class Node {
    int val;
    Node  left;
    Node  right;

    Node () {}

    Node (int val) {
        this.val = val;
    }

    Node (int val, Node  left, Node  right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SumofLeftLeaves {
    public boolean isLeafNode(Node node)
    {
        if(node==null)
            return false;
        if(node.left==null && node.right==null)
            return true;
        return false;
    }
    int sumOfLeftLeaves(Node root) {
        int res = 0;
        if(root!=null)
        {
            if(isLeafNode(root.left))
                res = res + root.left.val;
            else
                res = res + sumOfLeftLeaves(root.left);
            
            res  = res + sumOfLeftLeaves(root.right);
        }
        return res;
    }
    
}
