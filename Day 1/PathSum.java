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

/**
 * 112. Path Sum
 */
public class PathSum {
    public boolean hasPathSum(Node root, int targetSum) {
        if (root == null)
            return false;
        return hasPathSumHelper(root, targetSum);
    }

    public boolean hasPathSumHelper(Node root, int targetSum) {
        if (root == null)
            return false;

        // Check if the current node is a leaf node
        if (root.left == null && root.right == null) {
            return root.data == targetSum;
        }

        // Recursively check the left and right subtree with the updated target sum
        int remainingSum = targetSum - root.data;
        return hasPathSumHelper(root.left, remainingSum) || hasPathSumHelper(root.right, remainingSum);
    }

}