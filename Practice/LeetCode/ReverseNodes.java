import java.util.*;

public class ReverseNodes {
    public static void main(String[] args) {
        node root=new node();        
        node n1=new node();
        node n2=new node();
        node n3=new node();
        node n4=new node();

        root.data=1;
        root.next=n1;

        n1.data=2;
        n1.next=n2;

        n2.data=3;
        n2.next=n3;

        n3.data=4;
        n3.next=n4;

        n4.data=5;
        n4.next=null;
    


        reverseKGroup(root,3);

        while(root!=null)
        {
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static node reverseKGroup(node head, int k){
        Stack<Integer> s=new Stack<>();
        node ans=head;
        node curr=head;        
        while(curr!=null){
            int cut=k;
            node currHead=curr;
            while(cut>0){
                if(curr!=null){
                    s.push(curr.data);
                    curr=curr.next;
                    cut--;
                }else{
                    break;
                }
            }
            if(cut==0){
                reverse(s, currHead);
            }            
        }
        return ans;
    }


    public static void reverse(Stack<Integer> s,node currHead){
        while(!s.isEmpty()){
            currHead.data=s.pop();
            currHead=currHead.next;
        }
    }
}

class node{
    int data;
    node next;
    public node(){
        data=0;
        next=null;
    }

}


