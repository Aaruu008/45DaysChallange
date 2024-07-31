

class Node 
{
    int data;
    Node left, right;
 
    public Node(int data) 
    {
        this.data = data;
        left = right = null;
    }
}
 


public class BinaryTreetoDLL {
    Node root;
    Node head;
    static Node prev = null;
 
    void BinaryTree2DoubleLinkedList(Node root) 
    {
        
        if (root == null)
            return;
 
       
        BinaryTree2DoubleLinkedList(root.left);
 
       
        if (prev == null) 
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
 
        
        BinaryTree2DoubleLinkedList(root.right);
    }
 
   
    void printList(Node node)
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
}
