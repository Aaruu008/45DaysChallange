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
public class MiddleofLinkedList {
    public Node middleNode(Node head) {
        if(head==null || head.next==null) return head;
        Node slow=head; Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;;
        }
        return slow;
        
    }
}
