import java.util.ArrayList;

public class AddTwoNumbers {    
    public static void main(String[] args) {
        ListNode root1=new ListNode();
        ListNode n1=new ListNode();
        ListNode n2=new ListNode();
        root1.val=2;
        root1.next=n1;
        n1.val=4;
        n1.next=n2;
        n2.val=3;
        n2.next=null;


        ListNode root2=new ListNode();
        ListNode n11=new ListNode();
        ListNode n22=new ListNode();
        root2.val=5;
        root2.next=n11;
        n11.val=6;
        n11.next=n22;
        n22.val=3;
        n22.next=null;


        AddTwoNumbers a=new AddTwoNumbers();
        ListNode ans=a.addTwoNumbers(root1, root2);

        System.out.print("[");
        while(ans!=null){
            System.out.print(ans.val);
            ans=ans.next;
            if(ans!=null)
                System.out.print(",");
        }
        System.out.println("]");

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans=new ListNode();
        int carry=0;


        ans=recursiveAddTwoNumbers(ans,carry,l1,l2);

        ListNode forward=ans.next;
        ListNode backward=ans;
        
        while(forward.next!=null){
            forward=forward.next;
            backward=backward.next;
        }

        if(forward.val==0)
            backward.next=null;
        
        return ans;
        
    }
    
    public ListNode recursiveAddTwoNumbers(ListNode ans,int carry,ListNode l1, ListNode l2){
        if(l1==null && l2==null && carry==0){
            return ans;
        }

        
        int temp=(l1!=null?l1.val:0) + (l2!=null?l2.val:0)+carry;
        if(temp>=10){
            carry=temp/10;
            ans.val=temp%10;
        }else{
            carry=0;
            ans.val=temp;            
        }
        ListNode n1=new ListNode();
        ans.next=n1;        
        recursiveAddTwoNumbers(ans.next,carry,l1!=null?l1.next:l1,l2!=null?l2.next:l2);            
        return ans;
    }


}














class ListNode{
    int val;
    ListNode next;
    public ListNode(){
        val=0;
        next=null;
    }
}