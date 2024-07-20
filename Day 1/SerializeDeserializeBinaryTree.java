import java.util.LinkedList;
import java.util.Queue;



public class SerializeDeserializeBinaryTree {
     public String serialize(Node root) {
        if(root==null) return " ";
        Queue<Node> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            if(node==null){
                res.append("null,");
                continue;

            }
            else{
                res.append(",");
                q.add(node.left);
                q.add(node.right);
            }

        }
        res.setLength(res.length() - 1);

        return res.toString();
        
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
       if (data.isEmpty()) {
            return null;
        }

        // Use a StringBuilder to
        // tokenize the serialized data
        StringBuilder s = new StringBuilder(data);
        // Read the root value
        // from the serialized data
        int commaIndex = s.indexOf(",");
        String str = s.substring(0, commaIndex);
        s.delete(0, commaIndex + 1);
        Node root = new Node(Integer.parseInt(str));

        // Use a queue for 
        // level-order traversal
        Queue<Node> q = new LinkedList<>();
        // Start with the root node
        q.offer(root);

        // Perform level-order traversal
        // to reconstruct the tree
        while (!q.isEmpty()) {
            // Get the front node in the queue
            Node node = q.poll();

            // Read the value of the left
            // child from the serialized data
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
            // If the value is not "#", create a new
            // left child and push it to the queue
            if (!str.equals("null")) {
                Node leftNode = new Node(Integer.parseInt(str));
                node.left = leftNode;
                q.offer(leftNode);
            }

            // Read the value of the right child
            // from the serialized data
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
            // If the value is not "#", create a
            // new right child and push it to the queue
            if (!str.equals("null")) {
                Node rightNode = new Node(Integer.parseInt(str));
                node.right = rightNode;
                q.offer(rightNode);
            }
        }

        // Return the reconstructed
        // root of the tree
        return root;
    }


    
}
