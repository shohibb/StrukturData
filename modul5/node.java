import java.util.Scanner;

class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insertNode(String data) {
        root = insertNodeRecursive(root, data);
    }

    private Node insertNodeRecursive(Node root, String data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data.compareTo(root.data) <= 0) {
                root.left = insertNodeRecursive(root.left, data);
            } else {
                root.right = insertNodeRecursive(root.right, data);
            }
            return root;
        }
    }


    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
    }

    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        inorderRecursive(root.left);
        System.out.print(root.data + " ");
        inorderRecursive(root.right);
    }

    public void postorder () {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        postorderRecursive(root.left);
        postorderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa banyak node yang ingin dimasukkan? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan node ke-" + (i + 1) + ": ");
            String data = sc.nextLine();
            bTree.insertNode(data);
        }

        System.out.print("\nHasil Preorder : ");
        bTree.preorder();

        System.out.print("Hasil Inorder : ");
        bTree.inorder();

        System.out.print("Hasil Postorder : ");
        bTree.postorder();
    }
}
