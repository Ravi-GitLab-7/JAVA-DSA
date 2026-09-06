package trees;

public class maxNodeTree {
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
//        display(a);
        System.out.println(max(a));
    }
//    public static void display(Node root){
//        if(root== null) return ;
//        System.out.print(root.val+" ");
//        display(root.left);
//        display(root.right);
//    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int n = root.val,o = max(root.left),p = max(root.right);
        return Math.max(n,Math.max(o,p));
    }
}
