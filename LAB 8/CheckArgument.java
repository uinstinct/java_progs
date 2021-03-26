class CheckArgs extends Exception {
    public CheckArgs(String s) {
        super(s);
    }

}

class CheckArgument {
    static void calc(int a[]) {
        System.out.print("The calculated value is ");
        for (int i = 0; i < 4; i++)
            System.out.print((a[i] * a[i]) + " ");
    }

    static void arg() throws CheckArgs {
        throw new CheckArgs("Input arguements are less than 4");
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            try {
                arg();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.exit(0);
            }
        }
        int a[] = new int[4];
        for (int i = 0; i < 4; i++)
            a[i] = Integer.parseInt(args[i]);

        calc(a);

    }
}