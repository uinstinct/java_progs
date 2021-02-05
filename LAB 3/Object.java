public class Object {
    static int count = 0;

    Object() {
        count++;
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        System.out.println("Number of objects is - " + count);
    }
}