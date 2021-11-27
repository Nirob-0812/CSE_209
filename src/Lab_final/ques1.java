package Lab_final;
class Student{
    String name;
    String city;
    int age;
    void PrintData(String N,String C,int A){
        name=N;
        city=C;
        age=A;
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Age: "+age);
    }
}
public class ques1 {
    public static void main(String[] args) {
        Student S1=new Student();
        Student S2=new Student();
        S1.PrintData("Mehedi Hasan Nirob","Jamalpur",21);
        S2.PrintData("Abdur Rahman Alahi","Comilla",20);
    }
}
