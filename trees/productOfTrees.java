package trees;

//class Node {
//    int val;
//    Node left;
//    Node right;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
public class productOfTrees {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        e.right = g;
        display(a);
        System.out.println("Product = " + product(a));
    }
    // Preorder Traversal
    private static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    // Product of all nodes
    private static int product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
}