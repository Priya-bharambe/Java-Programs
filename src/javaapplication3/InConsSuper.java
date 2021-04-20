package javaapplication3;

class Felix4 {

    Felix4() {
        System.out.println("This is Felix class");
    }
}

class FelixITs2 extends Felix4 {

    FelixITs2() {
        super();
        System.out.println("This is FelixITs Class");
    }
}

public class InConsSuper {

    public static void main(String args[]) {
        FelixITs2 f = new FelixITs2();
    }

}
