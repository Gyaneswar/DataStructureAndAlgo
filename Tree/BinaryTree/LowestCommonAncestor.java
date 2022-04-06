public class LowestCommonAncestor {
    public static void main(String[] args) {        
        Node root = (new Node()).createSampleBinaryTree();
        printTree(root);
        System.out.print("|End|\n");
    }   

    public static Node LCA(Node root,int x,int y){
        return null;
    }
    
    
    public static void printTree(Node root){
        if(root == null)
            return;

        printTree(root.left);
        System.out.print(root.data+"->");
        printTree(root.right);
        return;
    }
}
