import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getKey() {
        return first;
    }

    public V getValue() {
        return second;
    }
}
class Node {
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
};

/**
 * verticalorderTraversalofbt
 */
public class verticalorderTraversalofbt {

    public List<List<Integer>> verticalTraversal(Node root) {
    Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();

    // Queue for BFS traversal, each
    // element is a pair containing node
    // and its vertical and level information
    Queue<Pair<Node, Pair<Integer, Integer>>> todo = new LinkedList<>();

    // Push the root node with initial vertical
    // and level values (0, 0)
    todo.add(new Pair<>(root, new Pair<>(0, 0)));

    // BFS traversal
    while (!todo.isEmpty()) {
        // Retrieve the node and its vertical
        // and level information from
        // the front of the queue
        Pair<Node, Pair<Integer, Integer>> p = todo.poll();
        Node temp = p.getKey();

        // Extract the vertical and level information
        // x -> vertical
        int x = p.getValue().getKey();
        // y -> level
        int y = p.getValue().getValue();

        // Insert the node value into the
        // corresponding vertical and level
        // in the map
        nodes.computeIfAbsent(x, k -> new TreeMap<>())
             .computeIfAbsent(y, k -> new ArrayList<>())
             .add(temp.data);

        // Process left child
        if (temp.left != null) {
            todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
        }

        // Process right child
        if (temp.right != null) {
            todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
        }
    }

    // Prepare the final result list
    // by combining values from the map
    List<List<Integer>> ans = new ArrayList<>();
    for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : nodes.entrySet()) {
        List<Integer> col = new ArrayList<>();
        for (List<Integer> list : entry.getValue().values()) {
            // Sort the list manually to maintain the correct order
            Collections.sort(list);
            // Insert node values
            // into the column list
            col.addAll(list);
        }
        // Add the column list
        // to the final result
        ans.add(col);
    }
    return ans;
    }
}