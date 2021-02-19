import java.util.*;

class Rectangle {

    private int length;
    private int breadth;

    void read(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculate() {
        System.out.println("the area is " + area());
        System.out.println("the perimeter is " + perimeter());
    }

    void display() {
        System.out.println("the length is " + length + " and the breadth is " + breadth);
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

}

class rectangle_prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght and the breadth");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle rect = new Rectangle();
        rect.read(l, b);
        rect.display();
        rect.calculate();
        sc.close();
    }
}