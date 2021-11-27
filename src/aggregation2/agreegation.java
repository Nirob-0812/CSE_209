package aggregation2;

class Nadim {
    int number;
    String name;
    void sumon(int number,String name) {
        System.out.println(name);
        System.out.println(number);
    }
}
            //1)Single
            //2)Multiple
            //3)Multlevel
            //4)hierarchical
            //5)Hybrid

class Imran {
    void Sourov() {
        Nadim obj2 = new Nadim();
        obj2.sumon(05,"Nadim");
    }
}
public class agreegation {
    public static void main(String[] args) {
        Imran obj = new Imran();
        obj.Sourov();
    }
}
