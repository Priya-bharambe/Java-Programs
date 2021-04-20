package javaapplication3;

class Person7 {

    Person7() {
        System.out.println("This is default constructor");
    }

    Person7(int age) {
        this();
        System.out.println(age);
    }
}

class ThisInCons {

    public static void main(String args[]) {
        Person7 m = new Person7(10);
    }
}
