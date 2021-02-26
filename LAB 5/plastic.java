/* LAB 7
1. A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per 
cubic ft. Implement it in Java to calculate the cost of plastic as per the
dimensions given by the user where 3D inherits from 2D.
*/

import java.util.*;

class two_D {
    int a, b;

    two_D() {

    }

    two_D(int a1, int b1) {
        a = a1;
        b = b1;
    }

    void calculate() {
        int c = a * b;
        System.out.println("total Price " + (40 * c));
    }
}

class three_D extends two_D {
    int c;

    three_D(int a1, int b1, int c1) {

        super(a1,b1);
        c = c1;

    }

    void calculate() {
        int d = super.a * super.b * c;
        System.out.println("Total price " + (60 * d));
    }
}

public class plastic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        int a = in.nextInt();
        System.out.println("enter the width");
        int b = in.nextInt();
        System.out.println("enter the height");
        int c = in.nextInt();

        two_D ob1 = new two_D(a, b);
        ob1.calculate();

        three_D ob = new three_D(a, b, c);
        ob.calculate();
        in.close();

    }
}