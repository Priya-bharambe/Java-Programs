package javaapplication3;

class Age {

    int age = 25;

    void show() {
        int age = 35;
        System.out.println(this.age);
    }
}

class KeywordThis {

    public static void main(String args[]) {
        Age p = new Age();
        p.show();
    }
}
