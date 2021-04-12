package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = in.nextInt();

        if (num % 2 == 0){
                System.out.println(num + " is an even number");
        }
        else {
                System.out.println(num + " is an odd number");
        }
    }

}

