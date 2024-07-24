
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

public class ConvertetoInteger {
    public int convertintger(Node head){
        int ans=0;
        for(; head!=null;head=head.next){
            ans=ans*2 + head.data;
        }
        return ans;
       }
    
}
