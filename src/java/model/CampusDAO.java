/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AD
 */
public class CampusDAO extends MyDAO{
      public Campus getCampusList(int xId) { 
   Campus t = null;
    xSql = "select * from Campus where CampusID =?";
    try {
      ps = con.prepareStatement(xSql);
      ps.setInt(1, xId);
      rs = ps.executeQuery();
       String xName;
      if(rs.next()) {
        xName = rs.getString("CampusName");  
        t = new Campus(xId,xName);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }
          public static void main(String[] args) {
        CampusDAO s = new CampusDAO();

    }
}
