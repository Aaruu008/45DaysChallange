import java.util.ArrayDeque;
import java.util.Deque;

public class AddTwoNosII {
    public Node add2no(Node l1,Node l2){
        Deque<Node> st1=new ArrayDeque<>();
        Deque<Node> st2=new ArrayDeque<>();
        while(l1!=null){
            st1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2);
            l2=l2.next;
        }
        Node head=null;
        int carry=0;
        while (carry>0 || !st1.isEmpty()  || !st2.isEmpty()) {
            if(!st1.isEmpty()){
                carry+=st1.pop().data;
            }
            if(!st2.isEmpty()){
                carry+=st2.pop().data;
            }
            Node node= new Node(carry%10);
            node.next=head;
            head=node;
            carry /=10;
            
            
            
        }
        return head;
    }
    
}
