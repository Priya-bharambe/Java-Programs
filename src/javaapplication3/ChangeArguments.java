package javaapplication3;

class Person5 {

    void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is " + c);
    }

    void sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Sum is " + d);
    }
}

class ChangeArguments {

    public static void main(String args[]) {
        Person5 p = new Person5();
        p.sum(10, 20);
        p.sum(10, 20, 30);
    }
}
