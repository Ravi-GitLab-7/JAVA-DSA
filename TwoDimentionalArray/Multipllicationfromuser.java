package TwoDimentionalArray;
public class Multipllicationfromuser {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}}; // Matrix a (2x3)
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}}; // Matrix b (3x4)

        // Check if multiplication is possible
        if (a[0].length != b.length) {  // Columns of a must be equal to rows of b
            System.out.println("Multiplication is not possible: Incompatible matrices.");
        } else {
            int[][] c = new int[a.length][b[0].length]; // Resultant matrix c (2x4)

            // Perform multiplication
            for (int i = 0; i < a.length; i++) {  // Loop through rows of a
                for (int j = 0; j < b[0].length; j++) {  // Loop through columns of b
                    for (int k = 0; k < b.length; k++) {  // Loop through rows of b
                        c[i][j] += a[i][k] * b[k][j];  //  dot product
                    }
                }
            }

            // Print matrices
            System.out.println("Matrix A:");
            print(a);
            System.out.println("Matrix B:");
            print(b);
            System.out.println("Resultant Matrix C (A x B):");
            print(c);
        }
    }
}