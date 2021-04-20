package javaapplication3;

public class BlockStatic {

    static {
        System.out.println("This line is executed first...");
    }

    public static void main(String args[]) {
        System.out.println("This is main method...");
    }
    

}
