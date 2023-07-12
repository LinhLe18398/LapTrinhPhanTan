package com.example.quanlidiemso;

public class Student {
    private String id;
    private String name;
    private String clasS;
    private String Gender;
    private String address;
    private String score;

    public Student(String id, String name, String clasS, String gender, String address, String score) {
        this.id = id;
        this.name = name;
        this.clasS = clasS;
        Gender = gender;
        this.address = address;
        this.score = score;
    }

    public Student(){

    }

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

    public String getClasS() {
        return clasS;
    }

    public void setClasS(String clasS) {
        this.clasS = clasS;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
