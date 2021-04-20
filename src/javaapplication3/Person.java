package javaapplication3;

abstract class User {

    abstract void showMessage();
}

class User1 extends User {

    void showMessage() {
        System.out.println("User 1 class");
    }
}

class User2 extends User {

    void showMessage() {
        System.out.println("User 2 class");
    }
}

class Person {

    public static void main(String args[]) {
        User2 user2 = new User2();
        user2.showMessage();
    }
}
