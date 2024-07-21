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

public class ConvertArraytoBT {
    public Node convert(int []nums){
        return build(nums,0,nums.length);
    }
    public Node build(int[] nums,int l,int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        return new Node(nums[mid],(build(nums, l, mid-1)) , build(nums, mid+1, r));
    }
    
}
