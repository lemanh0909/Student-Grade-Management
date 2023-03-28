/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class StudentAccount {
    String studentId;
    String pass;

    public StudentAccount(String studentId, String pass) {
        this.studentId = studentId;
        this.pass = pass;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPass() {
        return pass;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
