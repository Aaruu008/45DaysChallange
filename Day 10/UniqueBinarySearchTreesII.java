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

public class UniqueBinarySearchTreesII {
    public List<Node> generateTrees(int n) {
        if (n == 0)
          return new ArrayList<>();
        return generateTres(1, n);
      }
    
      private List<Node> generateTres(int mn, int mx) {
        if (mn > mx)
          return Arrays.asList((Node) null);
    
        List<Node> ans = new ArrayList<>();
    
        for (int i = mn; i <= mx; ++i)
          for (Node left : generateTres(mn, i - 1))
            for (Node right : generateTres(i + 1, mx)) {
              ans.add(new Node(i));
              ans.get(ans.size() - 1).left = left;
              ans.get(ans.size() - 1).right = right;
            }
    
        return ans;
      }
    
}
