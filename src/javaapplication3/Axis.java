package javaapplication3;

class Bank1 {

    int getRateOfInterest() {
        return 0;
    }
}

class SBI1 extends Bank1 {

    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class Axis {

    public static void main(String args[]) {
        SBI1 s = new SBI1();
        ICICI i = new ICICI();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
    }
}
