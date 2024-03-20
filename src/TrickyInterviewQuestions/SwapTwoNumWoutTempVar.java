package TrickyInterviewQuestions;

import java.util.Scanner;

public class SwapTwoNumWoutTempVar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("----After swap----");
        System.out.println("first number: "+a);
        System.out.println("second number: "+b);

    }
}
