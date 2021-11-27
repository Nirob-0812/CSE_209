package LAb_final1;

class Nirob{
    Nirob(String name){
        System.out.println("Name: "+name);
        System.out.println();
    }
    Nirob(String name,int roll){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println();
    }
    Nirob(String name,int roll,String batch){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Batch: "+batch);
        System.out.println();
    }


}
class Method{
    void Dog(String name){
        System.out.println("Name: "+name);
        System.out.println();
    }
    void Dog(String name, int roll){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println();
    }
    void Dog(String name, int roll, String batch){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Batch: "+batch);
        System.out.println();
    }
}
public class ques2 {
    public static void main(String[] args) {
        Nirob obj= new Nirob("Nirob");
        Nirob obj1= new Nirob("Nirob",04);
        Nirob obj2= new Nirob("Nirob",04,"D-59");
        Method ob3= new Method();
        ob3.Dog("Rakib");
        ob3.Dog("Rakib",30);
        ob3.Dog("Rakib",30,"D-59");


    }

}
