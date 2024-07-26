import java.util.PriorityQueue;

class Pair {
    int key; Node node;
    public Pair(int data,Node  key){
        this.key=data;
        this.node=key;
    }

    
}

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


public class MergerKsortedLL {
    public Node mergerk(Node[] lists){
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> Integer.compare(a.key, b.key));// to return min value 
        for(int i=0;i<lists.length;i++){
            pq.add(new Pair(lists[i].data, lists[i]));
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            temp.next=p.node;
            if(p.node.next!=null){
                pq.add(new Pair(p.node.next.data, p.node.next));
            }
            temp=temp.next;

        }
        return dummy.next;


    }
    
}
