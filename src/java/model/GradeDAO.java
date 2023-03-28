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
public class GradeDAO extends MyDAO {

    public Grade getGrade(String studentID, String subjectID) {
        xSql = "select * from Grade where StudentID = ? AND SubjectID = ?";
        Grade x = null;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            ps.setString(2, subjectID);
            rs = ps.executeQuery();

            float mark;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                subjectID = rs.getString("SubjectID");
                mark = rs.getFloat("Mark");
                x = new Grade(studentID, subjectID, mark);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public List<Grade> getGrades(String studentID) {
        xSql = "select * from Grade where StudentID = ?";
        Grade x = null;
        List<Grade> list = new ArrayList<>();
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            rs = ps.executeQuery();
            String subjectID;
            float mark;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                subjectID = rs.getString("SubjectID");
                mark = rs.getFloat("Mark");
                x = new Grade(studentID, subjectID, mark);
                list.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public void update(Grade x) {
        xSql = "UPDATE Grade\n" +
"SET Mark= ?\n" +
"WHERE StudentID = ? And SubjectID=?;";
        try {
            ps = con.prepareStatement(xSql);
            ps.setFloat(1, x.getMark());
            ps.setString(2, x.getStudentId());
             ps.setString(3, x.getSubjectId());
            
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            public void deleteGrade(String studentID, String SubjectID) {
        xSql = "delete from Grade where StudentID=? AND SubjectID=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            ps.setString(2, SubjectID);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
                public Grade getSubject(String studentID, String subjectID) {
        xSql = "select * from Grade where StudentID = ? AND SubjectID = ?";
        Grade x = null;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, studentID);
            ps.setString(2, subjectID);
            rs = ps.executeQuery();

            float mark;
            while (rs.next()) {
                studentID = rs.getString("StudentID");
                subjectID = rs.getString("SubjectID");
                mark = rs.getFloat("Mark");
                x = new Grade(studentID, subjectID, mark);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
                  public void insert(Grade x) {
     xSql = "insert into Grade values (?,?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, x.getStudentId());
      ps.setString(2, x.getSubjectId());
      ps.setFloat(3, x.getMark());
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }
}
