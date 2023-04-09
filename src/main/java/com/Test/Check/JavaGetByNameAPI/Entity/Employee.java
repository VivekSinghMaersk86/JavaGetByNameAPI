package com.Test.Check.JavaGetByNameAPI.Entity;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="employeedetails")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="eid")
    int eid;

    @Column(name="Ename")
    String name;

    @Column(name="salary")
    String salary;

    @Column(name="Desination")
    String designation;

    @Column(name="Empemail")
    String empemail;

    @Column(name="Address")
    String address;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
