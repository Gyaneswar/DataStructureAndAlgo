import java.util.*;
public class BinaryTree{
    public static void main(String[] args) {   
        Node root=new Node(13);
        Node child1=new Node(8);
        Node child2=new Node(5);
        Node child3=new Node(3);
        Node child4=new Node(5);
        Node child5=new Node(3);
        Node child6=new Node(2);

        root.left=child1;
        root.right=child2;
        child1.left=child3;
        child1.right=child4;
        child2.left=child5;
        child5.left=new Node(25);
        child2.right=child6;

        //Inorder traversal
        // printTreeIN(root);
        // System.out.println();

        // //height of the binary tree
        // System.out.println(height(root));

        // //size of the binary tree
        // System.out.println(size(root));

        // //print all the nodes at k distance, here index should be passed as 0
        // NodeAtKDist(root, 1, 0);

        // System.out.println();
        
        // //level order traversal
        // LevelOrderTraversal(root);

        // //left view of the binary tree
        // LeftView(root);

        // //right view of a binary tree
        // RightView(root);

        // //Top view of a binary tree
        // TopView(root);

        // //child sum prop
        // System.out.println("Children sum property : "+ (ChildSumProp(root)!=-1?"True":"False"));

        // //check for balanced binary tree if the difference in the height is greater than 1 it is not balanced
        // System.out.println("Is the tree balanced : "+(IsBalanced(root)!=-1?"True":"False"));

        int in[]={5,3,6,2,7,4,8};
        int pre[]={2,3,5,6,4,7,8};
        Node createdRoot=ConstTreeInPreOrderTrav(in,pre,0,6);
        printTreeIN(createdRoot);

        //Spiral Traversal
        SpiralTraversal(root);
    }

    public static void printTreeIN(Node root){
        if(root==null){
            return;
        }

        printTreeIN(root.left);
        System.out.print(root.data+"->");
        printTreeIN(root.right);
        
    }

    public static void NodeAtKDist(Node root,int k,int index){
        if(root==null){
            return;
        }
        if(index == k) System.out.print(root.data+"->");
        NodeAtKDist(root.left,k,index+1);
        NodeAtKDist(root.right,k,index+1);                    
    }
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(1+height(root.left),1+height(root.right));
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }        
        return 1+size(root.left)+size(root.right);
    }

    public static void LevelOrderTraversal(Node root){
        System.out.println("---------------- Level order traversal begins ------------");
        Queue<Node> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
            //System.out.println(root.data);
        }
        
        Node curr=root;
        Node flag=new Node(-1);
        q.add(flag);

        while(!q.isEmpty()){
            curr=q.poll();                            

            if(curr.data!=-1){
                System.out.print(curr.data+"->");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);                               
            }
            else {   
                if(!(q.size()==0 && curr.data==-1))
                    q.add(flag);
                System.out.println();
            }
        }

        System.out.println("---------------- Level order traversal ends ------------");
    }

    public static void LeftView(Node root){
        System.out.println("------- Left view starts ------------");
        Queue<Node> q=new LinkedList<>();
        int prev=0;
        if(root!=null){
            q.add(root);
            System.out.println(root.data+"->");
        }
        
        Node curr=root;
        Node flag=new Node(-1);
        prev=root.data;
        q.add(flag);        

        while(!q.isEmpty()){            
            curr=q.poll(); 


            if(curr.data!=-1){
                if(prev==-1)
                    System.out.println(curr.data+"->");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);                               
            }
            else {   
                if(!(q.size()==0 && curr.data==-1))
                    q.add(flag);
            }
            prev=curr.data;
        }
        System.out.println("------- Left view ends ------------");
    }

    public static void RightView(Node root){
        System.out.println("------- right view starts ------------");
        Queue<Node> q=new LinkedList<>();
        int prev=0;
        if(root!=null){
            q.add(root);            
        }
        
        Node curr=root;
        Node flag=new Node(-1);
        prev=root.data;
        q.add(flag);        

        while(!q.isEmpty()){            
            curr=q.poll(); 


            if(curr.data!=-1){                
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);                               
            }
            else {                   
                System.out.println(prev+"->");
                if(!(q.size()==0 && curr.data==-1))
                    q.add(flag);
            }
            prev=curr.data;
        }
        System.out.println("------- right view ends ------------");
    }

    public static void TopView(Node root){
        System.out.println("------- Top view starts ------------");

        LeftView(root.left);
        System.out.println(root.data);
        RightView(root.right);


        System.out.println("------- Top view ends ------------");
    }

    public static int ChildSumProp(Node root) {
        if (root == null)
            return 0;

        int res=0;
        if(root.left==null && root.right==null){
            return root.data;
        }else{
            int left=ChildSumProp(root.left);
            int right=ChildSumProp(root.right);
            if(left==-1 || right==-1)
                return -1;
            else
                res=left+right;
        }
        if(root.data==res)
            return root.data;
        else 
            return -1;        
    }

    public static int IsBalanced(Node root){
        if(root==null) return 0;

        int left=IsBalanced(root.left);
        if(left==-1) return -1;
        int right=IsBalanced(root.right);
        if(right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;
        else return 1+Math.max(left,right);
    }

    static Node prev;
    public static Node ConvertToDoublyLinkedList(Node root){
        if(root==null) return root;
        
        Node head=ConvertToDoublyLinkedList(root.left);
        if(prev==null) head=root;
        else {
            root.left=prev;
            prev.right=root;
        }
        ConvertToDoublyLinkedList(root.right);
        return head;
    }

    static int preIndex=0;
    public static Node ConstTreeInPreOrderTrav(int in[],int pre[],int start,int end){
        if(start>end)
            return null;
            
        Node root=new Node(pre[preIndex++]);

        int inIndex=0;
        for(int i=start;i<=end;i++){
            if(in[i] == root.data){
                inIndex=i;
                break;
            }
        }

        root.left=ConstTreeInPreOrderTrav(in, pre, start, inIndex-1);
        root.right=ConstTreeInPreOrderTrav(in, pre, inIndex+1, end);

        return root;        
    }

    public static void SpiralTraversal(Node root){
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        System.out.println();
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node curr=s1.pop();
                System.out.print(curr.data+"->");
                if(curr.left!=null) s2.push(curr.left);
                if(curr.right!=null) s2.push(curr.right);
            }
            while(!s2.isEmpty()){
                Node curr=s2.pop();
                System.out.print(curr.data+"->");
                if(curr.left!=null) s1.push(curr.right);
                if(curr.right!=null) s1.push(curr.left);
            }   
        }
    }
}   
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}