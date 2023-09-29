package com.javadevelopment.w1.d3;

public class Employee {
    private String name, email;
    private int age;
    private int salary;

    public Employee(String name, String email, int age, int salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

