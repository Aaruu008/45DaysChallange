

public class MaxpathSum {
    public int maxPathSum(Node root) {
        int maxi[] ={Integer.MIN_VALUE};
        findmaxi(root,maxi);
        return maxi[0];
        
    }
    public static int findmaxi(Node root,int [] maxi){
        if(root==null) return 0;
        int left=Math.max(0,findmaxi(root.left,maxi));
        int right=Math.max(0,findmaxi(root.right,maxi));
        maxi[0]=Math.max(maxi[0],left + right + root.data);
        return root.data +Math.max(left,right);
    }
    
}
