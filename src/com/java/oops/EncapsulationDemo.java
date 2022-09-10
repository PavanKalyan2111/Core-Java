package com.java.oops;

class Test{

    private String Name;
    private  int Age;
    private Double Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

 /*   void details(){
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Salary);
    } */
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setName("Pavan");
        obj.setAge(21);
        obj.setSalary(6.5);
      //  obj.details();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
