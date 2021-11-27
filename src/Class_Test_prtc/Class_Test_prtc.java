package Class_Test_prtc;

import java.util.Scanner;

public class Class_Test_prtc {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter A Digit: ");
        int num=input.nextInt();
        int c=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime ");
    }
}
