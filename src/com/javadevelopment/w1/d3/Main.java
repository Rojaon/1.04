package com.javadevelopment.w1.d3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Employee num1 = new Employee("Sara","sara@gmail.com",30,55000);
        Employee num2 = new Employee("Mohammed","Mohammed@gmail.com",40,80000);
        Intern num3 = new Intern("Mosa","Mosa@gmail.com",24,18000);
        Intern num4 = new Intern("Shatha","Shatha@gmail.com",23,20000);
        Intern num5 = new Intern("Nora","Nora@gmail.com",23,21000);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);


        FileWriter writer = new FileWriter("src/com/javadevelopment/w1/d3/employees.txt", true);
        writer.write(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5);

        writer.close();
    }
}
