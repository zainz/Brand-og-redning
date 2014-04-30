/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Firemen;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author Lars Radoor
 */
public class TimeLogDAL extends AbstractDAL {
    
    
    public void timeRegister(String date, Firemen f, int role, int type, boolean holiday, Time loginTime, Time logoutTime) throws SQLException{
        
        Connection con = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO midlertidig_løn (dato, brandmand, role, type_arbejde, ferie_dag, tid_logind, tid_logud) "
                            + "VALUES ('" + date + "', '" + f.getCpr() + "', " + role + ", " + type + ", " + holiday + ", " + loginTime + ", " + logoutTime + ")");
        } finally{
            if(con != null) con.close();
        }
    }
    
    public Firemen getFiremen() throws SQLException{
        
        Connection con = null;
        Firemen f = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM brandmand");
            while(rs.next()){
                String cprNo = rs.getString("cpr_no");
                String firstName = rs.getString("fornavn");
                String lastName = rs.getString("efternavn");
                String address = rs.getString("adresse");
                String phone = rs.getString("telefon");
                String callNo = rs.getString("udkaldsnummer");
                String paymentNo = rs.getString("løn_nummer");
                
                Firemen firemen = new Firemen(cprNo, firstName, lastName, address, phone, callNo, paymentNo);
                f = firemen;
            }
        } finally{
            if(con != null) con.close();
        }
        
        return f;
    }
}
