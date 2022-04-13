package Kunal_Khushwaha;

import java.util.Scanner;

public class PrincipalTimeRate {
    public static void main(String[] args) {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double time = sc.nextDouble();
        double rate = sc.nextDouble();

        double simpleInterest = (principal*time*rate)/100;
        double totalAmount = simpleInterest;
        System.out.println(totalAmount);

    }
}
