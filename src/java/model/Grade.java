/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class Grade {
    private String studentId;
    private String subjectId;
    private float mark;

    public Grade(String studentId, String subjectId, float mark) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }



    public String getSubjectId() {
        return subjectId;
    }


    public float getMark() {
        return mark;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }


    public void setMark(float mark) {
        this.mark = mark;
    }

    
}
