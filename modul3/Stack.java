import java.util.Scanner;

public class Stack {
    private char[] items;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        items = new char[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char item) {
        if (!isFull()) {
            top++;
            items[top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char item = items[top];
            top--;
            return item;
        } else {
            System.out.println("Stack is empty");
            return ' ';
        }
    }

    public String reversed(String word){
        Stack stk = new Stack(word.length());

        for (int i = 0 ; i< word.length(); i++){
            stk.push(word.charAt(i));
        }
        String reversed = "";
        while (!stk.isEmpty()){
            reversed += stk.pop();
        }return  reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan input :");
        String before = sc.nextLine();

        Stack stack = new Stack(before.length());

        String after = stack.reversed(before);
        System.out.println("reversed = "+after);
    }
}
