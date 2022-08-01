/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class Functions {
    
    public static void buildTableModel(ResultSet rs, JTable table)
        throws SQLException {
 
    
    DefaultTableModel dtm = (DefaultTableModel)table.getModel();
    if(rs == null){dtm.setRowCount(0); return;}
    ResultSetMetaData metaData = rs.getMetaData();
    
    int columnCount = metaData.getColumnCount();
    int num = 1;

    dtm.setRowCount(0);
    
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        
        vector.add(num);
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        num++;
        dtm.addRow(vector);
    }
    }
    
    public static void findAllBooks(JTable table) throws SQLException{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(LibraryManagementSystem.URL);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from books");
        Functions.buildTableModel(rs, table);
        stmt.close();
        con.close();
    }
}
