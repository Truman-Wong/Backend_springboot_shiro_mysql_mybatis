package com.example.studentmanagement.model;

import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, name="name")
    private String name;
    //build foreign key
    @ManyToOne
    @JoinColumn(name="university_class_id")
    private UniversityClass universityClass;

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
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
    @Override
    public String toString(){
        String str = "";
        str+= "PrimaryID: " + getId();
        str+= " Name: " + getName();

        return str;
    }

    public UniversityClass getUniversityClass() {
        return universityClass;
    }

    public void setUniversityClass(UniversityClass universityClass) {
        this.universityClass = universityClass;
    }
}
