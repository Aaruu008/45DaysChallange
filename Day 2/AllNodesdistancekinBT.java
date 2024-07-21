import java.util.*;

/**
 * AllNodesdistancekinBT
 */
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
public class AllNodesdistancekinBT {

    public void parent(Node root, Map<Node, Node> ans, Node target) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left != null) {
                ans.put(node.left, node);
                q.add(node.left);
            }
            if (node.right != null) {
                ans.put(node.right, node);
                q.add(node.right);
            }
        }
    }

    public List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node, Node> parent = new HashMap<>();
        parent(root, parent, root);
        Set<Node> visit = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.add(target); // Start from the target node
        visit.add(target); // Mark the target node as visited
        int curlevel = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (curlevel == k) break;
            curlevel++;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null && !visit.contains(node.left)) {
                    q.add(node.left);
                    visit.add(node.left);
                }
                if (node.right != null && !visit.contains(node.right)) {
                    q.add(node.right);
                    visit.add(node.right);
                }
                if (parent.get(node) != null && !visit.contains(parent.get(node))) {
                    q.add(parent.get(node));
                    visit.add(parent.get(node));
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            Node node = q.poll();
            ans.add(node.data);
        }
        return ans;
    }
}