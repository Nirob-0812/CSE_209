package Agreegation;

class Oparation {
    int sqr(int Liza) {
        return Liza * Liza;

    }
}

class Catch_Value {
    double pi = 3.1416;
    double circle(int radius) {
        Oparation obj = new Oparation();
        double output = obj.sqr(radius);
        return output * pi;
    }

}

public class Agreegation {
    public static void main(String[] args) {
        Catch_Value obj2 = new Catch_Value();
        double result = obj2.circle(8);
        System.out.print("result = ");
        System.out.format("%.2f", result);
    }
}
