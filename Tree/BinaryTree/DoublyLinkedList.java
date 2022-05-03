public class DoublyLinkedList {
    public static void main(String[] args) {
        Node root = (new Node()).createSampleBinaryTree();
        Node head = ConvertToDoublyLinkedList(root);

        while(head != null)
        {
            System.out.println(head.data);
            head = head.right;
        }
    }
    static Node prev;
    public static Node ConvertToDoublyLinkedList(Node root){
        if(root==null) return root;
        
        Node head=ConvertToDoublyLinkedList(root.left);
        if(prev==null) head=root;
        else {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        ConvertToDoublyLinkedList(root.right);
        return head;
    }
}
