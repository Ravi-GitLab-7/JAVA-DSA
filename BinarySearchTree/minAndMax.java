package BinarySearchTree;
import trees.Node;
public class minAndMax {
    public static void main(String[] args) {
        Node a = new Node(25);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(15);
        Node e = new Node(22);
        Node f = new Node(27);
        Node g = new Node(70);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.println(max(a));
    }
    public static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        if (root.right == null) return root.val;
        return max(root.right);
    }
}