package Array_lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sort_withoutusingfun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int num[]= new int[size];
        for (int i = 0; i < size; i++) {
            num[i]= sc.nextInt();
        }
        for (int i=0;i<size;i++)
            System.out.println(num[i]);
    }
}
