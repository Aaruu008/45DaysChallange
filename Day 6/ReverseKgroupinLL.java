
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

public class ReverseKgroupinLL {
    public  static Node getk(Node temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return  temp;
    }
    public static Node  reverse(Node temp){
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        return prev;
    }
    public Node kreverse(Node head,int k){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node kthnode=getk(temp,k);
            if(kthnode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            Node nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                prev.next=kthnode;
            }
            prev=temp;
            temp=nextnode;

        }
        return head;

    }
   
}
