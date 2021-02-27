package com.rbr.concepts;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Scannerdemo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the roll no : ");
        int roll_no=sc.nextInt();

        System.out.print("\nenter name :");
        String name=sc.next();

        System.out.print("\nenter the fess ");
        Double fee=sc.nextDouble();

        System.out.println("All the data entered by students are " + roll_no+ "," +name +"  &  "+ fee );
        sc.close();
    }
}
