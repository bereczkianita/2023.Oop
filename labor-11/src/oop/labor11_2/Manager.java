package oop.labor11_2;

import oop.labor11.MyDate;

public class Manager {
    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDAte ,String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
