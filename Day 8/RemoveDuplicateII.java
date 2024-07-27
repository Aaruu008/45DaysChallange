package Day 8;

public class RemoveDuplicateII {
    public Node remove(Node head){
        Node dummy=new Node(0,head);
        Node prev=dummy;
        while(head!=null){
            while(head.next!=null && head.data==head.next.data){
                head=head.next;
            }
            if(prev.next==head){
                prev=prev.next;
            }
            else{
                prev.next=head.next;
                head=head.next;
            }
            return dummy.next;
        }
    }
    
}
