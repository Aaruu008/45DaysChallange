/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class MinimumAbsoluteDifferenceinBST {
    private int minDifference;
    private int previousValue;
    private static final int INFINITY = Integer.MAX_VALUE; // Use a static final constant for infinity

    /**
     * Find the minimum absolute difference between values of any two nodes.
     *
     * @param root The root of the binary search tree.
     * @return The minimum absolute difference.
     */
    public int getMinimumDifference(TreeNode root) {
        minDifference = INFINITY; // Initialize minimum difference to the largest value possible
        previousValue = INFINITY; // Initialize previous value to the largest value possible for the start
        inOrderTraversal(root); // Perform in-order traversal to compare node values
        return minDifference; // Return the smallest difference found
    }

    /**
     * Perform in-order traversal on BST to find minimum absolute difference.
     *
     * @param node The current node being visited.
     */
    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return; // Base case: if node is null, return to stop the traversal
        }
        inOrderTraversal(node.left); // Visit left subtree
      
        // Compute the minimum difference with the previous value (if not first node)
        if (previousValue != INFINITY) {
            minDifference = Math.min(minDifference, Math.abs(node.val - previousValue));
        }
        previousValue = node.val; // Update the previous value to the current node's value

        inOrderTraversal(node.right); // Visit right subtree
    }
    
}
