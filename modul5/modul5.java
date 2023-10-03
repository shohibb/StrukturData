class modul5{
    public class Node{
        int data;
        Node kiri;
        Node kanan;

        public Node(int data) {
            this.data = data;
        }
    }
    public class Btree{

        public Node root;

        public void NewNode(int data){
            root = NewNode(root , new Node(data));
        }

        private Node NewNode(Node root, Node newData){
            if (root == null){
                root = newData;
                return root;
            }
            if (newData.data < root.data){
                root.kiri = NewNode(root.kiri,newData);
            }else {
                root.kanan = NewNode(root.kanan ,newData);
            }
            return root;
        }
        public void inOrder(Node node){
            if (node != null){
                inOrder(node.kiri);
                System.out.print(node.data + " ");
                inOrder(node.kanan);
            }
        }
        public void preOrder(Node node){
            if (node != null) {
                System.out.println(node.data + " ");
                preOrder(node.kiri);
                preOrder(node.kanan);
            }
        }
        public void postOrder(Node node){
            if (node != null) {
                postOrder(node.kiri);
                postOrder(node.kanan);
                System.out.println(node.data + " ");
            }
        }
    }
    public class Main{
        public static void main(String[] args) {
            modul5 m5 = new modul5();
            modul5.Btree pohon = m5.new Btree();

            pohon.NewNode(20);
            pohon.NewNode(2);
            pohon.NewNode(25);
            pohon.NewNode(37);
            pohon.NewNode(16);

            System.out.print("\nPre Order :");
            pohon.preOrder(pohon.root);
            System.out.print("\nIn Order :");
            pohon.inOrder(pohon.root);
            System.out.print("\nPost Order :");
            pohon.postOrder(pohon.root);
        }
    }
}