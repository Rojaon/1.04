package com.javadevelopment.w1.d3;

public class Intern extends Employee{
    private final int SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
        if (salary <= SALARY_LIMIT){
            this.setSalary(salary);
        }else {
            this.setSalary(20000);
        }
    }
}
