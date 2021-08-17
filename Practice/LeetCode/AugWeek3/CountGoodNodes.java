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

        ArrayList<TreeNode> list=new ArrayList<>();
        InOrder(list, root);
        for (TreeNode TreeNode : list) {
            System.out.println(TreeNode.val);
        }
        ArrayList<TreeNode> path=new ArrayList<>();
        int ans=0;
        for(TreeNode treeNode : list){
            findPath(root, treeNode, path);
            boolean flag=false;
            for (TreeNode treeNode2 : path) {
                System.out.print("=>"+treeNode2.val);
                if(treeNode2.val>treeNode.val) {
                    flag=true;
                    break;
                }                
            }
            if(!flag && path.size()>0) ans++;
            path.clear();
            System.out.println();
        }
        System.out.println(ans);
    }

    public static void InOrder(ArrayList<TreeNode> arr,TreeNode root){
        if(root==null) return;

        InOrder(arr, root.left);
        arr.add(root);
        InOrder(arr, root.right);
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