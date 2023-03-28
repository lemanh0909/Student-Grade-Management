/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class LectureAccountDAO extends MyDAO {

    public LectureAccount getAccount(String studentId, String pass, int campId) {
        LectureAccount x = null;
        xSql = "Select s.LectureID, sa.password \n"
                + "from LectureAccount sa inner join Lecture s \n"
                + "on s.LectureID = sa.LectureID \n"
                + "where s.LectureID =? and s.CampusID=? and sa.[password] =?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentId);
            ps.setInt(2, campId);
            ps.setString(3, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                x = new LectureAccount(studentId, pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public static void main(String[] args) {
        LectureAccountDAO s = new LectureAccountDAO();
        LectureAccount list = s.getAccount("HE160520", "09092002", 1);
        System.out.println(list.getLectureID());
    }
}
