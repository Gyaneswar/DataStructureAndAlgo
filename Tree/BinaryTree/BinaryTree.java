import java.util.*;
public class BinaryTree{
    public static void main(String[] args) {   
        Node root=new Node(10);
        Node child1=new Node(5);
        Node child2=new Node(15);
        Node child3=new Node(3);
        Node child4=new Node(6);
        Node child5=new Node(14);
        Node child6=new Node(19);

        root.left=child1;
        root.right=child2;
        child1.left=child3;
        child1.right=child4;
        child2.left=child5;
        child2.right=child6;

        //Inorder traversal
        printTreeIN(root);
        System.out.println();

        //height of the binary tree
        System.out.println(height(root));

        //size of the binary tree
        System.out.println(size(root));

        //print all the nodes at k distance, here index should be passed as 0
        NodeAtKDist(root, 1, 0);

        System.out.println();
        
        //level order traversal
        LevelOrderTraversal(root);

        //left view of the binary tree
        LeftView(root);

        //right view of a binary tree
        RightView(root);

        //Top view of a binary tree
        TopView(root);

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
            System.out.println(root.data);
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