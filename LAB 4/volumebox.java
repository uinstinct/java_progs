import java.util.*;
import BoxPk.Box;


class Demo {
    Box b;

    Demo() {
        b = new Box();
    }

    void input(int l, int w, int h) {
        b.length = l;
        b.width = w;
        b.height = h;
    }

    void output() {
        int vol = b.volume();
        System.out.println("the volume is " + vol);
    }
}

public class volumebox {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        Demo d = new Demo();

        d.input(l, w, h);
        d.output();

        sc.close();
    }
}
