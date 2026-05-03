package trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val ){
        this.val= val;
    }
}
public class implementation {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(14);
        Node d = new Node(5);
        Node e = new Node(4);
        Node f = new Node(8);
        a.left = b; a.right= c;
        b.left = d; b.right = e;
        c.left = e;
        display(a);
//        a.left.right.val= 30;  // change value
//        System.out.println(a.left.right.val);
//        System.out.println(a.right.left.val);
    }
    private static void display(Node root){
        if(root == null) return;  // base case
        System.out.print(root.val+" ");
        display(root.left); // left subtree
        display(root.right);  // right subtree
    }
}
