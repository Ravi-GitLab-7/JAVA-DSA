package trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class traversals {
    // Pair class for levelOrder()
    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = f ; c.right = g;
        e.left = h ; f.right = i;
        System.out.println("preorder"+" ");
        preorder(a);
        System.out.println("inorder"+" ");
        inorder(a);
        System.out.println("postorder"+" ");
        postorder(a);
        System.out.println();
//        System.out.print("Level Order: ");
//        levelOrder(a);
//        System.out.print("Enter n: ");
//        n = sc.nextInt();
        for(int x = 0;x<3;x++){
            n = x;
            nThLevel(a,0);
            System.out.println();
        }
    }
    private static void
    evelOrder(Node root) {
        int prevLevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root != null)
            q.add(new Pair(root, 0));
        while (q.size() > 0) {
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if (lvl != prevLevel) {
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val + " ");
            if (temp.left != null)
                q.add(new Pair(temp.left, lvl + 1));
            if (temp.right != null)
                q.add(new Pair(temp.right, lvl + 1));
        }
    }
    public static void nThLevel(Node root,int level){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
    }
//    private static void levelOrder(Node root) {
//        Queue<Node> q = new LinkedList<>();
//        if (root != null) q.add(root);
//        while (q.size() > 0) {
//            Node front = q.remove();
//            System.out.print(front.val + " ");
//            if (front.right != null)
//                q.add(front.right);
//            if (front.left != null)
//                q.add(front.left);
//        }
//    }
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
