package BinarySearchTree;
import trees.Node;
public class inorderpredecessor {
    public static Node inOrderPredecessor(Node root) {
        // If left subtree exists,
        // predecessor = rightmost node of left subtree
        if (root.left != null) {
            Node pred = root.left;
            while (pred.right != null) {
                pred = pred.right;
            }
            return pred;
        }
        return null;
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(4);
        Node g = new Node(10);
        Node h = new Node(9);
        Node i = new Node(7);
        Node j = new Node(8);
        Node k = new Node(11);

        // Left subtree
        a.left = b;
        b.left = c;
        b.right = d;
        d.right = e;
        e.left = f;

        // Right subtree
        a.right = g;
        g.left = h;
        g.right = k;
        h.left = i;
        i.right = j;
        // Find predecessor of 6
        Node pred = inOrderPredecessor(a);
        if (pred != null) {
            System.out.println("Inorder predecessor = " + pred.val);
        } else {
            System.out.println("No predecessor");
        }
    }
}