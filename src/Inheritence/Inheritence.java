package Inheritence;


class Mother {
    String name;
    int value;
    int value1;
}

                                    // Single
class child1 extends Mother {

    void Nirob(String val, int n1, int n2) {
        System.out.println("Name: " + val);
        System.out.println("Name: " + (n1 - n2));
        System.out.println("Name: " + (n2 - n1));
    }
}

                                    //hierarchical
class child2 extends Mother {

    void Nirob(String val, int n1, int n2) {
        System.out.println("Name: " + val);
        System.out.println("Name: " + (n1 - n2));
        System.out.println("Name: " + (n2 - n1));
    }
}

//Multilevel

class child3 extends child2 {

    void Nirob(String val, int n1, int n2) {
        System.out.println("Name: " + val);
        System.out.println("Name: " + (n1 - n2));
        System.out.println("Name: " + (n2 - n1));
    }
}

class child4 {
                                            //Inner Class
    class child5 {
        void Nirob(String val, int n1, int n2) {
            System.out.println("Name: " + val);
            System.out.println("Name: " + (n1 - n2));
            System.out.println("Name: " + (n2 - n1));
        }
    }

}

public class Inheritence {

    public static void main(String[] args) {
        child1 obj = new child1();
        obj.Nirob("Nirob", 10, 20);
        child4 obj2 = new child4();
        child4.child5 obj3 = obj2.new child5();
        obj3.Nirob("Mehedi Hasan Nirob", 50, 30);

    }
}
