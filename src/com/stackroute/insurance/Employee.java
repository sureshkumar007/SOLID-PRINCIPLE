package com.stackroute.insurance;

public class Employee {
        private int emp_id;
        private String name;

        public int getEmp_id () {
            return emp_id;
        }

        public void setEmp_id ( int emp_id){
            this.emp_id = emp_id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }
    }

class Surveyor extends Employee
{

public  Employee employee;
public void setEmp_id()
{
    this.setEmp_id(22);
}
public void setName()
{
    this.setName("suresh");
}

    @Override
    public String toString() {
        return "Surveyor{" +
                "employee=" + employee +
                '}';
    }
}
