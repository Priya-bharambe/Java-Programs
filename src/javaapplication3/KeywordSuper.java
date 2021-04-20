package javaapplication3;

class Felix2{

    String name = "Priya";
}

class FelixITs extends Felix2 {

    String name = "Tushar";

    void showNames() {
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class KeywordSuper {

    public static void main(String args[]) {
        FelixITs f = new FelixITs();
        f.showNames();
    }
}
