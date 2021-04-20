package javaapplication3;

class Person6 {

    void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    void sum(double a, double b) {
        System.out.println("Sum is " + (a + b));
    }
}

class ChangeDataType {

    public static void main(String args[]) {
        Person6 p = new Person6();
        p.sum(10, 20);
        p.sum(10.56, 20.46);
    }
}
