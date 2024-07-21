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

public class ConstructBSTusingPreorder {
    public Node bstFromPreorder(int[] preorder) {
        return bst(preorder,Integer.MAX_VALUE,new int[]{0});
        
    }
    public Node bst(int [] pre,int bound,int[] i){
        if(i[0] ==pre.length || pre[i[0]]>bound){
            return null;
        }
        Node root=new Node (pre[i[0]++]);
        root.left=bst(pre,root.data,i);
        root.right=bst(pre,bound,i);
        return root;
    }
    
    
}
