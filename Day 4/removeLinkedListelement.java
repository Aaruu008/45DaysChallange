class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class removeLinkedListelement {
    public Node removeElements(Node head, int val) {
        while (head != null && head.data == val) {
          head = head.next;
      }
         Node current=head; Node prev=null;
         while(current!=null){
          if (current.data == val) {
              // Skip the current node
              prev.next = current.next;
          } else {
              // Move the prev pointer only if we did not delete the current node
              prev = current;
          }
          current = current.next;
         }
         return head;
  
      }
    
}
