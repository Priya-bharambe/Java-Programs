package javaapplication3;

abstract class Felix {

    abstract void showMessage();
}

class Demo extends Felix {

    void showMessage() {
        System.out.println("This is message from method 1");
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.showMessage();
    }
}
