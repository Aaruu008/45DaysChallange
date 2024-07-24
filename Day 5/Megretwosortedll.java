
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

public class Megretwosortedll {
    public Node mergell(Node list1, Node list2){
        Node dummy =new Node();
        Node cur=dummy;
        while(list1!=null && list2!=null ){
            if(list1.data<=list2.data){
                cur.next=list1;
                list1=list1.next;
            }
            else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next= (list1==null) ? list2:list1;
        return dummy.next;
    
       }
    
}
