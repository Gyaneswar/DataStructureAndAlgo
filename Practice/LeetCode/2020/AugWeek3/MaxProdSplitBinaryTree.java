package AugWeek3;


//package AugWeek3;

import java.util.*;
public class MaxProdSplitBinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);        
        root.right.left=new TreeNode(6);
        //root.right.right=new TreeNode(5);

        //System.out.println();
        int total=FindSum(root);
        System.out.println(total);

        System.out.println(FindMax(root, total)+"--->"+max);
    }

    static int max=Integer.MIN_VALUE;
    public static int FindMax(TreeNode root , int total){
        if(root==null) return 0;

        int left=FindMax(root.left,total);
        int right=FindMax(root.right,total);
        int ans=root.val+left+right;
        
        int remain=total-ans;
        if((ans*remain)>max) max=ans*remain;

        return (int)(ans%1000000007);

    }

    public static int FindSum(TreeNode root){
        if(root==null) return 0;

        int left=FindSum(root.left);
        int right=FindSum(root.right);
        int ans=root.val+left+right;
        

        return ans;
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
