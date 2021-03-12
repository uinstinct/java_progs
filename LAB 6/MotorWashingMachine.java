/* LAB-8 
2. Define an interface Motor with a data member –capacity and two methods
such as run() and consume(). Define a Java class „Washing machine‟ which
implements this interface and write the code to check the value of the interface
data member thru an object of the class.
*/

interface Motor {
    int fuel = 100;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Ran = " + fuel);
    }

    public void consume() {
        System.out.println("Consume = " + fuel);

    }
}

public class MotorWashingMachine {
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.run();
        w.consume();
    }
}
