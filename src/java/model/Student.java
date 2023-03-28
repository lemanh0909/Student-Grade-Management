/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author AD
 */
public class Student {
    private String studentId;
    private String name;
    private Date dob;
    private boolean gender;
    private int campusId;

    public Student(String studentId, String name, Date dob, boolean gender, int campusId) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.campusId = campusId;
    }

    public int getCampusId() {
        return campusId;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }



    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
}
