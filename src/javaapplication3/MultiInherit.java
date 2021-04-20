package javaapplication3;

class User5 {

    void showInfo() {
        System.out.println("This is user class method");
    }
}

class Person3 extends User5 {

    void showWarning() {
        System.out.println("This is Person class method");
    }
}

class People extends Person3 {

    void showSuccess() {
        System.out.println("This is People class method");
    }
}

class MultiInherit extends Person3 {

    public static void main(String args[]) {
        People people = new People();
        people.showInfo();
        people.showWarning();
        people.showSuccess();
    }
}
