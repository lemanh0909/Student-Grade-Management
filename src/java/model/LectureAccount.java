/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class LectureAccount {
    private String lectureID;
    private String password;

    public LectureAccount(String lectureID, String password) {
        this.lectureID = lectureID;
        this.password = password;
    }

    public String getLectureID() {
        return lectureID;
    }

    public String getPassword() {
        return password;
    }

    public void setLectureID(String lectureID) {
        this.lectureID = lectureID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
