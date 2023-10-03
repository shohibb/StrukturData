import java.util.Scanner;

public class SortList {

    static class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public void tmb(int data)
    {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.next = newNode;

            tail = newNode;
        }
    }


    public void sorting()
    {


        Node current = head, index;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next;

                while (index != null) {

                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void print()
    {
        Node current = head;

        if (head == null) {
            System.out.println("kosong");
            return;
        }
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        SortList sList = new SortList();

        sList.tmb(8);
        sList.tmb(7);
        sList.tmb(1);
        sList.tmb(4);
        sList.tmb(6);
        sList.tmb(2);
        sList.tmb(3);

        System.out.print("before: ");
        sList.print();

        System.out.println("enter new element : ");
        int newdata = Sc.nextInt();
        sList.tmb(newdata);sList.print();
        sList.sorting();


        System.out.print("after: ");
        sList.print();
    }
}
