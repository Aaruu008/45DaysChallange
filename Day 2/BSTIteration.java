import java.util.Stack;
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

public class BSTIteration {
    private Stack<Node> st=new Stack<Node>();


    public BSTIteration(Node root) {
         pushall(root);
        
    }
    
    public int next() {
        Node temp=st.pop();
        pushall(temp.right);
        return temp.data;
        
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
        
    }
    public void pushall(Node root){
        for(; root!=null ; st.push(root) ,root=root.left);
    }
    
}
