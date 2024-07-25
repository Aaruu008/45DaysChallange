
class Node {
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
}
public class flattenaLL {
    public static Node merge2(Node list1,Node list2){
        Node dummy=new Node(-1);
        Node cur=dummy;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                cur.child=list1;
                cur=list1;
                list1=list1.child;
            }else{
                cur.child=list2;
                cur=list2;
                list2=list2.child;
            }
            cur.next=null;
        }
        cur.child=(list1==null) ? list2:list1;
        return dummy.child;
     }
     public static Node flattenall(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mergersort=flattenall(head.next);
        return merge2(head, mergersort);
     }
    
}
