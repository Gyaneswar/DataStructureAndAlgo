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
        Node root = new Node(13);
        Node child1 = new Node(8);
        Node child2 = new Node(6);
        Node child3 = new Node(3);
        Node child4 = new Node(5);
        Node child5 = new Node(7);
        Node child6 = new Node(2);

        root.left = child1;
        root.right = child2;
        child1.left = child3;
        child1.right = child4;
        child2.left = child5;
        child5.left = new Node(25);
        child2.right = child6;

        return root;
    }
}
