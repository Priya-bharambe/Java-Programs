package javaapplication3;

class Person0 {

    void showMessage() {
        System.out.println("This is Person class");
    }
}

class MethodOverriding extends Person0 {

    void showMessage() {
        System.out.println("This is MethodOverriding Class");
    }

    public static void main(String[] args) {
        MethodOverriding d = new MethodOverriding();
        d.showMessage(); // demo class method call
        Person0 p = new Person0();
        p.showMessage(); // person class method call
    }
}
