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


        child3.left=null;
        child3.right=null;

        child4.left=null;
        child4.right=null;

        child5.left=null;
        child5.right=null;

        child6.left=null;
        child6.right=null;
        printTreeIN(root);

    }

    public static void printTreeIN(Node root){
        if(root==null){
            return;
        }

        printTreeIN(root.left);
        System.out.print(root.data+"->");
        printTreeIN(root.right);
        
    }



    /*

                10
            5       15
         3     6  14   19

    */
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}