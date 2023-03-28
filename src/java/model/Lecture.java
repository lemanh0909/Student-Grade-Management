/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class Lecture {
    private String LectureId;
    private String LectureName;
    private int campusID;

    public Lecture(String LectureId, String LectureName, int campusID) {
        this.LectureId = LectureId;
        this.LectureName = LectureName;
        this.campusID = campusID;
    }

    public String getLectureId() {
        return LectureId;
    }

    public String getLectureName() {
        return LectureName;
    }


    public int getCampusID() {
        return campusID;
    }

    public void setLectureId(String LectureId) {
        this.LectureId = LectureId;
    }

    public void setLectureName(String LectureName) {
        this.LectureName = LectureName;
    }

    public void setCampusID(int campusID) {
        this.campusID = campusID;
    }
    
    
}
