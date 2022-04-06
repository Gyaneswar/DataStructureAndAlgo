class Result{
    int res;
}

public class Diameter {
    public static void main(String[] args) {
        Node root=new Node(13);
        Node child1=new Node(8);
        Node child2=new Node(6);
        Node child3=new Node(3);
        Node child4=new Node(5);
        Node child5=new Node(7);
        Node child6=new Node(2);

        root.left=child1;
        root.right=child2;
        child1.left=child3;
        child1.right=child4;
        child2.left=child5;
        child2.right=child6;
        child5.left=new Node(25);        

        int h = height(root);
        System.out.println(h);
        Result r = new Result();
        int diameter = diameter(root, r);
        System.out.println(r.res);
    }

    public static int diameter(Node root,Result res){
        if(root == null){
            return 0;
        }

        int left = diameter(root.left,res);
        int right = diameter(root.right,res);
        res.res = Math.max(res.res, 1 + left + right);
        return 1 + Math.max(left,right);

    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = 1 + height(root.left);
        int right = 1 + height(root.right);
        return Math.max(left,right);
    }
}


class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
