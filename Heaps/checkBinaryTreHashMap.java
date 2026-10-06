package Heaps;

// Node class represents one node of the Binary Tree
class Node {

    // Stores the value of the node
    int val;

    // Reference to the left child
    Node left;

    // Reference to the right child
    Node right;

    // Constructor to create a new node
    Node(int val) {

        // Assign the given value to the node
        this.val = val;
    }
}


// Main class
public class checkBinaryTreHashMap {

    public static void main(String[] args) {

        // Creating the root node with value 10
        Node a = new Node(10);

        // Creating another node with value 8
        Node b = new Node(8);

        // Creating another node with value 7
        Node c = new Node(7);

        // Creating another node with value 6
        Node d = new Node(5);

        // Creating another node with value 4
        Node e = new Node(4);


        // Connecting node b as the left child of a
        a.left = b;

        // Connecting node c as the right child of a
        a.right = c;


        // Connecting node d as the left child of b
        b.left = d;

        // Connecting node e as the right child of b
        b.right = e;


        // Calling isMaxHeap() to check whether
        // the given Binary Tree is a Max Heap
        // and printing the result
        System.out.println(isMaxHeap(a));
    }


    private static boolean isMaxHeap(Node root) {

        // Count the total number of nodes in the tree
        int n = size(root);

        // A Binary Tree is a Max Heap when:
        //
        // 1. It follows Max Heap property
        //    Parent >= Children
        //
        // 2. It is a Complete Binary Tree
        //
        // && means BOTH conditions must be true
        return isMHeap(root) && isCBT(root, 0, n);
    }

    private static boolean isMHeap(Node root) {

        // If root is null, there is nothing to check
        // Therefore, return true
        if (root == null)
            return true;

        // First check whether left child exists
        if (root.left != null) {

            if (root.val < root.left.val)
                return false;
        }
        if (root.right != null) {

            if (root.val < root.right.val)
                return false;
        }
        return isMHeap(root.left) && isMHeap(root.right);
    }

    private static boolean isCBT(Node root, int i, int n) {

        // If there is no node at this position,
        // then there is no problem
        if (root == null)
            return true;


        // If the index becomes equal to or greater
        // than the total number of nodes,
        // the tree is NOT complete
        if (i >= n)
            return false;
        return isCBT(root.left, 2 * i + 1, n)
                && isCBT(root.right, 2 * i + 2, n);
    }



    private static int size(Node root) {

        // If root is null, there are no nodes
        return 0;
    }
}