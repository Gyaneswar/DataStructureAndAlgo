public class Node {
    int data;
    Node left;
    Node right;
    Node(){
        data = 0;
        left = null;
        right = null;
    }

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }

    public Node createSampleBinaryTree() {
        Node root = new Node(3);
        Node child1 = new Node(0);
        Node child2 = new Node(4);
        Node child3 = new Node(2);
        Node child4 = new Node(1);

        root.left = child1;
        root.right = child2;
        child1.right = child3;
        child3.left = child4;

        return root;
    }
}
