import java.util.*;

class Stack {
    int top;
    int arr[];
    static Scanner sc = new Scanner(System.in);

    Stack() {
        top = -1;
        arr = new int[10];
    }

    void isEmpty() {
        if (top < 0)
            System.out.println("empty");
        else
            System.out.println("not empty");
    }

    boolean push(int x) {
        if (top >= 9) {
            System.out.println("overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed ");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            int x = arr[top--];
            return x;
        }
    }

    int top() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }
    }

    void display() {
        System.out.println("elements are");
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("1. Push\n2. Pop\n3. Top\n4. isEmpty\n5. Display\n6. Exit");
        while (true) {
            System.out.print("Enter Your Choice : ");
            int ch = sc.nextInt();
            switch (ch) {
            case 1:
                System.out.print("Enter number to push : ");
                int x = sc.nextInt();
                s.push(x);
                break;
            case 2:
                System.out.println(s.pop() + " popped from stack");
                break;
            case 3:
                System.out.println(s.top() + " is the top element of stack");
                break;
            case 4:
                s.isEmpty();
                break;
            case 5:
                s.display();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid Choice!!!");
            }
        }
    }
}