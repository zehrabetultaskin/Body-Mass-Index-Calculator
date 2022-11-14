package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double height=0;
        double weight=0;
        double bodyMassIndex=0;
        System.out.print("Please enter your height (in meters): ");
        height=input.nextDouble();
        System.out.print("Please enter your weight (in kilos): ");
        weight=input.nextDouble();
        bodyMassIndex=(weight/(height*height));
        System.out.print("Your Body Mass Index: "+bodyMassIndex);
    }
}
