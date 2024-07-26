

/*class Node {
    public int data;
    public Node next;
    public Node child;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.child = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.child = null;
    }
    Node (int data,Node next){
        this.data=data;
        this.next=next;
        this.child=null;
    }
    Node(int data, Node next, Node child)
    {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}*/

public class SortaLL {
    public static Node findmiddle(Node head){
        Node slow=head; Node fast=head.next;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merger2(Node list1,Node list2){
        Node dummy=new Node(-1);
        Node cur=dummy;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next=(list1==null) ? list2:list1;
        return dummy.next;
    }
    public static Node sortall(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node middle=findmiddle(head);
        Node lefthead=head; Node righthead=middle.next;
        middle.next=null;
        lefthead=sortall(lefthead);
        righthead=sortall(righthead);
        return merger2(lefthead, righthead);
    }

    
}
