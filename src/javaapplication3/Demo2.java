package javaapplication3;

interface Felix1 {

    void felixIts();
}

interface User3 {

    void showMessage();
}

 class Demo2 implements User3, Felix1 {

    public void showMessage() {
        System.out.println("Hello from Java");
    }

    public void felixIts() {
        System.out.println("Message from Felix Its Method");
    }

    public static void main(String args[]) {
        Demo2 demo = new Demo2();
        demo.showMessage();
        demo.felixIts();
    }
}
