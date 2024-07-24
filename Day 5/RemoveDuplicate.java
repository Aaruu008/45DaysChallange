
class Node {
    int data;
    Node next;
    Node(){}

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class RemoveDuplicate {
    public Node removeduplicate(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;

            }
            else{temp=temp.next;}
        }
        return head;

    }   
}
