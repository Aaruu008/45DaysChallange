import java.util.*;

public class Constructbinary {
    private Map<Integer, Integer> postOrderIndexMap = new HashMap<>();

    // Function that constructs the binary tree from preorder and postorder traversal arrays.
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        // Fill the map with the postorder values and their indices.
        for (int i = 0; i < postorder.length; i++) {
            postOrderIndexMap.put(postorder[i], i);
        }
        // Call the recursive build function to construct the tree.
        return buildTree(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }
     private TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                               int[] postorder, int postStart, int postEnd) {
        // If there are no elements to construct the tree, return null.
        if (preStart > preEnd) return null;

        // The first value in preorder is the root node value.
        TreeNode root = new TreeNode(preorder[preStart]);

        // If there is only one node, it is the root of the current subtree.
        if (preStart == preEnd) return root;

        // Find the index of the root of the left subtree in postorder traversal using the map.
        int leftRootIndex = postOrderIndexMap.get(preorder[preStart + 1]);

        // The length of the left subtree in the postorder array can be calculated from the indices.
        int leftSubtreeLength = leftRootIndex - postStart + 1;

        // Recursively construct the left subtree.
        root.left = buildTree(preorder, preStart + 1, preStart + leftSubtreeLength,
                              postorder, postStart, leftRootIndex);

        // Recursively construct the right subtree.
        root.right = buildTree(preorder, preStart + leftSubtreeLength + 1, preEnd,
                               postorder, leftRootIndex + 1, postEnd - 1);

        // Return the root of the constructed subtree.
        return root;
    }
}
