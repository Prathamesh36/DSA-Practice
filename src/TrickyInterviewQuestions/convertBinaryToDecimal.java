package TrickyInterviewQuestions;

import java.util.Scanner;

public class convertBinaryToDecimal {

    public static int DecimalToBinary(int binary){
        int ans =0;
        int power =1;

        while(binary >0){
            int unit_digit = binary % 10; //
            ans += (unit_digit * power);
            binary /=10;
            power *=2 ; // 1 2 4 8
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int a = sc.nextInt();
        System.out.println("Decimal: "+DecimalToBinary(a));
    }
}
