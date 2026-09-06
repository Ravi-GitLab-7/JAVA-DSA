package trees;

public class sizeOfTree {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(100);
        Node e = new Node(8);
        Node f = new Node(9);
        Node g = new Node(10);
        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        e.right = g ; c.right = f;
        System.out.println();
        System.out.println(size(a));
    }
    private static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left)+ size(root.right);
    }
}
