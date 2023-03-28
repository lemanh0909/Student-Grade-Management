/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author AD
 */
public class StudentAccountDAO extends MyDAO {

    public StudentAccount getAccount(String studentId, String pass, int campId) {
        StudentAccount x = null;
        xSql = "Select s.StudentID, sa.password \n"
                + "from StudentAccount sa inner join Student s \n"
                + "on s.StudentID = sa.StudentID \n"
                + "where s.StudentID =? and s.CampusID=? and sa.[password] =?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentId);
            ps.setInt(2, campId);
            ps.setString(3, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                x = new StudentAccount(studentId, pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public static void main(String[] args) {
        StudentAccountDAO s = new StudentAccountDAO();
        StudentAccount list = s.getAccount("HE160001", "123", 3);
        System.out.println(list.getStudentId());
    }
}
