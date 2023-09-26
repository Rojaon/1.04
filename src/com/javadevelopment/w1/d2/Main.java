package com.javadevelopment.w1.d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Array list
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

//        Task 1
        System.out.println("\nThe difference between the largest and smallest values in the array is: " + difference(numbers) +"\n");

//        Task 2
        twoSmallest(numbers);

//        Task 3
        double num1 = 7;
        double num2 = 4;
        System.out.println("The result of the mathematical expression is: " + calculate(num1,num2) +"\n");

    }


//            Task 1
    public static int difference(List<Integer> list){
        Collections.sort(list);
        int num = (list.get(list.size() - 1) - list.get(0));

        return num;
    }

//            Task 2
    public static void twoSmallest(List<Integer> list){
        Collections.sort(list);
        int smallest = list.get(0);
        int secondSmallest = list.get(1);

        System.out.println("The smallest number is: " + smallest + "\nThe second smallest number is: " + secondSmallest +"\n");
    }

//            Task 3
    public static double calculate(double x, double y){
        double num = (Math.pow(x,2) + Math.pow(((4*y)/5 - x), 2));

        return num;
    }

}