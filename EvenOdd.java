package Kunal_Khushwaha;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Write a program to print weather a number is even or odd, also take input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();
        if ((num%2)==0){
            System.out.println("You entered "+ num +" and this number is Even");
        }else {
            System.out.println("You entered "+ num +" and this number is Odd");
        }
    }
}
