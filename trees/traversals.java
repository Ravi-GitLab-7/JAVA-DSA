package trees;
import java.util.LinkedList;
import java.util.Queue;
public class traversals {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);
        Node g = new Node(10);
        Node h = new Node(11);
        Node i = new Node(12);
        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = f ; c.right = g;
        e.left = h ; f.right = i;
        System.out.print("preorder"+" ");
        preorder(a);
        System.out.print("inorder"+" ");
        inorder(a);
        System.out.print("postorder"+" ");
        postorder(a);
        System.out.println();
        System.out.print("Level Order: ");
        levelOrder(a);
    }
    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
