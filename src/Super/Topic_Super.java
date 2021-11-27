package Super;

class Animal {

    void love() {
        System.out.println("jannat");
    }
}

class Animal2 extends Animal {

    void love() {
        System.out.println("Tahura");
    }
}

class Dog extends Animal {
    void love() {
        //super();
        System.out.println("Liza");
    }

    void nirob() {
        super.love();
    }

}

public class Topic_Super {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.nirob();
    }
}


