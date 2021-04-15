package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Worker")
public class Worker  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String nationality;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Worker() {
    }

    public Worker(String name, String surname, int age, String nationality, Department department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", department=" + department +
                '}';
    }
}
