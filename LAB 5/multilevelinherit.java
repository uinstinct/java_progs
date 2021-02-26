/* LAB 7
2. Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box
(length, width, height, thick)
*/

import java.util.*;

class plate {
    int length, breadth;

    plate() {
        System.out.println("Inside plate");
    }

}

class box extends plate {
    int hieght;

    box() {
        System.out.println("Inside box");
    }

}

class wooden extends box {
    int thick;

    wooden(int a, int b, int c, int d) {
        thick = d;
        length = a;
        breadth = b;
        hieght = c;
        System.out.println("Inside wooden");
    }

    void display() {
        System.out.println("Thickness = " + thick);
        System.out.println("length = " + length);
        System.out.println("breadth = " + breadth);
        System.out.println("hieght = " + hieght);

    }

}

public class multilevelinherit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the length");
        int a = in.nextInt();
        System.out.println("enter the breadth");
        int b = in.nextInt();
        System.out.println("enter the height");
        int c = in.nextInt();
        System.out.println("enter the thickness");
        int d = in.nextInt();
        wooden ob = new wooden(a, b, c, d);

        ob.display();
        in.close();

    }
}
