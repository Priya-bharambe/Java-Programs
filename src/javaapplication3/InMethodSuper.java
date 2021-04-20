package javaapplication3;

class Felix3 {

    void method1() {
        System.out.println("Method 1 in Felix Class...");
    }
}

class FelixITs1 extends Felix3 {

    void method1() {
        System.out.println("Method 1 in FelixITs Class...");
    }

    void method2() {
        System.out.println("Method 2 in FelixITs Class...");
    }

    void showMessage() {
        super.method1();
        method1();
    }
}

public class InMethodSuper {

    public static void main(String args[]) {
        FelixITs1 f = new FelixITs1();
        f.showMessage();
    }

}
