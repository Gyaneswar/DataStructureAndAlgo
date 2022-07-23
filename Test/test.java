//This is a test class to test certain things about java
import java.util.*;

public class test {
    public static void main(String[] args) {        
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {
                // TODO Auto-generated method stub
                return o1.a - o2.a;
            }
            
        });

        pq.add(new Node(1,2));
        pq.add(new Node(3,2));
        pq.add(new Node(0,2));
        pq.add(new Node(-5,2));
        pq.add(new Node(-1,2));

        while(!pq.isEmpty())
            System.out.print(pq.poll().toString()+"->");


        PriorityQueue<Node> pq1 = new PriorityQueue<>(new mycomp());

        pq1.add(new Node(1,2));
        pq1.add(new Node(3,2));
        pq1.add(new Node(0,2));
        pq1.add(new Node(-5,2));
        pq1.add(new Node(-1,2));
    }    
}

class mycomp implements Comparator<Node>{

    @Override
    public int compare(Node o1, Node o2) {
        // TODO Auto-generated method stub
        return o1.a - o2.a;
    }

}


class Node{
    int a;
    int b;
    public Node(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    public String toString(){
        return a+" "+b;
    }
}