import java.util.Scanner;

public class AllPossibleBinaryTrees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        


    }

    public static void generateTrees(int n,List<Integer> result,TreeNode curr,TreeNode root){        
        if(root == null){
            root = new TreeNode(0);
            curr = root;
            n = n-1;
        }

        if(n == 0){
            TreeNode res = copy(root);
            result.add(res);
            return;
        }
        
        curr.left = null;
        curr.right = null;
        generateTrees(n, result, curr , root);

        if(n >= 2){
            curr.left = new TreeNode(0);            
            curr.right = new TreeNode(0);
            generateTrees(n-2, result, curr.left, root);            
            generateTrees(n-2, result, curr.right, root);
        }

        
        return;
    }

    public static TreeNode copy(TreeNode root){

        if(root == null)
            return null;

        TreeNode x = new TreeNode(root.val);
        x.left = copy(root.left);
        x.right = copy(root.right);

        return x;
    }


    class TreeNode{
        int val;
        int left;
        int right;
        public TreeNode(int val)[
            this.val = val;
            left = null;
            right = null;
        ]
    }
}