package Kunal_Khushwaha;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name ");
        String name = sc.next();
        System.out.println("Hello "+name+" how are you doing?");
    }
}
