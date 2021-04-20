package javaapplication3;

 class Getter {

    private String name;
// Getter

    public String getName() {
        return name;
    }
// Setter

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Encaps {

    public static void main(String[] args) {
        Getter getter = new Getter();
        getter.setName("Felix ITs");
        System.out.println(getter.getName());
    }

}
