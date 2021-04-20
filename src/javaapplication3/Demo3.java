package javaapplication3;

class Person1 {

    int age = 65;
}

class Demo3 extends Person1 {

    int salary = 20000;

    public static void main(String args[]) {
        Demo3 d = new Demo3();
        System.out.println(d.age);
        System.out.println(d.salary);
    }
}
