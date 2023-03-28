/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AD
 */
public class StudentDAO extends MyDAO {

    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        xSql = "select * from Student";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            Student x;
            String studentID, studentName;
            int campusID;
            Date dob;
            boolean gender;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                studentName = rs.getString("studentName");
                dob = rs.getDate("Dob");
                campusID = rs.getInt("CampusID");
                gender = rs.getBoolean("gender");
                x = new Student(studentID, studentName, dob, gender, campusID);
                list.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Student getStudent(String studentID) {
        xSql = "select * from Student where StudentID = ?";
        Student x = null;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            rs = ps.executeQuery();
            String studentName;
            int campusID;
            Date dob;
            boolean gender;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                studentName = rs.getString("studentName");
                dob = rs.getDate("Dob");
                campusID = rs.getInt("CampusID");
                gender = rs.getBoolean("gender");
                x = new Student(studentID, studentName, dob, gender, campusID);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public void deleteStudent(String xRollno) {
        xSql = "delete from Student where StudentID=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xRollno);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteGrade(String xRollno) {
        xSql = "delete from Grade where StudentID=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xRollno);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(Student x) {
        xSql = "insert into Student values (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getStudentId());
            ps.setString(2, x.getName());
            ps.setBoolean(3, x.isGender());
            ps.setDate(4, (Date) x.getDob());
            ps.setInt(5, x.getCampusId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float gpaAll() {
        xSql = "select avg(tb1.Student_GPA) as gpa from\n"
                + "(select AVG(g.Mark) as [Student_GPA]from Student s inner join Grade g on s.StudentID = g.StudentID \n"
                + "Group by s.StudentID) as tb1";
        float gpa = 0;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            if (rs.next()) {
                gpa = rs.getFloat("gpa");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gpa;
    }

    public float getGpa(String studentID) {
        xSql = "select s.StudentID, AVG(g.Mark) as [Student_GPA]from Student s inner join Grade g on s.StudentID = g.StudentID \n"
                + "Group by s.StudentID having s.StudentID =?";
        float gpa = 0;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            rs = ps.executeQuery();
            if (rs.next()) {
                gpa = rs.getFloat("Student_GPA");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gpa;
    }

    public List<Student> getAllOrderByGpa() {
        List<Student> list = new ArrayList<>();
        xSql = "select s.StudentID, s.StudentName, s.gender, s.Dob, s.CampusID, \n"
                + "AVG(g.Mark) as [Student_GPA]from Student s inner join Grade g \n"
                + "on s.StudentID = g.StudentID\n"
                + "Group by s.StudentID,s.StudentName, s.gender, s.Dob, s.CampusID\n"
                + "Order by Student_GPA desc";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            Student x;
            String studentID, studentName;
            int campusID;
            Date dob;
            boolean gender;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                studentName = rs.getString("studentName");
                dob = rs.getDate("Dob");
                campusID = rs.getInt("CampusID");
                gender = rs.getBoolean("gender");
                x = new Student(studentID, studentName, dob, gender, campusID);
                list.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        StudentDAO s = new StudentDAO();
        List<Student> list = s.getAll();
        System.out.println(list.get(1).getName());
        Student st = s.getStudent("HE160001");
        System.out.println(st.getName());
    }
}
