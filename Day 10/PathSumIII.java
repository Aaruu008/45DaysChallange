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

public class PathSumIII {
    public int pathSum(Node root, int sum) {
        // Map to store the cumulative sum counts
        HashMap<Integer, Integer> sums = new HashMap<>();
        // Initialize the map with the base case for a path sum of 0
        sums.put(0, 1);
        // Array to store the result
        int[] res = new int[1];
        // Start processing the tree
        process(root, res, 0, sum, sums);
        return res[0];
    }

    private void process(Node node, int[] res, int currSum, int sum, HashMap<Integer, Integer> sums) {
        if (node == null) {
            return;
        }
        
        // Update the current path sum
        currSum += node.data;

        // Check if there is a previous path sum that makes up the required sum
        if (sums.containsKey(currSum - sum)) {
            res[0] += sums.get(currSum - sum);
        }

        // Update the map with the current path sum
        sums.put(currSum, sums.getOrDefault(currSum, 0) + 1);

        // Process the left and right subtrees
        process(node.left, res, currSum, sum, sums);
        process(node.right, res, currSum, sum, sums);

        // Remove the current path sum from the map after the recursive calls
        sums.put(currSum, sums.get(currSum) - 1);

        // Ensure to remove the key if its count goes to zero to avoid unnecessary entries
        if (sums.get(currSum) == 0) {
            sums.remove(currSum);
        }
    }
}
