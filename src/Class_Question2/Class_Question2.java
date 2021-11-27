package Class_Question2;

class Base {
    public void Prnt() {
        System.out.println("Base");
    }
}

class derived extends Base {
    public void Prnt() {
        System.out.println("Derived");
    }
}

public class Class_Question2 {

    public static void doprint(Base obj) {
        obj.Prnt();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new derived();
        derived z = new derived();

        doprint(x);
        doprint(y);
        doprint(z);
    }
}
