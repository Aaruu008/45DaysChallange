
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
public class checkforpalindromLL {
    public Node reverse(Node head){
        if(head==null || head.next==null){return head;}
        Node temp=head; Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if(head==null || head.next==null) return true;
        Node fast=head; Node slow=head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node newh=reverse(slow.next);
        Node first=head; Node second=newh;
        while(second!=null){
            if(first.data!=second.data){
                reverse(newh);
                return false;
            }
            first=first.next;
            second=second.next;
            

        }
        reverse(newh);
        return true;
    }
}
