package javaapplication3;

class User6 {

    void showInfo() {
        System.out.println("This is user class Herarimethod");
    }
}

class Person4 extends User6 {

    void showWarning() {
        System.out.println("This is Person class Herarimethod");
    }
}

class People1 extends User6 {

    void showSuccess() {
        System.out.println("This is People class Herarimethod");
    }
}

class HerarInherit extends Person {

    public static void main(String args[]) {
        People1 people = new People1();
        people.showSuccess();
        people.showInfo();
    }
}
