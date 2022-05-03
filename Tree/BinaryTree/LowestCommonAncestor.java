import java.util.ArrayList;



public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = (new Node()).createSampleBinaryTree();
        printTree(root);
        System.out.print("|End|\n");

        int x = 8;
        int y = 13;

        ArrayList<Node> path1 = new ArrayList<>();
        findPath(root, x, path1);
        ArrayList<Node> path2 = new ArrayList<>();
        findPath(root, y, path2);

        for(int i=0;i<path1.size();i++)
            System.out.print(path1.get(i).data+"->");


        System.out.println();
        for(int i=0;i<path2.size();i++)
            System.out.print(path2.get(i).data+"->");

        System.out.println();

        Node lca = null;
        int index = -1;
        for(int i=0;i<path1.size();i++){
            if(i == path2.size())
                break;
            if(path1.get(i)==path2.get(i)){
                lca = path1.get(i);
                index = i;
            }else{
                break;
            }
        }

        System.out.println(lca.data);

        StringBuilder result = new StringBuilder("");        

        search(lca, y, result);

        for(int i=index+1;i<path1.size();i++){
            result.insert(0, 'U');
        }

        System.out.println(result.toString());


        
    }

    public static boolean search(Node root,int key,StringBuilder direction){
        if(root == null){
            return false;
        }
        if(root.data == key)
            return true;

        boolean left = search(root.left,key,direction);
        boolean right = search(root.right,key,direction);

        if(left && root.left !=null)
            direction.insert(0,'L');
        
        if(right && root.right != null)
            direction.insert(0,'R');


        if(!left && !right)
            return false;
        

        return true;



    }

    public static boolean findPath(Node root, int key, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            path.add(root);
            return true;
        }

        path.add(root);
        boolean left = findPath(root.left, key, path);
        if (!left && root.left != null) {
            path.remove(path.size() - 1);
        }

        boolean right = findPath(root.right, key, path);
        if (!right && root.right != null) {
            path.remove(path.size() - 1);
        }

        if (!left && !right) {
            return false;
        }

        return true;
    }

    public static void printTree(Node root) {
        if (root == null)
            return;

        printTree(root.left);
        System.out.print(root.data + "->");
        printTree(root.right);
        return;
    }
}