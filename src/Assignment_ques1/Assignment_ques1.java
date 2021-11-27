package Assignment_ques1;

class Base {
    public void foo() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    public void foo() {
        System.out.println("Derived");
    }
}


public class Assignment_ques1 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.foo();
    }
}
