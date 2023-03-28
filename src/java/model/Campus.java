/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class Campus {
    private int campusId;
    private String campusName;

    public Campus(int campusId, String campusName) {
        this.campusId = campusId;
        this.campusName = campusName;
    }

    public int getCampusId() {
        return campusId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }
    
}
