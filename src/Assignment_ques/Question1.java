package Assignment_ques;

class Member {
    String Name;
    int Age;
    String Phone_number;
    String Address;
    int Salary;

    void printSalary() {
        System.out.println(Salary);
    }
}

class Employee extends Member {
    String specialization;

    public void data(String N, int A, String P, String Add, int S) {
        Name = N;
        Age = A;
        Phone_number = P;
        Address = Add;
        Salary = S;
        System.out.print("Salary of Employee: ");
        printSalary();
        ShowDisplay();

    }

    void ShowDisplay() {
        System.out.println();
        System.out.println("Employee Details: ");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + Phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + Salary);
        System.out.println();
        System.out.println();
    }
}

class Manager extends Member {
    String specialization;

    public void data(String N, int A, String P, String Add, int S) {
        Name = N;
        Age = A;
        Phone_number = P;
        Address = Add;
        Salary = S;
        System.out.print("Salary of Manager: ");
        printSalary();
        ShowDisplay();

    }

    void ShowDisplay() {
        System.out.println();
        System.out.println("Manager Details: ");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + Phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + Salary);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.data("Nirob", 21, "01736121659", "Jamalpur", 345000);
        Manager obj1 = new Manager();
        obj1.data("Faruk", 21, "01609751079", "Jamalpur", 70000);
    }

}
    Salary of Employee: 345000

        Employee Details:
        Name: Nirob
        Age: 21
        Phone Number: 01736121659
        Address: Jamalpur
        Salary: 345000


        Salary of Manager: 70000

        Manager Details:
        Name: Faruk
        Age: 21
        Phone Number: 01609751079
        Address: Jamalpur
        Salary: 70000