package javaapplication3;

abstract class Bank {

    abstract int getRateOfInterest();
}

class SBI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {

    int getRateOfInterest() {
        return 9;
    }
}

class Demo1 {

    public static void main(String args[]) {
        PNB pnb = new PNB();
        int interest = pnb.getRateOfInterest();
        System.out.println("Rate of Interest is: " + interest + " %");
    }
}
