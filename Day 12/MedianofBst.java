import java.util.*;

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

public class MedianofBst {
    public void inorder(Node node , List<Integer> arr){
        if(node==null) return;
        inorder(node.left,arr);
        arr.add(node.data);
       
        inorder(node.right,arr);

    }
    public int median(Node root){
        List<Integer> arr=new ArrayList<>();
        inorder(root, arr);
         if(arr.size()%2==1){
            int index=arr.size()/2;
            int median =arr.get( index );
            return median;

         }
         else{
            int index1=arr.size()/2;
            int index2=arr.size()/2 + 1;
            int median=(arr.get(index1) + arr.get(index2))/2;

            return median;
         }
    }
    
}
