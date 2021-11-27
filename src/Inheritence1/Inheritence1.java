package Inheritence1;

class Student {
    String name, city;
    int age1;
}

// Single
class Printdata extends Student {

    void Print_data(String nam, String cty, int ag) {
        System.out.println("Name: " + nam);
        System.out.println("City: " + cty);
        System.out.println("Age: " + ag);
    }

}

//hierarchical
class Displaydata extends Student {
    void display_data(String nam, String cty, int ag) {
        System.out.println("Name: " + nam);
        System.out.println("City: " + cty);
        System.out.println("Age: " + ag);
    }

}

public class Inheritence1 {
    public static void main(String[] args) {
        Printdata obj = new Printdata();
        obj.Print_data("Nirob", "Dhaka", 21);
        Displaydata obj2 = new Displaydata();
        obj2.display_data("Mehedi Hasan Nirob"
                , "Jamalpur", 22);

    }


}
