public class BST {
    public static void main(String[] args) {
        int arr[]={8,5,10,7,12,2,6};
        Node root=new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            Create(root, arr[i]);            
        }

        PrintIn(root);
        System.out.println();

        System.out.println("Does this element exist : "+Search(root, 6));
        

        Delete(root, 6);
        PrintIn(root);

        System.out.println();

        int max=Floor(root, 13);
        System.out.println(max==0? null:max);        
    }

    public static void PrintIn(Node root){
        if(root==null) return;

        PrintIn(root.left);
        System.out.print("->"+root.data);
        PrintIn(root.right);

    }

    public static void Create(Node root,int data){
        Node curr=root;
        Node prev=curr;
        while(curr!=null){
            if(data>curr.data){
                prev=curr;
                curr=curr.right;
            }else{
                prev=curr;
                curr=curr.left;
            }            
        }
        if(data>prev.data){
            prev.right=new Node(data);
        }else{
            prev.left=new Node(data);
        }
    }

    public static boolean Search(Node root,int data){
        Node curr=root;
        while(curr!=null){
            if(curr.data==data)
                return true;
            if(data>curr.data){
                curr=curr.right;
            }
            else curr=curr.left;
        }
        return false;
    }

    public static Node Delete(Node root,int x){
        if(root==null) return null;

        if(root.data>x) root.left=Delete(root.left, x);
        else if(root.data<x) root.right=Delete(root.right, x);
        else{
            if(root.left == null) return root.right;
            else if(root.right==null ) return root.left;
            else{
                Node succ=GetSucc(root);
                root.data=succ.data;
                root.right=Delete(root.right, succ.data);
            }            
        }        
        return root;
    }    

    public static Node GetSucc(Node root){
        Node curr=root;
        curr=curr.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;            
        }
        return curr;
    }
    
    public static int Floor(Node root,int x){
        Node curr=root;
        int max=0;
        while(curr!=null){
            if(curr.data==x) return curr.data;
            if(x>curr.data) curr=curr.right;
            else curr=curr.left;
            
            if(curr.data>max && curr.data<x)
                max=curr.data;
        }
        return max;
    }
}

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
