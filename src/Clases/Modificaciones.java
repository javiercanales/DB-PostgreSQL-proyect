/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Modificaciones {
    public String updateSQL;
    private final PostgreSQL database;
    
    public Modificaciones(PostgreSQL database){
        this.database = database;
        this.updateSQL = null;
    }
    
    public void hacerModificacion(String script){
        updateSQL = script;
        PreparedStatement preparedStatement = null;
        
        try {
            
            preparedStatement = database.getConnection().prepareStatement(updateSQL);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito.");
            
            //database.getConnection().commit();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    public void setUpdateSQL(String updateSQL) {
        this.updateSQL = updateSQL;
    }
}
