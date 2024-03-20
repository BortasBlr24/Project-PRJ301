/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Brand;

/**
 *
 * @author admin
 */
public class BrandDAO extends DBContext {
    
    public ArrayList<Brand> getAll() {
        PreparedStatement stm = null;
        ResultSet rs = null;
        ArrayList<Brand> brands = new ArrayList<>();
        String sql = "select * from [brand]";
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                brands.add(new Brand(id, name));
            }
            return brands;

        } catch (SQLException ex) {
            Logger.getLogger(BrandDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
