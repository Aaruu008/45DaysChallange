class Node {
    int data;
    Node next;
    Node random;
    Node(){}

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random=null;
    }

    Node(int data, Node next,Node random) {
        this.data = data;
        this.next = next;
        this.random=random;

    }
}

public class CloneListwithRandompointer {
    public Node clonelist(Node head){
        Node temp=head;
        while(temp!=null){
            Node copynode=new Node(temp.data);

            copynode.next=temp.next;
            temp.next=copynode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            Node copynode=temp.next;

            if(temp.random!=null){
                copynode.random=temp.random.next;

            }else{
                copynode.random=null;
            }
            temp=temp.next.next;
        }
        Node dummy=new Node(-1); Node res=dummy; temp=head;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;

            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    
}
