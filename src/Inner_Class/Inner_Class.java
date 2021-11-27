package Inner_Class;

class Liza {
    class Nirob {

        class Nirob1 {

            class Nirob2 {

                String name = "Rakib";

            }

        }

    }

}

public class Inner_Class {

    public static void main(String[] args) {

        Liza obj = new Liza();
        Liza.Nirob obj1 = obj.new Nirob();
        Liza.Nirob.Nirob1 obj2 = obj1.new Nirob1();
        Liza.Nirob.Nirob1.Nirob2 obj3 = obj2.new Nirob2();
        System.out.println(obj3.name);
    }
}
