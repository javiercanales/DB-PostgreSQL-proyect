/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Consultas {
    public String consultaSQL;
    private final PostgreSQL database;
    
    public Consultas(PostgreSQL database){
        this.database = database;
        this.consultaSQL = null;
    }
    
    public ResultSet hacerConsulta(String script){
        consultaSQL = script;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            preparedStatement = database.getConnection().prepareStatement(consultaSQL);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return rs;
    }
    
    public void setConsultaSQL(String consultaSQL) {
        this.consultaSQL = consultaSQL;
    }
}
