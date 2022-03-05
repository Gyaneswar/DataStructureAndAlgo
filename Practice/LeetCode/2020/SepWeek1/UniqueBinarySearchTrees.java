package SepWeek1;

import java.util.*;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateTrees(1, n);
    }    

    public static List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result=new ArrayList<>();

        if(start> end) {
            result.add(null);
            return result;
        }

        if(start==end)  {
            result.add(new TreeNode(start));
            return result;
        }

        for(int i=start;i<=end;i++){
            List<TreeNode> left=generateTrees(start, i-1);
            List<TreeNode> right=generateTrees(i+1, end);

            for(TreeNode j: left){
                for(TreeNode k: right){
                    TreeNode root=new TreeNode(i);
                    root.left=j;
                    root.right=k;
                    result.add(root);
                }
            }
        }
        return result;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
