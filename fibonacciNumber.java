package Kunal_Khushwaha;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previous = 0;
        int index = 1;
        int count = 2;
        while (count<=n){
            int temp = index;
            index = index+previous;
            previous = temp;
            count++;
        }
        System.out.println(index);
    }
}
