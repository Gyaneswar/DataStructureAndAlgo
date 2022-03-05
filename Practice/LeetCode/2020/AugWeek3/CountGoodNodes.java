//package AugWeek3;

import java.util.*;

public class CountGoodNodes {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.left=new TreeNode(3);
        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(5);
        TreeNode max=new TreeNode();
        max.val=Integer.MIN_VALUE;
        TreeNode prevMax=new TreeNode();
        max.val=Integer.MIN_VALUE;
        ArrayList<TreeNode> pq=new ArrayList<>();
        InOrder(root,pq,max);
        
        System.out.println(ans);
    }

    static int ans=0;
        
    public static void InOrder(TreeNode root,ArrayList<TreeNode> path,TreeNode max){
        if(root==null) return;
        
        path.add(root);
        if(root.val>max.val){
            max.val=root.val;
        } 

        InOrder(root.left,path,max);
        InOrder(root.right,path,max);
        if(root.val==max.val){
            path.remove(path.size()-1);
            ans++;
            max.val=findMax(path);
        }else {
            path.remove(path.size()-1);
        }
    }   

    public static int findMax(ArrayList<TreeNode> arr){
        int max=Integer.MIN_VALUE;
        for (TreeNode integer : arr) {
            if(integer.val>max) max=integer.val;
        }
        return max;
    }

    public static boolean findPath(TreeNode root,TreeNode n,ArrayList<TreeNode> path){
        if(root ==  null) return false;

        path.add(root);
        if(root==n){
            return true;
        }        
        
        if(findPath(root.left,n,path) || findPath(root.right,n,path))
            return true;
        path.remove(path.size()-1);
        return false;
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