package javaapplication3;

class User4 {

    void showMessage() {
        System.out.println("This is user class");
    }
}

class Person2 extends User4 {

    int age = 65;
}

class Sngleinherit extends Person2 {

    public static void main(String args[]) {
        Person2 p = new Person2();
        p.showMessage();
        System.out.println(p.age);;
    }
}
