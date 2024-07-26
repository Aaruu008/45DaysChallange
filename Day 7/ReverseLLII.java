
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


public class ReverseLLII {
    public static Node reverbetween(Node head,int left,int right){
        if(left==1){
            return reverse(head,right);
        }
        head.next=reverbetween(head.next, left-1, right-1);
        return head;
    }
    public static Node reverse(Node head,int n){
        if(n==1) return head;

        Node newhead=reverse(head.next, n-1);
        Node headnext=head.next;
        head.next=headnext.next;
        headnext.next=head;
        return  newhead;
    }
    
}
