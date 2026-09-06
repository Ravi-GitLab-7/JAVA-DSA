package trees;

public class productNonZeros {
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(0);
        Node d = new Node(4);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        d.right = h;
        d.left = g;
        display(a);
        System.out.println("ProductWithout0 = " + ProductWithout0(a));
    }
    private static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    private static int ProductWithout0(Node root) {
        // Base case
        if (root == null) return 1;
        // Ignore zero nodes
        if (root.val == 0) return ProductWithout0(root.left) * ProductWithout0(root.right);
        return root.val * ProductWithout0(root.left) * ProductWithout0(root.right);
    }
}