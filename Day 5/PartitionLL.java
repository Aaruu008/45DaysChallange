
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

public class PartitionLL {
    public Node partition(Node head,int x){
        Node lessno=new Node(0);
        Node greaterno=new Node(0);
        Node less=lessno;
        Node greater=greaterno;
    
        while(head!=null){
            if(head.data<x){
                less.next=head;
                less=head;
            }
            else{
                greater.next=head;
                greater=head;
            }
            head=head.next;
    
        }
        less.next=greaterno.next;
        greater.next=null;
        return lessno.next;
    
       }
}
