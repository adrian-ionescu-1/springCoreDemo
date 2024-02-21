package com.sda.autowiring;

public class Employee {

    private String id;
    private String name;
    private Departmant departmant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departmant getDepartmant() {
        return departmant;
    }

    public void setDepartmant(Departmant departmant) {
        this.departmant = departmant;
    }

    public void employeeInfo() {
        System.out.println("Employee has the id: " + id);
        System.out.println("Employee has the name: " + name);
        System.out.println("Employee is working in departmant: " + departmant);
    }
}
